import java.util.ArrayList;

public class PropertyBoard
	{
		private String name;
		private int price;
		private String color;
		
		public PropertyBoard(String n, int p, String c)
		{
			name = n;
			price = p;
			color = c;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}
		
	}
