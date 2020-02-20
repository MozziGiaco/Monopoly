
public abstract class Tile
	{
		protected String name;

		public Tile(String n)
			{
				name = n;
			}

		public void landOn()
			{
				System.out.println("You landed on " + name);
			}
		//test

	}
