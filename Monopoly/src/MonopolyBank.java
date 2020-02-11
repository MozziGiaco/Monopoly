import java.util.Scanner;

import javax.swing.JOptionPane;

public class MonopolyBank
	{
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
