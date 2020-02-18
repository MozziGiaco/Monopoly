
public class communityChestCards {
	private String title ; 
	private String type ;
	private boolean holdOnto;
	private int moneyGain;
	private int moneyLost;
	public void communityChest(String t1 , String p1, boolean h1, int mG1, int mL1)
	{
		title = t1;
		type = p1;
		holdOnto = h1;
		moneyGain = mG1;
		moneyLost = mL1;
	}
}
