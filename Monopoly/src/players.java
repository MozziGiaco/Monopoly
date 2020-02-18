
public class players
	{
		private static double money;
		private static String name;
		
		public players(double m, String n)
			{
				money = m;
				name = n;
			}
		public static double getMoney()
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
		
	}
	
