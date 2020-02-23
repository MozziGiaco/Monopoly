import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyCardsandDice
	{
		static boolean playing = true;
		static boolean checkMoneyLevel = true;
		
		static int randomNumber1;
		static int randomNumber2;
		static int randomNumber3;
		static int randomNumber4;
		static int randomNumber5;
		static int randomNumber6;
		static int randomNumber7;
		static int randomNumber8;
		static int randomNumber9;
		static int randomNumber10;
		static int randomNumber11;
		static int randomNumber12;
		static int randomNumber13;
		static int randomNumber14;
		static int randomNumber15;
		static int randomNumber16;
		static int randomNumber17;
		static int randomNumber18;
		static int randomNumber19;
		static int randomNumber20;
		
		static int diceA;
		static int diceB;
		static int diceC;
		static int diceD;
		static int diceE;
		static int diceF;
		static int diceG;
		static int diceH;
		static int diceI;
		static int diceJ;
		static int diceK;
		static int diceL;
		static int diceM;
		static int diceN;
		static int diceO;
		static int diceP;
		static int diceQ;
		static int diceR;
		static int diceS;
		static int diceT;
		
		static int diceSum;
		static int diceSum2;
		static int diceSum3;
		static int diceSum4;
		static int diceSum5;
		static int diceSum6;
		static int diceSum7;
		static int diceSum8;
		static int diceSum9;
		static int diceSum10;
		
		static String roll;
		static String roll2;
		static String roll3;
		static String roll4;
		static String roll5;
		static String roll6;
		static String roll7;
		static String roll8;
		static String roll9;
		static String roll10;
		static Scanner userInput = new Scanner(System.in);

		
		public static void rollDice()
			{

				randomNumber1 = (int) (Math.random() * 6 + 1);
				randomNumber2 = (int) (Math.random() * 6 + 1);
				randomNumber3 = (int) (Math.random() * 6 + 1);
				randomNumber4 = (int) (Math.random() * 6 + 1);
				randomNumber5 = (int) (Math.random() * 6 + 1);
				randomNumber6 = (int) (Math.random() * 6 + 1);
				randomNumber7 = (int) (Math.random() * 6 + 1);
				randomNumber8 = (int) (Math.random() * 6 + 1);
				randomNumber9 = (int) (Math.random() * 6 + 1);
				randomNumber10 = (int) (Math.random() * 6 + 1);
				randomNumber11 = (int) (Math.random() * 6 + 1);
				randomNumber12 = (int) (Math.random() * 6 + 1);
				randomNumber13 = (int) (Math.random() * 6 + 1);
				randomNumber14 = (int) (Math.random() * 6 + 1);
				randomNumber15 = (int) (Math.random() * 6 + 1);
				randomNumber16 = (int) (Math.random() * 6 + 1);
				randomNumber17 = (int) (Math.random() * 6 + 1);
				randomNumber18 = (int) (Math.random() * 6 + 1);
				randomNumber19 = (int) (Math.random() * 6 + 1);
				randomNumber20 = (int) (Math.random() * 6 + 1);
				
				diceA = randomNumber1;
				diceB = randomNumber2;
				diceSum = diceA + diceB;
				
				diceC = randomNumber3;
				diceD = randomNumber4;
				diceSum2 = diceC + diceD;
				
				diceE = randomNumber5;
				diceF = randomNumber6;
				diceSum3= diceE + diceF;
				
				diceG = randomNumber7;
				diceH = randomNumber8;
				diceSum4 = diceG + diceH;
				
				diceI = randomNumber9;
				diceJ = randomNumber10;
				diceSum5 = diceI + diceJ;
				
				diceK = randomNumber11;
				diceL = randomNumber12;
				diceSum6 = diceI + diceJ;
				
				diceM = randomNumber13;
				diceN = randomNumber14;
				diceSum7 = diceI + diceJ;
				
				diceO = randomNumber15;
				diceP = randomNumber16;
				diceSum8 = diceI + diceJ;
				
				diceQ = randomNumber17;
				diceR = randomNumber18;
				diceSum9 = diceI + diceJ;
				
				diceS = randomNumber19;
				diceT = randomNumber20;
				diceSum10 = diceS + diceT;
				
			while(playing)
				{
					while(checkMoneyLevel)
						{
							if(players.money == 5000.0)
								{
									System.out.println("YAY! " + MonopolyBank.playName + ". You just won Disney Monopoly!!");
									checkMoneyLevel = false;
								}
							
							if(players.money == 00.0)
								{
									System.out.println("Ooops looks like you are out of money meaning you are..."
											+ "\n "
											+ "\n BANKROUPT!!"
											+ "\n ");
									checkMoneyLevel = false;
								}
							else if(players.money != 00.0 || players.money != 5000.0)
								{
									playing = true;
								}
					if(players.index >= 0 && players.index <= 38)
						{
				//1
							System.out.println("Click enter to roll");
							roll = userInput.nextLine();
							System.out.println("You rolled: " + diceA + " and " + diceB + " for a total of " + diceSum);
							MonopolyBank.playName.get(0).setIndex(diceSum);
							MonopolyPlay.locationPics();
				//2
							System.out.println("Click enter to roll again");
							roll2 = userInput.nextLine();
							System.out.println("You rolled: " + diceC + " and " + diceD + " for a total of " + diceSum2);
							MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2);
							MonopolyPlay.locationPics();
				//3
							System.out.println("Click enter to roll again");
							roll3 = userInput.nextLine();
							System.out.println("You rolled: " + diceE + " and " + diceF + " for a total of " + diceSum3);
							MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3);
							MonopolyPlay.locationPics();
				//4
							System.out.println("Click enter to roll again");
							roll4 = userInput.nextLine();
							System.out.println("You rolled: " + diceG + " and " + diceH + " for a total of " + diceSum4);
							MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3 + diceSum4);
							MonopolyPlay.locationPics();
				//5
							System.out.println("Click enter to roll again");
							roll5 = userInput.nextLine();
							System.out.println("You rolled: " + diceI + " and " + diceJ + " for a total of " + diceSum5);
							MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3 + diceSum4 + diceSum5);
							MonopolyPlay.locationPics();
						}
					
					else if(players.index >= 39)
						{
							playing = false;
							MonopolyCardsandDice.GoTriggerEvent();
							
						}
					}
				
						
				}
				
			

			}

		public static void GoTriggerEvent()
			{
				if (players.index + MonopolyCardsandDice.diceSum == 0)
					{
						System.out.println("You have passed GO! So you get $200 added to your bank account." );
						players.money += 200.0;
					}

			}

		public static void chanceCardsDeck()
			{
				ArrayList<Cards> chance = new ArrayList<Cards>();
				chance.add(new Cards("Chance Card", "Get out Of Jail Free", true, 0, 0));
				chance.add(new Cards("Chance Card", "Pay taxes", false, 0, 150));
				chance.add(new Cards("Chance Card", "Go to Jail", false, 0, 0));
				chance.add(new Cards("Chance Card", "You are assessed for street repair", false, 0, 50));
				chance.add(new Cards("Chance Card", "You inherit a will", false, 200, 0));
				chance.add(new Cards("Chance Card", "Advance to go", false, 0, 0));

			}

		public static void comunnityChestCardsDeck()
			{
				ArrayList<Cards> comunnityChest = new ArrayList<Cards>();
				comunnityChest.add(new Cards("Community Chest Card", "Get out Of Jail Free", true, 0, 0));
				comunnityChest
						.add(new Cards("Community Chest Card", "Advance to Sleeping Beauty's Castle", false, 0, 0));
				comunnityChest.add(new Cards("Community Chest Card", "Go to Jail", false, 0, 0));
				comunnityChest.add(new Cards("Community Chest Card", "go back 3 steps", false, 0, 0));
				comunnityChest
						.add(new Cards("Community Chest Card", "Banck pays you a dividend of 100", false, 100, 0));
				comunnityChest.add(new Cards("Community Chest Card", "Advance to Go", false, 0, 0));

			}

	}
