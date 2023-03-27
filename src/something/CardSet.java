package something;

public enum CardSet {
	SPADES("spades"), HEARTS("hearts"), DIMONDS("diamonds"), CLUBS("clubs"), ACE("ace"), KING("king"), QUEEN("queen"),
	JOKER("joker");

	private String card;

	CardSet(String card) {
		this.card = card;
	}
	
	public String getCard() {
		return this.card;
	}

}
