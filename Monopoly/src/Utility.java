import java.util.Scanner;

public class Utility extends Purchaseable
	{
		static Scanner intInput = new Scanner(System.in);
		static int choice3;

		public Utility(String n, String c, int p)
			{
				super(n, c, p);
// TODO Auto-generated constructor stub
			}

		public static void landOnUtility()
			{
				choice3 = intInput.nextInt();
				System.out.println("Would you like to buy " + players.index + "?");

				System.out.println("(1) Yes");
				System.out.println("(2) No");

				if (choice3 == 1)
					{
						System.out.println("You have chosen to purchase " + players.index + ".");
						MonopolyBank.playName.get(0).setMoney(
								MonopolyBank.playName.get(0).getMoney() - MonopolyRunner.board[players.index].price);

					} else if (choice3 == 2)
					{
						System.out.println("You chose not to purchase the Utility, please roll again!");
					}

			}

	}