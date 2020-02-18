import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class MonopolyPlay 
{
	
	static JFrame frame = new JFrame();
	
	static void locationPics()
		{
			if (players.index + MonopolyCardsandDice.diceSum == 1)
		    	{
		    		 ImageIcon cottage = new ImageIcon(("cottage.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on AURORA'S COTTAGE (PURPLE) PRICE: $60", null, JOptionPane.QUESTION_MESSAGE, cottage);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 3)
		    	{
		    		 ImageIcon sleepingBeautysCastle = new ImageIcon(("sleepingBeautysCastle.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on SLEEPING BEAUTY CASTLE (PURPLE) PRICE: $60", null, JOptionPane.QUESTION_MESSAGE, sleepingBeautysCastle);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 6)
		    	{
		    		 ImageIcon badlands = new ImageIcon(("badlands.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE BADLANDS (LIGHT BLUE) PRICE: $100", null, JOptionPane.QUESTION_MESSAGE, badlands);
		    	}
		}
}