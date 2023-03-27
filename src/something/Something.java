package something;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Something {

	public static List<String> cards;
	static House house;
	static PlayerHelper playerHelper;
	
	public static void main(String[] args) {
		cards = new ArrayList<>();
		house = new House();
		playerHelper = new PlayerHelper();
		initilize();
		play();
	}

	private static void play() {
		assignCardsToPlayers();
		playerHelper.viewPlayers();
		buildFlop();
		CardPrintHelper.printBridge(house.getFlop());
	}

	
	private static void buildFlop() {
		int counter = 0;
		List<String> flop = new ArrayList<>();
		flop.add(cards.get(counter));
		cards.remove(0);
		flop.add(cards.get(counter));
		cards.remove(0);
		flop.add(cards.get(counter));
		cards.remove(0);
		house.getFlop().addAll(flop);
	}

	private static void assignCardsToPlayers() {
		int counter = 0;
		List<Player> players = playerHelper.getAllPlayers();
		for (Player player : players) {
			List<String> playerCards = new ArrayList<>();
			playerCards.add(cards.get(counter));
			cards.remove(counter);
			counter++;
			playerCards.add(cards.get(counter));
			cards.remove(counter);
			counter++;
			playerHelper.assignCardsToPlayers(player.getName(),playerCards);
		}

	}

	private static void initilize() {
		initilizeCards();
		initilizePlayers();
	}

	private static void initilizePlayers() {
		System.out.println("Enter number of players:");
		Scanner scanner = new Scanner(System.in);
		int numberOfPlayers = scanner.nextInt();

		for (int i = 0; i < numberOfPlayers; i++) {
			scanner = new Scanner(System.in);
			System.out.println("enter name of the player");

			String playerName = scanner.nextLine();
			playerHelper.addPlayer(playerName);
		}
	}
	
	private static void initilizeCards() {
		stackCards();
		Collections.shuffle(cards);
	}

	private static void stackCards() {
		int cardTypes = 4;
		String cardType = null;
		for (int i = 0; i < cardTypes; i++) {
			cardType = CardUtils.getCardType(i);
			for (int j = 0; j < 10; j++) {
				cards.add(CardUtils.getCardNumber(cardType, j));
			}
			
			cards.add("jack of " + cardType);
			cards.add("queen of " + cardType);
			cards.add("king of " + cardType);
		}
	}

	

}
