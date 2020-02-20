
public class MonopolyBoard
	{

		public static void makeArray()
			{
				Tile[] board = new Tile[40];

				board[0] = new Go("GO");
				board[1] = new Property("AURORA'S COTTAGE", "PURPLE", 60);
				board[2] = new CommunityChest("COMMUNITY CHEST");
				board[3] = new Property("SLEEPING BEAUTY'S CASTLE", "PURPLE", 60);
				board[4] = new Tax("INCOME TAX");
				board[5] = new Property("READING RAILROAD", "", 200);
				board[6] = new Property("SHADOWLAND", "LIGHT BLUE", 100);
				board[7] = new Chance("CHANCE");
				board[8] = new Property("HAKUNA MATATA FALLS", "LIGHT BLUE", 100);
				board[9] = new Property("PRIDE ROCK", "LIGHT BLUE", 120);
				board[10] = new Jail("IN JAIL (JUST VISITING");
				board[11] = new Property("THE SNUGGLY DUCKLING", "PINK", 140);
				board[12] = new Utility("ELECTRIC COMPANY", "WHITE", 150);
				board[13] = new Property("RAPUNZEL'S CASTLE", "", 140);
				board[14] = new Property("CORONA CASTLE", "", 160);
				board[15] = new Railroad("PENNSYLVANIA RAILROAD", "GRAY", 200);
				board[16] = new Property("THE BOG", "ORANGE", 180);
				board[17] = new CommunityChest("COMMUNITY CHEST");
				board[18] = new Property("THE FERRY", "", 180);
				board[19] = new Property("TIANA'S PLACE", "", 200);
				board[20] = new FreeParking("FREE PARKING");
				board[21] = new Property("THE JUNGLE", "RED", 220);
				board[22] = new Chance("CHANCE");
				board[23] = new Property("PACHA'S VILLAGE", "RED", 220);
				board[24] = new Property("KUZCO'S PALACE", "RED", 240);
				board[25] = new Railroad("B & O. RAILROAD", "GRAY", 200);
				board[26] = new Property("BELLE'S VILLAGE", "YELLOW", 260);
				board[27] = new Property("WOLVES' WOODS", "", 260);
				board[28] = new Utility("WATER WORKS", "WHITE", 150);
				board[29] = new Property("THE BEAST'S CASTLE", "YELLOW", 280);
				board[30] = new Jail("GO TO JAIL");
				board[31] = new Property("URSULA'S LAIR", "GREEN", 300);
				board[32] = new Property("ERIC'S SHIP", "GREEN", 300);
				board[33] = new CommunityChest("COMMUNTIY CHEST");
				board[34] = new Property("TRITON'S KINGDOM", "GREEN", 320);
				board[35] = new Utility("SHORT LINE", "WHITE", 200);
				board[36] = new Chance("CHANCE");
				board[37] = new Property("CITY OF THEBES", "DARK BLUE", 350);
				board[38] = new Tax("LUXURY TAX");
				board[39] = new Property("MOUNT OLYMPUS", "DARK BLUE", 400);
				
				

				

			}
	}
