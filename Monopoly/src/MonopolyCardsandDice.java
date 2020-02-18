import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyCardsandDice
	{

	static int randomNumber1;
	static int randomNumber2;
	static int diceA;
	static int diceB;
	static int diceSum;
		public static void dice()
			{
				Scanner userInput = new Scanner(System.in);
				 randomNumber1 = (int) (Math.random() *6 + 1);
				 randomNumber2 = (int) (Math.random() *6 + 1);
			
				System.out.println("Click enter to roll");
				String roll = userInput.nextLine(); 

				 diceA = randomNumber1; 
				 diceB = randomNumber2; 
				 diceSum = diceA + diceB;
				System.out.println(" You rolled: " + diceA + " and " + diceB + " For a total of " + diceSum + " Please roll again.");
//test
			}
		public static void chanceCardsDeck()
		{
			//ArrayList<Cards> Card = new ArrayList<Cards>();
		//	Card.add("Get out of jail free card");
			//Card.add("Get out of jail free card");
			//Card.add("Get out of jail free card");
			//Card.add("Get out of jail free card");
			//Card.add("Get out of jail free card");
			//Card.add("Get out of jail free card");

			
		}
		public static void comunnityChestCardsDeck()
			{
				//ArrayList<communityChest> comunnityChestCard = new ArrayList<communityChest>();
				
				
			}
	}
