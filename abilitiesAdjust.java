package Pathfinder;

import java.awt.Color;

public abstract class abilitiesAdjust {
	
	public static int str = 10;
	public static int dex = 10;
	public static int con = 10;
	public static int wis = 10;
	public static int inte = 10;
	public static int cha = 10;
	public static int pointbuy = 0;
	
	public static int increase = 0;
	public static int decrease = 0;
	
	static String Sstr = "10";
	static String Sdex = "10";
	static String Scon = "10";
	static String Swis = "10";
	static String Sinte = "10";
	static String Scha = "10";
	static String Spoints = "0";
	
	public static int TotalStr;
	public static int TotalDex;
	public static int TotalCon;
	public static int TotalInt;
	public static int TotalWis;
	public static int TotalCha;
	
	
	public static void fontColor() {
		
		Color posGreen = Color.decode("#267E32");
		Color negRed = Color.decode("#ED2F2F");
		
		if (pointbuy < 0)
			character.pointsrem.setForeground(negRed);
		if (pointbuy == 0)
			character.pointsrem.setForeground(Color.black);
		if (pointbuy > 0)
			character.pointsrem.setForeground(posGreen);
	}
	
	public static void incScores() {
			if (increase == 1) {
				TotalStr = Integer.parseInt(races.StotalStr);
				switch (str) {
				case 7:
					str += 1;
					TotalStr += 1;
					pointbuy -= 2;
					break;
				case 8:
					str += 1;
					TotalStr += 1;
					pointbuy -= 1;
					break;
				case 9:
					str += 1;
					TotalStr += 1;
					pointbuy -= 1;
					break;
				case 10:
					str += 1;
					TotalStr += 1;
					pointbuy -= 1;
					break;
				case 11:
					str += 1;
					TotalStr += 1;
					pointbuy -= 1;
					break;
				case 12:
					str += 1;
					TotalStr += 1;
					pointbuy -= 1;	
					break;
				case 13:
					str += 1;
					TotalStr += 1;
					pointbuy -= 2;	
					break;
				case 14:
					str += 1;
					TotalStr += 1;
					pointbuy -= 2;	
					break;
				case 15:
					str += 1;
					TotalStr += 1;
					pointbuy -= 3;	
					break;
				case 16:
					str += 1;
					TotalStr += 1;
					pointbuy -= 3;	
					break;
				case 17:
					str += 1;
					TotalStr += 1;
					pointbuy -= 4;
					break;
				}	
				
				System.out.println(TotalStr);
				
				Sstr = Integer.toString(str);
				character.textstr.setText(Sstr);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalStr = Integer.toString(TotalStr);
				character.totaledStr.setText(races.StotalStr);
			}
			if (increase == 2) {
				TotalDex = Integer.parseInt(races.StotalDex);
				switch (dex) {
				case 7:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 2;	
					break;
				case 8:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 1;	
					break;
				case 9:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 1;	
					break;
				case 10:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 1;	
					break;
				case 11:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 1;	
					break;
				case 12:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 1;	
					break;
				case 13:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 2;	
					break;
				case 14:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 2;	
					break;
				case 15:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 3;	
					break;
				case 16:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 3;	
					break;
				case 17:
					dex += 1;
					TotalDex += 1;
					pointbuy -= 4;	
					break;
				}	
				Sdex = Integer.toString(dex);
				character.textdex.setText(Sdex);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);	
				
				races.StotalDex = Integer.toString(TotalDex);
				character.totaledDex.setText(races.StotalDex);
			}
			if (increase == 3) {
				TotalCon = Integer.parseInt(races.StotalCon);
				switch (con) {
				case 7:
					con += 1;
					TotalCon += 1;
					pointbuy -= 2;	
					break;
				case 8:
					con += 1;
					TotalCon += 1;
					pointbuy -= 1;	
					break;
				case 9:
					con += 1;
					TotalCon += 1;
					pointbuy -= 1;	
					break;
				case 10:
					con += 1;
					TotalCon += 1;
					pointbuy -= 1;	
					break;
				case 11:
					con += 1;
					TotalCon += 1;
					pointbuy -= 1;	
					break;
				case 12:
					con += 1;
					TotalCon += 1;
					pointbuy -= 1;	
					break;
				case 13:
					con += 1;
					TotalCon += 1;
					pointbuy -= 2;	
					break;
				case 14:
					con += 1;
					TotalCon += 1;
					pointbuy -= 2;	
					break;
				case 15:
					con += 1;
					TotalCon += 1;
					pointbuy -= 3;	
					break;
				case 16:
					con += 1;
					TotalCon += 1;
					pointbuy -= 3;	
					break;
				case 17:
					con += 1;
					TotalCon += 1;
					pointbuy -= 4;	
					break;
				}	
				Scon = Integer.toString(con);
				character.textcon.setText(Scon);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalCon = Integer.toString(TotalCon);
				character.totaledCon.setText(races.StotalCon);
			}
			if (increase == 4) {
				TotalInt = Integer.parseInt(races.StotalInt);
				switch (inte) {
				case 7:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 2;
					break;
				case 8:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 1;	
					break;
				case 9:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 1;	
					break;
				case 10:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 1;	
					break;
				case 11:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 1;	
					break;
				case 12:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 1;	
					break;
				case 13:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 2;	
					break;
				case 14:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 2;	
					break;
				case 15:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 3;	
					break;
				case 16:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 3;
					break;
				case 17:
					inte += 1;
					TotalInt += 1;
					pointbuy -= 4;	
					break;
				}	
				Sinte = Integer.toString(inte);
				character.textinte.setText(Sinte);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalInt = Integer.toString(TotalInt);
				character.totaledInt.setText(races.StotalInt);
			}
			if (increase == 5) {
				TotalWis = Integer.parseInt(races.StotalWis);
				switch (wis) {
				case 7:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 2;	
					break;
				case 8:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 1;	
					break;
				case 9:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 1;
					break;
				case 10:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 1;	
					break;
				case 11:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 1;	
					break;
				case 12:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 1;	
					break;
				case 13:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 2;	
					break;
				case 14:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 2;	
					break;
				case 15:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 3;	
					break;
				case 16:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 3;	
					break;
				case 17:
					wis += 1;
					TotalWis += 1;
					pointbuy -= 4;	
					break;
				}	
				Swis = Integer.toString(wis);
				character.textwis.setText(Swis);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalWis = Integer.toString(TotalWis);
				character.totaledWis.setText(races.StotalWis);
			}
			if (increase == 6) {
				TotalCha = Integer.parseInt(races.StotalCha);
				switch (cha) {
				case 7:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 2;	
					break;
				case 8:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 1;	
					break;
				case 9:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 1;	
					break;
				case 10:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 1;	
					break;
				case 11:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 1;	
					break;
				case 12:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 1;
					break;
				case 13:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 2;	
					break;
				case 14:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 2;	
					break;
				case 15:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 3;
					break;
				case 16:		
					cha += 1;
					TotalCha += 1;
					pointbuy -= 3;		
					break;
				case 17:
					cha += 1;
					TotalCha += 1;
					pointbuy -= 4;
					break;
				}	
				Scha = Integer.toString(cha);
				character.textcha.setText(Scha);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalCha = Integer.toString(TotalCha);
				character.totaledCha.setText(races.StotalCha);
			}
	}
	
	public static void decScores() {
			if (decrease == 1) {
				TotalStr = Integer.parseInt(races.StotalStr);
				switch (str) {
				case 8:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 2;
					break;
				case 9:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 1;
					break;
				case 10:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 1;
					break;
				case 11:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 1;
					break;
				case 12:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 1;
					break;
				case 13:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 1;
					break;
				case 14:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 2;
					break;
				case 15:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 2;
					break;
				case 16:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 3;
					break;
				case 17:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 3;
					break;
				case 18:
					str -= 1;
					TotalStr -= 1;
					pointbuy += 4;
					break;
				}	
				Sstr = Integer.toString(str);
				character.textstr.setText(Sstr);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalStr = Integer.toString(TotalStr);
				character.totaledStr.setText(races.StotalStr);
			}
			if (decrease == 2) {
				TotalDex = Integer.parseInt(races.StotalDex);
				switch (dex) {
				case 8:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 2;
					break;
				case 9:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 1;
					break;
				case 10:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 1;
					break;
				case 11:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 1;
					break;
				case 12:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 1;
					break;
				case 13:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 1;
					break;
				case 14:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 2;
					break;
				case 15:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 2;
					break;
				case 16:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 3;
					break;
				case 17:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 3;
					break;
				case 18:
					dex -= 1;
					TotalDex -= 1;
					pointbuy += 4;
					break;
				}	
				Sdex = Integer.toString(dex);
				character.textdex.setText(Sdex);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalDex = Integer.toString(TotalDex);
				character.totaledDex.setText(races.StotalDex);
			}
			if (decrease == 3) {
				TotalCon = Integer.parseInt(races.StotalCon);
				switch (con) {
				case 8:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 2;
					break;
				case 9:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 1;
					break;
				case 10:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 1;
					break;
				case 11:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 1;
					break;
				case 12:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 1;
					break;
				case 13:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 1;
					break;
				case 14:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 2;
					break;
				case 15:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 2;
					break;
				case 16:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 3;
					break;
				case 17:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 3;
					break;
				case 18:
					con -= 1;
					TotalCon -= 1;
					pointbuy += 4;
					break;
				}	
				Scon = Integer.toString(con);
				character.textcon.setText(Scon);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalCon = Integer.toString(TotalCon);
				character.totaledCon.setText(races.StotalCon);
			}
			if (decrease == 4) {
				TotalInt = Integer.parseInt(races.StotalInt);
				switch (inte) {
				case 8:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 2;
					break;
				case 9:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 1;
					break;
				case 10:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 1;
					break;
				case 11:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 1;
					break;
				case 12:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 1;
					break;
				case 13:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 1;
					break;
				case 14:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 2;
					break;
				case 15:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 2;
					break;
				case 16:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 3;
					break;
				case 17:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 3;
					break;
				case 18:
					inte -= 1;
					TotalInt -= 1;
					pointbuy += 4;
					break;
				}	
				Sinte = Integer.toString(inte);
				character.textinte.setText(Sinte);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalInt = Integer.toString(TotalInt);
				character.totaledInt.setText(races.StotalInt);

			}
			if (decrease == 5) {
				TotalWis = Integer.parseInt(races.StotalWis);
				switch (wis) {
				case 8:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 2;
					break;
				case 9:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 1;
					break;
				case 10:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 1;
					break;
				case 11:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 1;
					break;
				case 12:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 1;
					break;
				case 13:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 1;
					break;
				case 14:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 2;
					break;
				case 15:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 2;
					break;
				case 16:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 3;
					break;
				case 17:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 3;
					break;
				case 18:
					wis -= 1;
					TotalWis -= 1;
					pointbuy += 4;
					break;
				}	
				Swis = Integer.toString(wis);
				character.textwis.setText(Swis);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalWis = Integer.toString(TotalWis);
				character.totaledWis.setText(races.StotalWis);
			}
			if (decrease == 6) {
				TotalCha = Integer.parseInt(races.StotalCha);
				switch (cha) {
				case 8:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 2;
					break;
				case 9:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 1;
					break;
				case 10:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 1;
					break;
				case 11:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 1;
					break;
				case 12:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 1;
					break;
				case 13:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 1;
					break;
				case 14:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 2;
					break;
				case 15:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 2;
					break;
				case 16:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 3;
					break;
				case 17:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 3;
					break;
				case 18:
					cha -= 1;
					TotalCha -= 1;
					pointbuy += 4;
					break;
				}	
				Scha = Integer.toString(cha);
				character.textcha.setText(Scha);
				Spoints = Integer.toString(pointbuy);
				character.pointsrem.setText(Spoints);
				
				races.StotalCha = Integer.toString(TotalCha);
				character.totaledCha.setText(races.StotalCha);
			}
	}
}
