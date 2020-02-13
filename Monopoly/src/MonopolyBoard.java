import java.util.ArrayList;

public class MonopolyBoard
	{
	 
		static ArrayList <PropertyBoard> board = new ArrayList <PropertyBoard> ();

		public static void makeArray()
			{
				String[] boardIndex = new String[5];

				boardIndex[0] = "GO : COLLECT $200 SALARY AS YOU PASS";
				boardIndex[1] = "AURORA'S COTTAGE (PURPLE) PRICE: $60";
				boardIndex[2] = "COMMUNITY CHEST : FOLLOW INSTRUCTIONS ON TOP CARD";
				boardIndex[3] = "SLEEPING BEAUTY CASTLE (PURPLE) PRICE: $60";
				boardIndex[4] = "INCOME TAX : PAY 10% OR $200";
				boardIndex[5] = "READING RAILROAD : PRICE: $200";
				boardIndex[6] = "SHADOWLAND (LIGHT BLUE) PRICE: $100";
				boardIndex[7] = "CHANCE";
				boardIndex[8] = "HAKUNA MATATA FALLS (LIGHT BLUE) PRICE: $100";
				boardIndex[9] = "PRIDE ROCK (LIGHT BLUE) PRICE: $120";
				boardIndex[10] = "IN JAIL (JUST VISITING)";
				boardIndex[11] = "THE SNUGGLY DUCKLING  (PINK) PRICE: $140";
				boardIndex[12] = "ELECTRIC COMPANY : PRICE: $150";
				boardIndex[13] = "RAPUNZEL'S TOWER : PRICE: $140";
				boardIndex[14] = "CORONA CASTLE : PRICE: $160";
				boardIndex[15] = "PENNSYLVANIA RAILROAD : PRICE: $200";
				boardIndex[16] = "THE BOG (ORANGE) PRICE: $180";
				boardIndex[17] = "COMMUNITY CHEST : FOLLOW INSTRUCTIONS ON TOP CARD";
				boardIndex[18] = "THE FERRY : PRICE: $180";
				boardIndex[19] = "TIANA'S PLACE : PRICE: $200";
				boardIndex[20] = "FREE PARKING";
				boardIndex[21] = "THE JUNGLE (RED) : PRICE: $220";
				boardIndex[22] = "CHANCE";
				boardIndex[23] = "PACHA'S VILLAGE (RED) : PRICE: $220";
				boardIndex[24] = "KUZCO'S PALACE (RED) : PRICE: $240";
				boardIndex[25] = "B & O. RAILROAD : PRICE: $200";
				boardIndex[26] = "BELLE'S VILLAGE (YELLOW) : PRICE: $260";
				boardIndex[27] = "WOLVES' WOODS : PRICE: $260";
				boardIndex[28] = "WATER WORKS: PRICE: $150";
				boardIndex[29] = "THE BEAST'S CASTLE (YELLOW) : PRICE: $280";
				boardIndex[30] = "GO TO JAIL";
				boardIndex[31] = "URSULA'S LAIR (GREEN) : PRICE: $300";
				boardIndex[32] = "ERIC'S SHIP (GREEN): PRICE: $300";
				boardIndex[33] = "COMMUNTIY CHEST : FOLLOW INSTRUCTIONS ON TOP CARD";
				boardIndex[34] = "TRITON'S KINGDOM (GREEN) : PRICE: $320";
				boardIndex[35] = "SHORT LINE : PRICE: $200";
				boardIndex[36] = "CHANCE";
				boardIndex[37] = "CITY OF THEBES (DARK BLUE) : PRICE: $350";
				boardIndex[38] = "LUXURY TAX : PAY: $75.00";
				boardIndex[39] = "MOUNT OLYMPUS (DARK BLUE) : PRICE: $400";

				
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));
				board.add(new PropertyBoard("AURORA'S COTTAGE", 60, "PURPLE"));

				
				
			}

	}
