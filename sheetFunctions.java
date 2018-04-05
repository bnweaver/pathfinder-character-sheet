package Pathfinder;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class sheetFunctions extends characterSheet{
	
	
	
	public static void skillMods(JLabel j) {
		String s = j.getText();
		if (s.contains("Str")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.str);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			strMod = new JLabel("   = Str     ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(strMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
		if (s.contains("Dex")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.dex);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			dexMod = new JLabel("   = Dex   ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(dexMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
		if (s.contains("Con")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.con);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			conMod = new JLabel("   = Con   ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(conMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
		if (s.contains("Int")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.inte);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			intMod = new JLabel("   = Int      ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(intMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
		if (s.contains("Wis")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.wis);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			wisMod = new JLabel("   = Wis   ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(wisMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
		if (s.contains("Cha")) {
			
			tBonus = new JTextField();
			abiMod = new JTextField(character.cha);
			ranksF = new JTextField();
			misMod = new JTextField();
			
			chaMod = new JLabel("   = Cha   ");
			add = new JLabel(" + ");
			
			skMod.add(tBonus);
			skMod.add(chaMod);
			skMod.add(abiMod);
			skMod.add(add);
			skMod.add(ranksF);
			add = new JLabel(" + ");
			skMod.add(add);
			skMod.add(misMod);
		}
	}
}
