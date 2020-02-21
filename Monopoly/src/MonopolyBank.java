import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class MonopolyBank
	{
	static ArrayList <players> playName = new ArrayList <players>();
	  public static void bankerIntro()
				{
					//introduction to the banker
					System.out.println("Mother Gothel is the Banker and Auctioneer.");
					System.out.println("She will manage the funds in this game without actually being an active player.");
					//end of banker introduction 
					
					//bank function intro
					System.out.println("The bank has many functions.");
					System.out.println("In this game, Mother Gothel holds title deeds, along with houses and hotels before they are bought by the players.");
					System.out.println("She will pay your salaries and bonuses. Along with auction off properties and hands out the proper Title Deed cards when bought.");
					System.out.println("Along with selling houses, hotels, and managing loans for mortagags. Mother Gothel ");
					System.out.println("collects all taxes, fines, loans, and interest. She will never go bankrupt (no pun intended).");
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
				}
			
			public static void choosePlayer()
				{
					System.out.println("Player 1, who you want to be? Your choises are:"
							+ "n/ 1) Scar"
							+ "n/ 2) Hades"
							+ "n/ 3) Ysma"
							+ "n/ 4) Ursula");
					
					
					playName.add(new players(1500.00, "Scar", 0));
					playName.add(new players(1500.00, "Hades", 0));
					playName.add(new players(1500.00, "Ysma", 0));
					playName.add(new players(1500.00, "Ursula", 0));
					
				}
						
							
					//Selling Property Code
						// when player lands on square ask whether to buy or not
						//if yes then ask if they want to by a house or a hotel
							// then give then said house or hotel will taking the money
					//Paying Rent Code
					//Jail Payment
					//Bankruptcy	
				
			
			public static void incomeTax()
				{
					
				}
			
		}
