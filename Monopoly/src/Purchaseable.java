public abstract class Purchaseable extends Tile
	{
		protected String color;
		protected int price;

		public Purchaseable(String n, String c, int p)
			{
				super(n);
				color = c;
				price = p;
			}

		public abstract void triggerPurchaseableEvent();
			

		

	}
