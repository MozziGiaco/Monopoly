import java.util.Scanner;

public class Property extends Purchaseable
	{
		static Scanner intInput = new Scanner(System.in);
		static int choice;

		public Property(String n, String c, int p)
			{
				super(n, c, p);
			}

		public static void landOnProperty()
			{
				choice = intInput.nextInt();
				System.out.println("Would you like to buy " + players.index + "?");

				System.out.println("(1) Yes");
				System.out.println("(2) No");

				if (choice == 1)
					{
						System.out.println("You have chosen to purchase " + players.index + ".");
						MonopolyBank.playName.get(0).setMoney(
								MonopolyBank.playName.get(0).getMoney() - MonopolyRunner.board[players.index].price);

					} else if (choice == 2)
					{
						System.out.println("You chose not to buy the Property, roll again!");

						players.index += MonopolyCardsandDice.diceSum;
					}
				MonopolyCardsandDice.CheckMoneyLevel();
				MonopolyCardsandDice.rollDice();
				
			}

	}
