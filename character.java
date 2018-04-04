package Pathfinder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;

import Pathfinder.abilitiesAdjust;
import Pathfinder.races;

public class character extends JFrame implements ActionListener{

	String choice;
	int opmod;
	
	String[] race = { "     Choose Race", "     Dwarf", "     Elf", "     Gnome", "     Halfling", "     Half-Elf", "     Half-Orc", "     Human" };
	String[] abilities = { "+2 Strength", "+2 Dexterity", "+2 Constitution", "+2 Intelligence",
			"+2 Wisdom", "+2 Charisma" };
	String[] fantasy = { "     Choose Point Budget", "     Low Fantasy: 10", "     Standard Fantasy: 15", "     High Fantasy: 20", "     Epic Fantasy: 25" };
	
	String raceCh;
	static String str;
	static String dex;
	static String con;
	static String inte;
	static String wis;
	static String cha;
	
	JPanel Pstr = new JPanel(new BorderLayout());
	JPanel Pdex = new JPanel(new BorderLayout());
	JPanel Pcon = new JPanel(new BorderLayout());
	JPanel Pint = new JPanel(new BorderLayout());
	JPanel Pwis = new JPanel(new BorderLayout());
	JPanel Pcha = new JPanel(new BorderLayout());
	
	JPanel modifiedStr = new JPanel(new GridLayout(3, 2));
	JPanel modifiedDex = new JPanel(new GridLayout(3, 2));
	JPanel modifiedCon = new JPanel(new GridLayout(3, 2));
	JPanel modifiedInt = new JPanel(new GridLayout(3, 2));
	JPanel modifiedWis = new JPanel(new GridLayout(3, 2));
	JPanel modifiedCha = new JPanel(new GridLayout(3, 2));
	
	JPanel Prace = new JPanel(new BorderLayout());
	
	JLabel strength = new JLabel("Strength          ", SwingConstants.RIGHT);
	JLabel dexterity = new JLabel("Dexterity          ", SwingConstants.RIGHT);
	JLabel constitution = new JLabel("Constitution          ", SwingConstants.RIGHT);
	JLabel wisdom = new JLabel ("Wisdom          ", SwingConstants.RIGHT);
	JLabel intelligence = new JLabel ("Intelligence          ", SwingConstants.RIGHT);
	JLabel charisma = new JLabel ("Charisma          ", SwingConstants.RIGHT);
	JLabel points = new JLabel ("Points Remaining          ", SwingConstants.RIGHT);
	static JLabel pointsrem = new JLabel (abilitiesAdjust.Spoints, SwingConstants.CENTER);
	JLabel pointbudget = new JLabel ("Point Budget          ", SwingConstants.RIGHT);
	JLabel pointnum = new JLabel ("20", SwingConstants.CENTER);
	
	JLabel Lrace = new JLabel ("Race          ", SwingConstants.RIGHT);
	JComboBox<String> raceop = new JComboBox<String>(race);
	JComboBox<String> fantasyop = new JComboBox<String>(fantasy);
		
	static JLabel textstr = new JLabel(abilitiesAdjust.Sstr, SwingConstants.CENTER);
	static JLabel textdex = new JLabel(abilitiesAdjust.Sdex, SwingConstants.CENTER);
	static JLabel textcon = new JLabel(abilitiesAdjust.Scon, SwingConstants.CENTER);
	static JLabel textinte = new JLabel(abilitiesAdjust.Sinte, SwingConstants.CENTER);
	static JLabel textwis = new JLabel(abilitiesAdjust.Swis, SwingConstants.CENTER);
	static JLabel textcha = new JLabel(abilitiesAdjust.Scha, SwingConstants.CENTER);
	
	JLabel modStr = new JLabel("     Modifier");
	JLabel modDex = new JLabel("     Modifier");
	JLabel modCon = new JLabel("     Modifier");
	JLabel modInt = new JLabel("     Modifier");
	JLabel modWis = new JLabel("     Modifier");
	JLabel modCha = new JLabel("     Modifier");
	
	JLabel baseStr = new JLabel("     Base");
	JLabel baseDex = new JLabel("     Base");
	JLabel baseCon = new JLabel("     Base");
	JLabel baseInt = new JLabel("     Base");
	JLabel baseWis = new JLabel("     Base");
	JLabel baseCha = new JLabel("     Base");
	
	JLabel totalStr = new JLabel("     Total");
	JLabel totalDex = new JLabel("     Total");
	JLabel totalCon = new JLabel("     Total");
	JLabel totalInt = new JLabel("     Total");
	JLabel totalWis = new JLabel("     Total");
	JLabel totalCha = new JLabel("     Total");
	
