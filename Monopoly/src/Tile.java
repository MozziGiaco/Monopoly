
public abstract class Tile
	{
		protected String name;
		protected int price;

		public Tile(String n, int p)
			{
				name = n;
				price = p;
			}

		public void landOn()
			{
				System.out.println("You landed on the " + name + " tile.");
			}

	}
