package something;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

	private String id;
	private String name;
	private List<String> cards = new ArrayList<>();
	private Map<String, Integer> chips = new HashMap<>();
	private boolean isBlind;
	Player nextPlayer;

	public Player() {
	}

	public Player(String name, List<String> cards, Map<String, Integer> chips, boolean isBlind, Player nextPlayer) {
		this.name = name;
		this.cards = cards;
		this.chips = chips;
		this.isBlind = isBlind;
		this.nextPlayer = nextPlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCards() {
		return cards;
	}

	public void setCards(List<String> cards) {
		this.cards = cards;
	}

	public Map<String, Integer> getChips() {
		return chips;
	}

	public void setChips(Map<String, Integer> chips) {
		this.chips = chips;
	}

	public boolean isBlind() {
		return isBlind;
	}

	public void setBlind(boolean isBlind) {
		this.isBlind = isBlind;
	}

}
