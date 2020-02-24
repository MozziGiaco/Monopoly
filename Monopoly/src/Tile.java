
public abstract class Tile
	{
		protected String name;
		protected String color;
		protected int price;
		

		public Tile(String n,String c, int p)
			{
				name = n;
				color = c;
				price = p;
			}

		public void landOn()
		{
			System.out.println("You landed on " + name);
		}
			

			

	}
