package something;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {

	private String id;
	private List<String> flop = new ArrayList<>();
	private String turn;
	private String river;
	private int pot;
	
	public House(List<String> flop, int pot) {
		this.flop = flop;
		this.pot = pot;
	}

	public House() {
	}

	public List<String> getFlop() {
		return flop;
	}

	public void setFlop(List<String> flop) {
		this.flop = flop;
	}

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}
	
}
