import java.util.Scanner;

public abstract class Purchaseable extends Tile
	{
		protected String color;
		static Scanner intInput = new Scanner(System.in);
		static int choice;

		public Purchaseable(String n, String c, int p)
			{
				super(n, p);

			}

		public abstract void triggerPurchaseableEvent();

		public void landOnProperty()
			{
				choice = intInput.nextInt();
				System.out.println("Would you like to buy " + name + "?");

				System.out.println("(1) Yes");
				System.out.println("(2) No");

				if (choice == 1)
					{
						System.out.println("You have chosen to purchase " + name + ".");
						MonopolyBank.playName.get(0).setMoney(
								MonopolyBank.playName.get(0).getMoney() - MonopolyBoard.board[players.index].price);

					}

			}

	}
