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
		if(players.index == 10)
			{
				System.out.println("Haha sucker you have to go pay a visit to the DUNGEON!"
						+ "n/ and skip your next turn");
			}
	}

}