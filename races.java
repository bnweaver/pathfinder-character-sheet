package Pathfinder;

import Pathfinder.character;

public abstract class races {
	
	static int modifier = 0;
	static int totaled = 10;
	
	static String StotalStr = "10";
	static String StotalDex = "10";
	static String StotalCon = "10";
	static String StotalInt = "10";
	static String StotalWis = "10";
	static String StotalCha = "10";
	
	
	public static void dwarf() {
		character.modifierStr.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		System.out.println(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("-2");
		modifier = -2;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void elf() {
		character.modifierStr.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("-2");
		modifier = -2;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void gnome() {
		character.modifierStr.setText("-2");
		modifier = -2;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void halfling() {
		character.modifierStr.setText("-2");
		modifier = -2;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+2");
		modifier = 2;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void halfelf() {
		character.modifierStr.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void halforc() {
		character.modifierStr.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
	public static void human() {
		character.modifierStr.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.str + modifier;
		StotalStr = Integer.toString(totaled);
		character.totaledStr.setText(StotalStr);
		
		character.modifierDex.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.dex + modifier;
		StotalDex = Integer.toString(totaled);
		character.totaledDex.setText(StotalDex);
		
		character.modifierCon.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.con + modifier;
		StotalCon = Integer.toString(totaled);
		character.totaledCon.setText(StotalCon);
		
		character.modifierInt.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.inte + modifier;
		StotalInt = Integer.toString(totaled);
		character.totaledInt.setText(StotalInt);
		
		character.modifierWis.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.wis + modifier;
		StotalWis = Integer.toString(totaled);
		character.totaledWis.setText(StotalWis);
		
		character.modifierCha.setText("+0");
		modifier = 0;
		totaled = abilitiesAdjust.cha + modifier;
		StotalCha = Integer.toString(totaled);
		character.totaledCha.setText(StotalCha);
	}
	
}
