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
					    JOptionPane.showMessageDialog(frame, "You have landed on AURORA'S COTTAGE", null, JOptionPane.QUESTION_MESSAGE, cottage);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 3)
		    	{
		    		 ImageIcon sleepingBeautysCastle = new ImageIcon(("sleepingBeautysCastle.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on SLEEPING BEAUTY CASTLE", null, JOptionPane.QUESTION_MESSAGE, sleepingBeautysCastle);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 6)
		    	{
		    		 ImageIcon badlands = new ImageIcon(("badlands.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE BADLANDS", null, JOptionPane.QUESTION_MESSAGE, badlands);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 8)
		    	{
		    		 ImageIcon falls = new ImageIcon(("falls.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on HAKUNA MATATA FALLS", null, JOptionPane.QUESTION_MESSAGE, falls);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 9)
		    	{
		    		 ImageIcon prideRock = new ImageIcon(("prideRock.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on PRIDE ROCK", null, JOptionPane.QUESTION_MESSAGE, prideRock);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 11)
		    	{
		    		 ImageIcon snugglyDuckling = new ImageIcon(("snugglyDuckling.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE SNUGGLY DUCKLING", null, JOptionPane.QUESTION_MESSAGE, snugglyDuckling);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 13)
		    	{
		    		 ImageIcon tower = new ImageIcon(("tower.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on RAPUNZEL'S TOWER", null, JOptionPane.QUESTION_MESSAGE, tower);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 14)
		    	{
		    		 ImageIcon corona = new ImageIcon(("corona.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on CORONA CASTLE", null, JOptionPane.QUESTION_MESSAGE, corona);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 16)
		    	{
		    		 ImageIcon bog = new ImageIcon(("bog.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE BOG", null, JOptionPane.QUESTION_MESSAGE, bog);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 18)
		    	{
		    		 ImageIcon ferry = new ImageIcon(("ferry.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE FERRY", null, JOptionPane.QUESTION_MESSAGE, ferry);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 19)
		    	{
		    		 ImageIcon tiana = new ImageIcon(("tiana.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on TIANA'S PLACE", null, JOptionPane.QUESTION_MESSAGE, tiana);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 21)
		    	{
		    		 ImageIcon jungle = new ImageIcon(("jungle.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE JUNGLE", null, JOptionPane.QUESTION_MESSAGE, jungle);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 23)
		    	{
		    		 ImageIcon pacha = new ImageIcon(("pacha.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on PACHA'S VILLAGE", null, JOptionPane.QUESTION_MESSAGE, pacha);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 24)
		    	{
		    		 ImageIcon kuzco = new ImageIcon(("kuzco.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on KUZCO'S PALACE", null, JOptionPane.QUESTION_MESSAGE, kuzco);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 26)
		    	{
		    		 ImageIcon belleVillage = new ImageIcon(("belleVillage.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on BELLE'S VILLAGE", null, JOptionPane.QUESTION_MESSAGE, belleVillage);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 27)
		    	{
		    		 ImageIcon woods = new ImageIcon(("woods.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on WOLVES' WOODS", null, JOptionPane.QUESTION_MESSAGE, woods);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 29)
		    	{
		    		 ImageIcon beast = new ImageIcon(("beast.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on THE BEAST'S CASTLE", null, JOptionPane.QUESTION_MESSAGE, beast);
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 31)
		    	{
		    		 ImageIcon lair = new ImageIcon(("lair.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on URSULA'S LAIR", null, JOptionPane.QUESTION_MESSAGE, lair);
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 32)
		    	{
		    		 ImageIcon ship = new ImageIcon(("ship.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on ERIC'S SHIP", null, JOptionPane.QUESTION_MESSAGE, ship);
		    	
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 34)
		    	{
		    		 ImageIcon tritonKingdom = new ImageIcon(("tritonKingdom.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on TRITON'S KINGDOM", null, JOptionPane.QUESTION_MESSAGE, tritonKingdom);
		    	
		    	}
			if (players.index + MonopolyCardsandDice.diceSum == 37)
		    	{
		    		 ImageIcon thebes = new ImageIcon(("thebes.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on TRITON'S KINGDOM", null, JOptionPane.QUESTION_MESSAGE, thebes);
		    	
		    	}
			
			if (players.index + MonopolyCardsandDice.diceSum == 39)
		    	{
		    		 ImageIcon olympus = new ImageIcon(("olympus.jpg"));
					    JOptionPane.showMessageDialog(frame, "You have landed on TRITON'S KINGDOM", null, JOptionPane.QUESTION_MESSAGE, olympus);
		    	
		    	}
			
			
			if (players.index + MonopolyCardsandDice.diceSum == 10 || players.index + MonopolyCardsandDice.diceSum == 30)
		    	{
		    		 ImageIcon dungeon = new ImageIcon(("dungeon.jpg"));
					    JOptionPane.showMessageDialog(frame, "Welcome to the DUNGEON", null, JOptionPane.QUESTION_MESSAGE, dungeon);
		    	}
			
			
			
			
		}
}