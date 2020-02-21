public class Go extends Event
{

public Go(String name)
{
super(name);
name = "Go";

}

@Override
public void triggerEvent()
{
	if (players.index + MonopolyCardsandDice.diceSum == 0)
    	{
    		players.money += 200.0;
    	}
	
}

}