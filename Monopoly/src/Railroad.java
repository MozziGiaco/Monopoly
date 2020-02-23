import java.util.Scanner;

public class Railroad extends Purchaseable
{
	static Scanner intInput = new Scanner(System.in);
	static int choice2;
	
public Railroad(String n, String c, int p)
{
super(n, c, p);
// TODO Auto-generated constructor stub
}

@Override
public void triggerPurchaseableEvent()
	{
		// TODO Auto-generated method stub
		
	}
public void landOnRailroad()
{
	choice2 = intInput.nextInt();
	System.out.println("Would you like to buy " + name + "?");

	System.out.println("(1) Yes");
	System.out.println("(2) No");

	if (choice2 == 1)
		{
			System.out.println("You have chosen to purchase " + name + ".");
			MonopolyBank.playName.get(0).setMoney(
					MonopolyBank.playName.get(0).getMoney() - MonopolyRunner.board[players.index].price);

		}

}

}