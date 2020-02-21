import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MonopolyBank
	{
	  public static void bankerIntro()
				{
					//introduction to the banker
					System.out.println("Mother Gothel is the Banker and Auctioneer.");
					System.out.println("She will manages the funds in this game, without, actually being an active player.");
					//end of banker introduction 
					
					//bank function intro
					System.out.println("The bank has many functions.");
					System.out.println("In this game the Mother Gothel holds title deeds, along with houses and hotels before they are bought by the players.");
					System.out.println("She will pay your salaries and bonuses. Along with auction off properties and hands out the proper Title Deed cards when bought.");
					System.out.println("Along with selling houses, hotels, and manages loans for mortagags. Mother Gothal ");
					System.out.println("collets all taxes, fines, loans, and intrest. She will never go bankrupted (no pun intended).");
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
						
						ArrayList <players> startingAmount = new ArrayList <players>();
							startingAmount.add(new players(1500.00, "Scar", 0));
							startingAmount.add(new players(1500.00, "Hades", 0));
							startingAmount.add(new players(1500.00, "Ysma", 0));
							startingAmount.add(new players(1500.00, "Ursula", 0));
							startingAmount.add(new players(1500.00, "Dr. Facilier", 0));
							startingAmount.add(new players(1500.00, "Gaston", 0));
							startingAmount.add(new players(1500.00, "Maleficent", 0));
							
					//Selling Property Code
						// when player lands on square ask whether to buy or not
						//if yes then ask if they want to by a house or a hotel
							// then give then said house or hotel will taking the money
					//Paying Rent Code
					//Jail Payment
					//Bankruptcy	
				}
			
			public static void incomeTax()
				{
					
				}
			
		}
