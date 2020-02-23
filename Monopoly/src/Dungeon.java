import java.util.Scanner;

public class Dungeon extends Event
	{

		public Dungeon(String name)
			{
				super(name);

			}

		@Override
		public void triggerEvent()
			{
				MonopolyBank.visitingDungeon();
			}
//go to MonopolyBank class
		

	}