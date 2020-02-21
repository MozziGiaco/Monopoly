import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class MonopolyBank
	{
		static Scanner playerChoose = new Scanner(System.in);
		static int player1Choice;
		//static int player2Choice;
		static ArrayList <players> playName = new ArrayList <players>();
		static String playerName;
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

					System.out.println("Player 1 who do you want to be? Your choises are:"

					System.out.println("Player 1, who you want to be? Your choises are:"

							+ "n/ 1) Scar"
							+ "n/ 2) Hades"
							+ "n/ 3) Ysma"
							+ "n/ or"
							+ "n/ 4) Ursula");
					player1Choice = playerChoose.nextInt(); 
						if(player1Choice == 1)
							{
								playerName = playName.get(0).setName("Scar");
								System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
								System.out.println("You will now be known as Scar.");
								System.out.println( );
								System.out.println("Now player 2 who do you want to be? Your choises are:"
										+ "n/ 1) Hades"
										+ "n/ 2) Ysma"
										+ "or "
										+ "n/ 3) Ursula");
								
								//player2Choice = playerChoose.nextInt(); 
									//if(player2Choice == 1)
										//{
											//System.out.println("How do you kill a god? The one question Hades is still asking.");
											//System.out.println("You will now be known as Hades.");

										//}
									//else if(player2Choice == 2)
										//{
											//System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of postions Ysma.");
											//System.out.println("You will now be known as Ysma.");

										//}
								//	else if(player2Choice == 3)
											//{
												//System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
												//System.out.println("You will now be known as Ursula.");

										//	}
								
							}
						
						if(player1Choice == 2)
							{
								System.out.println("How do you kill a god? The one question Hades is still asking.");
								System.out.println("You will now be known as Hades.");
								System.out.println( );
								//System.out.println("Now player 2 who do you want to be? Your choises are:"
									//	+ "n/ 1) Scar"
									//	+ "n/ 2) Ysma"
									//	+ "or "
									//	+ "n/ 3) Ursula");
								//player2Choice = playerChoose.nextInt(); 
									//if(player2Choice == 1)
										//{
											//System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
											//System.out.println("You will now be known as Scar.");

										//}
									//else if(player2Choice == 2)
										//{
											//System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of postions Ysma.");
											//System.out.println("You will now be known as Ysma.");

										//}
									//else if(player2Choice == 3)
											//{
											//	System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
											//	System.out.println("You will now be known as Ursula.");

										//	}
								
							}
						
						if(player1Choice == 3)
								{
									System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of postions Ysma.");
									System.out.println("You will now be known as Ysma.");
									System.out.println( );
									//System.out.println("Now player 2 who do you want to be? Your choises are:"
											//+ "n/ 1) Scar"
											//+ "n/ 2) Hades"
											//+ "or "
											//+ "n/ 3) Ursula");
									//player2Choice = playerChoose.nextInt(); 
									//	if(player2Choice == 1)
									//		{
								//				System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
								//				System.out.println("You will now be known as Scar.");

								//			}
									//	else if(player2Choice == 2)
								//			{
									//			System.out.println("How do you kill a god? The one question Hades is still asking.");
								//				System.out.println("You will now be known as Hades.");

								//			}
								//		else if(player2Choice == 3)
								//				{
								//					System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
								//					System.out.println("You will now be known as Ursula.");

								//				}
									
								}
						
							if(player1Choice == 4)
									{
										System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
										System.out.println("You will now be known as Ursula.");
										System.out.println( );
										//System.out.println("Now player 2 who do you want to be? Your choises are:"
										//		+ "n/ 1) Scar"
										//		+ "n/ 2) Hades"
									//			+ "or "
										//		+ "n/ 3) Ysma");
									//	player2Choice = playerChoose.nextInt(); 
									//		if(player2Choice == 1)
									//			{
									//				System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
									//				System.out.println("You will now be known as Scar.");

									//			}
									//		else if(player2Choice == 2)
									//			{
									//				System.out.println("How do you kill a god? The one question Hades is still asking.");
									//				System.out.println("You will now be known as Hades.");

									//			}
									//		else if(player2Choice == 3)
									//				{
									//					System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of postions Ysma.");
									//					System.out.println("You will now be known as Ysma.");

									//				}
										
									}
					
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
					//Bankruptcy	yes
				
			
			public static void incomeTax()
				{
					
				}
			
		}
