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
				visitingDungeon();
			}

		public void visitingDungeon()
			{
				if (players.index == 10)
					{
						System.out.println("Haha sucker you have to go pay a visit to the DUNGEON!"
								+ "n/ and 1 of your turns were skip");
						System.out.println(MonopolyBank.playName.get(0).getName() + " is now on tile 5.");
						landOn();
					}
			}
		public void inDungeon()
			{
				if(players.index == 30)
					{
						System.out.println("You are now in the dungeon, " + MonopolyBank.playName.get(0).getName());
						System.out.println("You either have to pay $200 or lose three turns.");
						System.out.println("What is your choice..." + MonopolyBank.playName.get(0).getName()
								+ "n/ 1) Pay $200"
								+ "n/ 2) Lose Three Turns");
						
						Scanner dungeon = new Scanner(System.in);
						if(dungeon == 1)
							{
								
							}
					}
			}

	}