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
				System.out.println(" You rolled: " + diceA + " and " + diceB + " For a total of " + diceSum );

			}
		public static void chanceCardsDeck()
		{
			ArrayList<Cards> chance = new ArrayList<Cards>();
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			chance.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
			
		}
		public static void comunnityChestCardsDeck()
			{
				ArrayList<Cards> comunnityChest = new ArrayList<Cards>();
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				comunnityChest.add(new Cards ("Chance Card" , "Get out Of Jail Free" ,true ,0 ,0));
				
			}
	}
