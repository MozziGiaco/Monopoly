import java.util.Scanner;

public class MonopolyCardsandDice
	{

		public static void dices()
		{
			Scanner userInput = new Scanner(System.in);

			int randomNumber1 = (int) (Math.random() *6 + 1);
			int randomNumber2 = (int) (Math.random() *6 + 1);
			
			System.out.println("Click enter to roll");
			String roll = userInput.nextLine();
			
			int dice1 = randomNumber1;
			int dice2 = randomNumber2; 
			int diceSum = dice1 + dice2;

			System.out.println(" You rolled: " + dice1 + " and " + dice2 + " For a total of " + diceSum + " Please roll again.");
		}
		public static void cards()
			{
				
			}

	}
