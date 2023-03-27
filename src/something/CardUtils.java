package something;

public class CardUtils {

	public static String getCardNumber(String cardType, int cardNumber) {
		switch (cardNumber) {
		case 0:
			return "one of " + cardType;
		case 1:
			return "two of " + cardType;
		case 2:
			return "three of " + cardType;
		case 3:
			return "four of " + cardType;
		case 4:
			return "five of " + cardType;
		case 5:
			return "six of " + cardType;
		case 6:
			return "seven of " + cardType;
		case 7:
			return "eight of " + cardType;
		case 8:
			return "nine of " + cardType;
		case 9:
			return "ten of " + cardType;
		}
		;
		return null;
	}

	public static String getCardType(int cardType) {
		switch (cardType) {
		case 0:
			return CardSet.CLUBS.toString();
		case 1:
			return CardSet.DIMONDS.toString();
		case 2:
			return CardSet.HEARTS.toString();
		case 3:
			return CardSet.SPADES.toString();
		}
		return null;
	}
}
