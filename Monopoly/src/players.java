
public class players
	{
		private double money;
		private String name;
		static int index;

		public players (double m, String n, int i)
		{
		money = m;
		name = n;
		index = i;
		}

		public double getMoney()
			{
				return money;
			}

		public void setMoney(double money)
			{
				this.money = money;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public static int getIndex()
			{
				return index;
			}

		public static void setIndex(int index)
			{
				players.index = index;
			}
	}


