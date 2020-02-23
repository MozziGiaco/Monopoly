import java.util.Scanner;

public abstract class Purchaseable extends Tile
	{
		protected String color;
		

		public Purchaseable(String n, String c, int p)
			{
				super(n, p);

			}

		public abstract void triggerPurchaseableEvent();
		
		

		

	}
