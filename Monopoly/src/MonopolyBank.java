import java.util.Scanner;

import javax.swing.JOptionPane;

public class MonopolyBank
	{

	  public static void bankerIntro()
				{
					//introduction to the banker
					System.out.println("Your device is the Banker and Auctioneer.");
					System.out.println("Your device will manages the funds in this game, without, actually being an active player.");
					//end of banker introduction 
					
					//bank function intro
					System.out.println("The bank has many functions.");
					System.out.println("In this game the bank holds title deeds, along with houses and hotels before they are bought by the players.");
					System.out.println("The bank will pay your salaries and bonuses. It can also auction off properties and hands out the proper Title Deed cards when bought.");
					System.out.println("Along with selling houses, hotels, and manages loans for mortagags. The bank ");
					System.out.println("collets all taxes, fines, loans, and intrest. The bank will never go bankrupted (no pun intended).");
					//end of bank function intro
				}
			public static void bankMath()
				{
					//Starting amount 
						System.out.println("Each player starts out with $1500");
						System.out.println(" 2 $500s"
								+ "\n 2 $100s"
								+ "\n 2 $50s"
								+ "\n 6 $20s"
								+ "\n 5 $10s"
								+ "\n 5 $5s"
								+ "\n 5 $1s");
					//Income Tax Code
					//Selling Property Code
					//Paying Rent Code
					//Jail Payment
					//Hotel code
					//Bankruptcy
						
					
				}
			
		}

		static int understanding;
		public static void banker()
			{
				
				System.out.println("For the sake of easier understanding your device is the banker. If you understand that enter 1 if you do not enter 2");
				Scanner playerChoice = new Scanner(System.in);
				understanding = playerChoice.nextInt();
				
				if(understanding == 1)
					{
						System.out.println("Great! Lets move right along.");
					}
				else if(understanding == 2)
					{
						System.out.println("Okay, so no person playing this game can be the banker. Your computer, phone, ipad, or whatever will be the banker.");
					}
			}

	}
