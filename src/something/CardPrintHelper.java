package something;

import java.util.List;

public class CardPrintHelper {
	
	private static void printCards(List<String> cards) {
		for (String card : cards) {
			System.out.println(card);
		}

	}
	
	/*
	 * public static void printPlayersWithCards(List<Player> players) { for (Player
	 * player : players) { List<String> cards = player.getCards();
	 * System.out.println(player.getName()+": "+cards.get(0)+", "+cards.get(1)); } }
	 */

	public static void printBridge(List<String> bridge) {
		System.out.println("flop:");
		for(String card : bridge) {
			System.out.print(card+", ");
		}
		System.out.println();
	}

}