	static JLabel modifierStr = new JLabel("+0", SwingConstants.CENTER);
	static JLabel modifierDex = new JLabel("+0", SwingConstants.CENTER);
	static JLabel modifierCon = new JLabel("+0", SwingConstants.CENTER);
	static JLabel modifierInt = new JLabel("+0", SwingConstants.CENTER);
	static JLabel modifierWis = new JLabel("+0", SwingConstants.CENTER);
	static JLabel modifierCha = new JLabel("+0", SwingConstants.CENTER);
	
	
	static JLabel totaledStr = new JLabel("total", SwingConstants.CENTER);
	static JLabel totaledDex = new JLabel("total", SwingConstants.CENTER);
	static JLabel totaledCon = new JLabel("total", SwingConstants.CENTER);
	static JLabel totaledInt = new JLabel("total", SwingConstants.CENTER);
	static JLabel totaledWis = new JLabel("total", SwingConstants.CENTER);
	static JLabel totaledCha = new JLabel("total", SwingConstants.CENTER);
	
	
	BasicArrowButton strinc = new BasicArrowButton(BasicArrowButton.NORTH);
	BasicArrowButton dexinc = new BasicArrowButton(BasicArrowButton.NORTH);
	BasicArrowButton coninc = new BasicArrowButton(BasicArrowButton.NORTH);
	BasicArrowButton intinc = new BasicArrowButton(BasicArrowButton.NORTH);
	BasicArrowButton wisinc = new BasicArrowButton(BasicArrowButton.NORTH);
	BasicArrowButton chainc = new BasicArrowButton(BasicArrowButton.NORTH);
	
	BasicArrowButton strdec = new BasicArrowButton(BasicArrowButton.SOUTH);
	BasicArrowButton dexdec = new BasicArrowButton(BasicArrowButton.SOUTH);
	BasicArrowButton condec = new BasicArrowButton(BasicArrowButton.SOUTH);
	BasicArrowButton intdec = new BasicArrowButton(BasicArrowButton.SOUTH);
	BasicArrowButton wisdec = new BasicArrowButton(BasicArrowButton.SOUTH);
	BasicArrowButton chadec = new BasicArrowButton(BasicArrowButton.SOUTH);
	
	public static character charJframe;
	
	Font newfont = new Font("Arial", Font.BOLD, 16);
	Font newfont2 = new Font("Arial", Font.BOLD, 12);
	
	JPanel scores = new JPanel();
	JButton confirm = new JButton("Confirm");
	
