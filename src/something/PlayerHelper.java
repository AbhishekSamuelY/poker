package something;

import java.util.ArrayList;
import java.util.List;

public class PlayerHelper {

	private Player head = null;
	private Player tail = null;

	public void addPlayer(String playerName) {
		Player player = new Player();
		player.setName(playerName);

		if (head == null) {
			head = player;
		} else {
			tail.nextPlayer = player;
		}

		tail = player;
		tail.nextPlayer = head;
	}

	public void viewPlayers() {
		Player player = head;

		if (head != null) {
			do {
				System.out.print(player.getName()+": "+player.getCards().get(0)+", "+player.getCards().get(1));
				System.out.println();
				player = player.nextPlayer;
			} while (player != head);
		}
	}
	
	public List<Player> getAllPlayers() {
		Player player = head;
		List<Player> players = new ArrayList<>();

		if (head != null) {
			do {
				players.add(player);
				player = player.nextPlayer;
			} while (player != head);
		}
		return players;
	}
	
	public Player viewPlayer(String playerName) {
		Player player = head;

		if (head != null) {
			do {
				if(player.getName().equalsIgnoreCase(playerName)) {
					return player;
				}
				player = player.nextPlayer;
			} while (player != head);
		}
		return null;
	}
	
	public void assignCardsToPlayers(String playerName, List<String> cards) {
		Player player = head;

		if (head != null) {
			do {
				if(player.getName().equalsIgnoreCase(playerName)) {
					player.getCards().addAll(cards);
				}
				player = player.nextPlayer;
			} while (player != head);
		}
	}
}
