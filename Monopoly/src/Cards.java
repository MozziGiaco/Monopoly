
public class Cards {
	private String title ; 
	private String type ;
	private boolean holdOnto;
	private int moneyGain;
	private int moneyLost;
	public Cards (String t, String p, boolean h, int mG, int mL)
	{
		title = t;
		type = p;
		holdOnto = h;
		moneyGain = mG;
		moneyLost = mL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isHoldOnto() {
		return holdOnto;
	}
	public void setHoldOnto(boolean holdOnto) {
		this.holdOnto = holdOnto;
	}
	public int getMoneyGain() {
		return moneyGain;
	}
	public void setMoneyGain(int moneyGain) {
		this.moneyGain = moneyGain;
	}
	public int getMoneyLost() {
		return moneyLost;
	}
	public void setMoneyLost(int moneyLost) {
		this.moneyLost = moneyLost;
	}

	
}