	public character () {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(scores, BorderLayout.CENTER);
		add(confirm, BorderLayout.SOUTH);
		
		scores.setLayout(new GridLayout (9, 2, 2, 2));
		scores.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
				
		scores.add(pointbudget);
		pointbudget.setFont(newfont);
		scores.add(fantasyop);
		fantasyop.setFont(newfont2);
		
		scores.add(Prace);
		Prace.add(Lrace, BorderLayout.CENTER);
		Lrace.setFont(newfont);
		scores.add(raceop);
		raceop.setFont(newfont2);
		
		scores.add(points);
		points.setFont(newfont);
		scores.add(pointsrem);
		pointsrem.setFont(newfont2);
			
		Lrace.setBorder(BorderFactory.createLineBorder(Color.black));
		points.setBorder(BorderFactory.createLineBorder(Color.black));
		pointsrem.setBorder(BorderFactory.createLineBorder(Color.black));
		pointbudget.setBorder(BorderFactory.createLineBorder(Color.black));
		
		scores.add(strength);
		strength.setFont(newfont);
		scores.add(Pstr);
		Pstr.add(modifiedStr, BorderLayout.CENTER);
		
		modifiedStr.add(baseStr);
		baseStr.setFont(newfont2);
		modifiedStr.add(textstr);
		textstr.setFont(newfont2);
		modifiedStr.add(modStr);
		modStr.setFont(newfont2);
		modifiedStr.add(modifierStr);
		modifierStr.setFont(newfont2);
		modifiedStr.add(totalStr);
		totalStr.setFont(newfont2);
		modifiedStr.add(totaledStr);
		totaledStr.setFont(newfont2);
		
		textstr.setText(abilitiesAdjust.Sstr);
		Pstr.add(strinc, BorderLayout.NORTH);
		Pstr.add(strdec, BorderLayout.SOUTH);
		
		scores.add(dexterity);
		dexterity.setFont(newfont);
		scores.add(Pdex);
		Pdex.add(modifiedDex, BorderLayout.CENTER);
		
		modifiedDex.add(baseDex);
		baseDex.setFont(newfont2);
		modifiedDex.add(textdex);
		textdex.setFont(newfont2);
		modifiedDex.add(modDex);
		modDex.setFont(newfont2);
		modifiedDex.add(modifierDex);
		modifierDex.setFont(newfont2);
		modifiedDex.add(totalDex);
		totalDex.setFont(newfont2);
		modifiedDex.add(totaledDex);
		totaledDex.setFont(newfont2);
		
		textdex.setText(abilitiesAdjust.Sdex);
		Pdex.add(dexinc, BorderLayout.NORTH);
		Pdex.add(dexdec, BorderLayout.SOUTH);
		
		scores.add(constitution);
		constitution.setFont(newfont);
		scores.add(Pcon);
		Pcon.add(modifiedCon, BorderLayout.CENTER);
		
		modifiedCon.add(baseCon);
		modifiedCon.add(textcon);
		modifiedCon.add(modCon);
		modifiedCon.add(modifierCon);
		modifiedCon.add(totalCon);
		modifiedCon.add(totaledCon);
		
		textcon.setText(abilitiesAdjust.Scon);
		Pcon.add(coninc, BorderLayout.NORTH);
		Pcon.add(condec, BorderLayout.SOUTH);
		
		scores.add(intelligence);
		intelligence.setFont(newfont);
		scores.add(Pint);
		Pint.add(modifiedInt, BorderLayout.CENTER);
		
		modifiedInt.add(baseInt);
		modifiedInt.add(textinte, BorderLayout.CENTER);
		modifiedInt.add(modInt);
		modifiedInt.add(modifierInt);
		modifiedInt.add(totalInt);
		modifiedInt.add(totaledInt);
		
		textinte.setText(abilitiesAdjust.Sinte);
		Pint.add(intinc, BorderLayout.NORTH);
		Pint.add(intdec, BorderLayout.SOUTH);
		
		scores.add(wisdom);
		wisdom.setFont(newfont);
		scores.add(Pwis);
		Pwis.add(modifiedWis, BorderLayout.CENTER);
		
		modifiedWis.add(baseWis);
		modifiedWis.add(textwis);
		modifiedWis.add(modWis);
		modifiedWis.add(modifierWis);
		modifiedWis.add(totalWis);
		modifiedWis.add(totaledWis);
		
		textwis.setText(abilitiesAdjust.Swis);
		Pwis.add(wisinc, BorderLayout.NORTH);
		Pwis.add(wisdec, BorderLayout.SOUTH);
		
		scores.add(charisma);
		charisma.setFont(newfont);
		scores.add(Pcha);
		Pcha.add(modifiedCha, BorderLayout.CENTER);
		
		modifiedCha.add(baseCha);
		modifiedCha.add(textcha);
		modifiedCha.add(modCha);
		modifiedCha.add(modifierCha);
		modifiedCha.add(totalCha);
		modifiedCha.add(totaledCha);
		
		textcha.setText(abilitiesAdjust.Scha);
		Pcha.add(chainc, BorderLayout.NORTH);
		Pcha.add(chadec, BorderLayout.SOUTH);
		
		strength.setBorder(BorderFactory.createLineBorder(Color.black));
		dexterity.setBorder(BorderFactory.createLineBorder(Color.black));
		constitution.setBorder(BorderFactory.createLineBorder(Color.black));
		intelligence.setBorder(BorderFactory.createLineBorder(Color.black));
		wisdom.setBorder(BorderFactory.createLineBorder(Color.black));
		charisma.setBorder(BorderFactory.createLineBorder(Color.black));		
		
		Pstr.setBorder(BorderFactory.createLineBorder(Color.black));
		Pdex.setBorder(BorderFactory.createLineBorder(Color.black));
		Pcon.setBorder(BorderFactory.createLineBorder(Color.black));
		Pint.setBorder(BorderFactory.createLineBorder(Color.black));
		Pwis.setBorder(BorderFactory.createLineBorder(Color.black));
		Pcha.setBorder(BorderFactory.createLineBorder(Color.black));
		
		setSize(500, 1000);
		setVisible(true);
		abilitiesAdjust.fontColor();
		
		raceop.addActionListener(this);
		fantasyop.addActionListener(this);
				
		strinc.addActionListener(this);
		dexinc.addActionListener(this);
		coninc.addActionListener(this);
		intinc.addActionListener(this);
		wisinc.addActionListener(this);
		chainc.addActionListener(this);
		
		strdec.addActionListener(this);
		dexdec.addActionListener(this);
		condec.addActionListener(this);
		intdec.addActionListener(this);
		wisdec.addActionListener(this);
		chadec.addActionListener(this);
		
		confirm.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) {
		Object source = a.getSource();
		if (source instanceof JComboBox) {
			JComboBox<String> cb = (JComboBox<String>)a.getSource();
			choice = (String)cb.getSelectedItem();
		
			if (choice.equalsIgnoreCase("     dwarf")) {
				races.dwarf();
				raceCh = "Dwarf";
			}
			if (choice.equalsIgnoreCase("     elf")) {
				races.elf();
				raceCh = "Elf";
			}
			if (choice.equalsIgnoreCase("     gnome")) {
				races.gnome();
				raceCh = "Gnome";
			}
			if (choice.equalsIgnoreCase("     halfling")) {
				races.halfling();
				raceCh = "Halfling";
			}
			if (choice.equalsIgnoreCase("     half-elf")) {
				races.halfelf();
				raceCh = "Half-Elf";
				opmod = JOptionPane.showOptionDialog(null, "This race allows an optional modifier. If a different modifier is desired after selection, please reselect your race. "
						+ "Please choose one:", "Optional Modifiers", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, abilities, abilities[0]);
				if (opmod == 0) {
					modifierStr.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.str + races.modifier;
					races.StotalStr = Integer.toString(races.totaled);
					character.totaledStr.setText(races.StotalStr);
				}
				else if (opmod == 1) {
					modifierDex.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.dex + races.modifier;
					races.StotalDex = Integer.toString(races.totaled);
					character.totaledDex.setText(races.StotalDex);
				}
				else if (opmod == 2) {
					modifierCon.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.con + races.modifier;
					races.StotalCon = Integer.toString(races.totaled);
					character.totaledCon.setText(races.StotalCon);
				}
				else if (opmod == 3) {
					modifierInt.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.inte + races.modifier;
					races.StotalInt = Integer.toString(races.totaled);
					character.totaledInt.setText(races.StotalInt);
				}
				else if (opmod == 4) {
					modifierWis.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.wis + races.modifier;
					races.StotalWis = Integer.toString(races.totaled);
					character.totaledWis.setText(races.StotalWis);
				}
				else if (opmod == 5) {
					modifierCha.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.cha + races.modifier;
					races.StotalCha = Integer.toString(races.totaled);
					character.totaledCha.setText(races.StotalCha);
				}
			}
			if (choice.equalsIgnoreCase("     half-orc")) {
				races.halforc();
				raceCh = "Half-Orc";
				opmod = JOptionPane.showOptionDialog(null, "This race allows an optional modifier. If a different modifier is desired after selection, please reselect your race."
						+ "Please choose one:", "Optional Modifiers", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, abilities, abilities[0]);
				if (opmod == 0) {
					modifierStr.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.str + races.modifier;
					races.StotalStr = Integer.toString(races.totaled);
					character.totaledStr.setText(races.StotalStr);
				}
				else if (opmod == 1) {
					modifierDex.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.dex + races.modifier;
					races.StotalDex = Integer.toString(races.totaled);
					character.totaledDex.setText(races.StotalDex);
				}
				else if (opmod == 2) {
					modifierCon.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.con + races.modifier;
					races.StotalCon = Integer.toString(races.totaled);
					character.totaledCon.setText(races.StotalCon);
				}
				else if (opmod == 3) {
					modifierInt.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.inte + races.modifier;
					races.StotalInt = Integer.toString(races.totaled);
					character.totaledInt.setText(races.StotalInt);
				}
				else if (opmod == 4) {
					modifierWis.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.wis + races.modifier;
					races.StotalWis = Integer.toString(races.totaled);
					character.totaledWis.setText(races.StotalWis);
				}
				else if (opmod == 5) {
					modifierCha.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.cha + races.modifier;
					races.StotalCha = Integer.toString(races.totaled);
					character.totaledCha.setText(races.StotalCha);
				}
			}
			if (choice.equalsIgnoreCase("     human")) {
				races.human();
				raceCh = "Human";
				opmod = JOptionPane.showOptionDialog(null, "This race allows an optional modifier. If a different modifier is desired after selection, please reselect your race."
						+ "Please choose one:", "Optional Modifiers", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, abilities, abilities[0]);
				if (opmod == 0) {
					modifierStr.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.str + races.modifier;
					races.StotalStr = Integer.toString(races.totaled);
					character.totaledStr.setText(races.StotalStr);
				}
				else if (opmod == 1) {
					modifierDex.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.dex + races.modifier;
					races.StotalDex = Integer.toString(races.totaled);
					character.totaledDex.setText(races.StotalDex);
				}
				else if (opmod == 2) {
					modifierCon.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.con + races.modifier;
					races.StotalCon = Integer.toString(races.totaled);
					character.totaledCon.setText(races.StotalCon);
				}
				else if (opmod == 3) {
					modifierInt.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.inte + races.modifier;
					races.StotalInt = Integer.toString(races.totaled);
					character.totaledInt.setText(races.StotalInt);
				}
				else if (opmod == 4) {
					modifierWis.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.wis + races.modifier;
					races.StotalWis = Integer.toString(races.totaled);
					character.totaledWis.setText(races.StotalWis);
				}
				else if (opmod == 5) {
					modifierCha.setText("+2");
					races.modifier = 2;
					races.totaled = abilitiesAdjust.cha + races.modifier;
					races.StotalCha = Integer.toString(races.totaled);
					character.totaledCha.setText(races.StotalCha);
				}
			}
			if (choice.equalsIgnoreCase("     low fantasy: 10")) {
				fantasyAdjust.lowFantasy();
				abilitiesAdjust.Spoints = Integer.toString(abilitiesAdjust.pointbuy);
				pointsrem.setText(abilitiesAdjust.Spoints);
				abilitiesAdjust.fontColor();
			}
			if (choice.equalsIgnoreCase("     standard fantasy: 15")) {
				fantasyAdjust.standardFantasy();
				abilitiesAdjust.Spoints = Integer.toString(abilitiesAdjust.pointbuy);
				pointsrem.setText(abilitiesAdjust.Spoints);
				abilitiesAdjust.fontColor();
			}
			if (choice.equalsIgnoreCase("     high fantasy: 20")) {
				fantasyAdjust.highFantasy();
				abilitiesAdjust.Spoints = Integer.toString(abilitiesAdjust.pointbuy);
				pointsrem.setText(abilitiesAdjust.Spoints);
				abilitiesAdjust.fontColor();
			}
			if (choice.equalsIgnoreCase("     epic fantasy: 25")) {
				fantasyAdjust.epicFantasy();
				abilitiesAdjust.Spoints = Integer.toString(abilitiesAdjust.pointbuy);
				pointsrem.setText(abilitiesAdjust.Spoints);
				abilitiesAdjust.fontColor();
			}
		}
		
		if (source == strinc) {
			abilitiesAdjust.increase = 1;
			abilitiesAdjust.incScores();
			abilitiesAdjust.fontColor();
		}
		if (source == dexinc) {
			abilitiesAdjust.increase = 2;
			abilitiesAdjust.incScores();		
			abilitiesAdjust.fontColor();
		}
		if (source == coninc) {
			abilitiesAdjust.increase = 3;
			abilitiesAdjust.incScores();
			abilitiesAdjust.fontColor();

		}
		if (source == intinc) {
			abilitiesAdjust.increase = 4;
			abilitiesAdjust.incScores();
			abilitiesAdjust.fontColor();
		}
		if (source == wisinc) {
			abilitiesAdjust.increase = 5;
			abilitiesAdjust.incScores();
			abilitiesAdjust.fontColor();
		}
		if (source == chainc) {
			abilitiesAdjust.increase = 6;
			abilitiesAdjust.incScores();
			abilitiesAdjust.fontColor();
		}
		if (source == strdec) {
			abilitiesAdjust.decrease = 1;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}
		if (source == dexdec) {
			abilitiesAdjust.decrease = 2;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}
		if (source == condec) {
			abilitiesAdjust.decrease = 3;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}
		if (source == intdec) {
			abilitiesAdjust.decrease = 4;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}
		if (source == wisdec) {
			abilitiesAdjust.decrease = 5;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}
		if (source == chadec) {
			abilitiesAdjust.decrease = 6;
			abilitiesAdjust.decScores();
			abilitiesAdjust.fontColor();
		}		
		if (source == confirm) {
			characterSheet.chRaceF.setText(raceCh);
			
			if (raceCh.equals("Dwarf")) 
				characterSheet.chSizeF.setText("Medium");
			else if (raceCh.equals("Elf"))
				characterSheet.chSizeF.setText("Medium");
			else if (raceCh.equals("Gnome"))
				characterSheet.chSizeF.setText("Small");
			else if (raceCh.equals("Half-Elf"))
				characterSheet.chSizeF.setText("Medium");
			else if (raceCh.equals("Half-Orc"))
				characterSheet.chSizeF.setText("Medium");
			else if (raceCh.equals("Halfling"))
				characterSheet.chSizeF.setText("Small");
			else if (raceCh.equals("Human"))
				characterSheet.chSizeF.setText("Medium");
			else {
				
			}
			
			abilitiesAdjust.abilMod();
			
			
			
			characterSheet.sheet = new characterSheet();
			dispose();
		}
	}
 }
