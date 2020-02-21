import java.util.Scanner;

public class Property extends Purchaseable
	{
		static Scanner intInput = new Scanner(System.in);
		static int choice;

		public Property(String n, String c, int p)
			{
				super(n, c, p);
			}

		@Override
		public void triggerPurchaseableEvent()
			{
				landOnProperty();
			}

		public void landOnProperty()
			{
				choice = intInput.nextInt();
				System.out.println("Would you like to buy " + name + "?");

				System.out.println("(1) Yes");
				System.out.println("(2) No");

				if (choice == 1)
					{
						System.out.println("You have chosen to purchase " + name + ".");
						
						
					}

			}

	}