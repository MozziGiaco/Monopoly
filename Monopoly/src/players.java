
public class players 
	{
		static double money;
		static String name;
		//static String name2;
		static int index;

		public players (double m, String n, int i)
		{
		money = m;
		name = n;
		//name2 = n2;
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

		public void setName()
			{
				this.name = name;
			}
	//	public String getName2()
			//{
			//	return name2;
			//}
		//public void setName2(String name2)
		//	{
		//		this.name2 = name2;
		//	}

		public static int getIndex()
			{
				return index;
			}

		public static void setIndex(int index)
			{
				players.index = index;
			}
	}



