package Pathfinder;

public abstract class fantasyAdjust {
	
	public static int abilities[] = { abilitiesAdjust.str, abilitiesAdjust.dex, abilitiesAdjust.con, abilitiesAdjust.inte, abilitiesAdjust.wis,
			abilitiesAdjust.cha };
	
	public static void lowFantasy() {
		abilitiesAdjust.pointbuy = 10;
		
		for (int x = 0; x < abilities.length; x++) {
			switch(abilities[x]) {
			case 7:
				abilitiesAdjust.pointbuy += 4;
				break;
			case 8:
				abilitiesAdjust.pointbuy += 2;
				break;
			case 9:
				abilitiesAdjust.pointbuy += 1;
				break;
			case 11:
				abilitiesAdjust.pointbuy -= 1;
				break;
			case 12:
				abilitiesAdjust.pointbuy -= 2;
				break;
			case 13:
				abilitiesAdjust.pointbuy -= 3;
				break;
			case 14:
				abilitiesAdjust.pointbuy -= 5;
				break;
			case 15:
				abilitiesAdjust.pointbuy -= 7;
				break;
			case 16:
				abilitiesAdjust.pointbuy -= 10;
				break;
			case 17:
				abilitiesAdjust.pointbuy -= 13;
				break;
			case 18:
				abilitiesAdjust.pointbuy -= 17;
				break;
			}
		}
	}
	
	public static void standardFantasy() {
		abilitiesAdjust.pointbuy = 15;
		
		for (int x = 0; x < abilities.length; x++) {
			switch(abilities[x]) {
			case 7:
				abilitiesAdjust.pointbuy += 4;
				break;
			case 8:
				abilitiesAdjust.pointbuy += 2;
				break;
			case 9:
				abilitiesAdjust.pointbuy += 1;
				break;
			case 11:
				abilitiesAdjust.pointbuy -= 1;
				break;
			case 12:
				abilitiesAdjust.pointbuy -= 2;
				break;
			case 13:
				abilitiesAdjust.pointbuy -= 3;
				break;
			case 14:
				abilitiesAdjust.pointbuy -= 5;
				break;
			case 15:
				abilitiesAdjust.pointbuy -= 7;
				break;
			case 16:
				abilitiesAdjust.pointbuy -= 10;
				break;
			case 17:
				abilitiesAdjust.pointbuy -= 13;
				break;
			case 18:
				abilitiesAdjust.pointbuy -= 17;
				break;
			}
		}
	}
	
	public static void highFantasy() {
		abilitiesAdjust.pointbuy = 20;
		
		for (int x = 0; x < abilities.length; x++) {
			switch(abilities[x]) {
			case 7:
				abilitiesAdjust.pointbuy += 4;
				break;
			case 8:
				abilitiesAdjust.pointbuy += 2;
				break;
			case 9:
				abilitiesAdjust.pointbuy += 1;
				break;
			case 11:
				abilitiesAdjust.pointbuy -= 1;
				break;
			case 12:
				abilitiesAdjust.pointbuy -= 2;
				break;
			case 13:
				abilitiesAdjust.pointbuy -= 3;
				break;
			case 14:
				abilitiesAdjust.pointbuy -= 5;
				break;
			case 15:
				abilitiesAdjust.pointbuy -= 7;
				break;
			case 16:
				abilitiesAdjust.pointbuy -= 10;
				break;
			case 17:
				abilitiesAdjust.pointbuy -= 13;
				break;
			case 18:
				abilitiesAdjust.pointbuy -= 17;
				break;
			}
		}
	}
	
	public static void epicFantasy() {
		abilitiesAdjust.pointbuy = 25;
		
		for (int x = 0; x < abilities.length; x++) {
			switch(abilities[x]) {
			case 7:
				abilitiesAdjust.pointbuy += 4;
				break;
			case 8:
				abilitiesAdjust.pointbuy += 2;
				break;
			case 9:
				abilitiesAdjust.pointbuy += 1;
				break;
			case 11:
				abilitiesAdjust.pointbuy -= 1;
				break;
			case 12:
				abilitiesAdjust.pointbuy -= 2;
				break;
			case 13:
				abilitiesAdjust.pointbuy -= 3;
				break;
			case 14:
				abilitiesAdjust.pointbuy -= 5;
				break;
			case 15:
				abilitiesAdjust.pointbuy -= 7;
				break;
			case 16:
				abilitiesAdjust.pointbuy -= 10;
				break;
			case 17:
				abilitiesAdjust.pointbuy -= 13;
				break;
			case 18:
				abilitiesAdjust.pointbuy -= 17;
				break;
			}
		}
	}
}

