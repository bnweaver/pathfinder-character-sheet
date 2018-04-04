package Pathfinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class characterSheet extends JFrame implements ActionListener {
	
	static JFrame sheet;

	JPanel page = new JPanel(new BorderLayout());
	JPanel appearance = new JPanel(new GridLayout(1, 3));
	JPanel stats = new JPanel(new GridLayout(1, 2));
	JPanel notSkills = new JPanel(new GridLayout(10, 1));
	JPanel abiScores = new JPanel(new GridLayout(1, 2));
	JPanel skills = new JPanel(new BorderLayout());
	
	JPanel picture = new JPanel();
	JPanel appear1 = new JPanel(new GridLayout(3, 1, 2, 2));
	JPanel appear2 = new JPanel(new GridLayout(3, 1, 2, 2));
	JPanel name1 = new JPanel(new GridLayout(2, 1));
	JPanel name2 = new JPanel();
	JPanel nameL = new JPanel();
	JPanel level = new JPanel(new GridLayout(2, 1));
	JPanel gender = new JPanel(new GridLayout(4, 1));
	JPanel gender2 = new JPanel();
	JPanel genderL = new JPanel();	
	
	JPanel pNameP = new JPanel(new GridLayout(2, 1));
	JPanel deity = new JPanel(new GridLayout(2, 1));
	JPanel deity2 = new JPanel();
	JPanel deityL = new JPanel();
	JPanel height = new JPanel(new GridLayout(2, 1));
	JPanel height2 = new JPanel();
	JPanel heightL = new JPanel();
	
	JPanel speed = new JPanel(new BorderLayout());
	JPanel speed3 = new JPanel(new GridLayout(4, 1));
	JPanel speed2 = new JPanel();
	JPanel speedL = new JPanel();
	JPanel fly = new JPanel();
	JPanel flyL = new JPanel();
	JPanel tempModS = new JPanel(new BorderLayout());
	
	JPanel skLBonus = new JPanel(new GridLayout(1, 2));
	JPanel skBonus = new JPanel(new GridLayout(39, 5));
	JPanel skillL = new JPanel(new GridLayout(39, 1));
	JPanel skTitle = new JPanel(new BorderLayout());
	JPanel skTitle2 = new JPanel(new BorderLayout());
	JPanel skIntro = new JPanel(new GridLayout(2, 1));
	JPanel skIntroL = new JPanel();
	JPanel skIntroL2 = new JPanel();
	
	JLabel chSpeed = new JLabel("Speed");
	JLabel landL = new JLabel("Land");
	JLabel baseS = new JLabel("Base Speed");
	JLabel wArmorS = new JLabel("With Armor");
	JLabel chFly = new JLabel("Fly");
	JLabel maneuverability = new JLabel("/ Bonus");
	JLabel chSwim = new JLabel("Swim");
	JLabel chClimb = new JLabel("Climb");
	JLabel chBurrow = new JLabel("Burrow");
	JLabel tempMod = new JLabel("Temp Modifiers");
	
	JLabel chSpeedF = new JLabel("      ft.    sq.   ");
	JLabel wArmorF = new JLabel("      ft.   sq.   ");
	JLabel chFlyF = new JLabel("       ft.   ");
	JLabel maneuverabilityF = new JLabel("             ");
	JLabel chSwimF = new JLabel("      ft.   ");
	JLabel chClimbF = new JLabel("       ft.   ");
	JLabel chBurrowF = new JLabel("       ft.   ");
	JTextField tempModF = new JTextField();
	
	JLabel chName = new JLabel("Character Name");
	JLabel chAlign = new JLabel("Alignment");
	JLabel chLevel = new JLabel("Character Level");
	JLabel chRace = new JLabel("Race");
	JLabel chSize = new JLabel("Size");
	JLabel chGen = new JLabel("Gender");
	JLabel chAge = new JLabel("Age");
	
	JLabel pName = new JLabel("Player Name");
	JLabel chDeity = new JLabel("Deity");
	JLabel chHomeland = new JLabel("Homeland");
	JLabel chHeight = new JLabel("Height");
	JLabel chWeight = new JLabel("Weight");
	JLabel chHair = new JLabel("Hair");
	JLabel chEyes = new JLabel("Eyes");
	
	JLabel skillT  = new JLabel("Skills", SwingConstants.CENTER);
	JLabel skNames = new JLabel("Skill Names");
	JLabel total = new JLabel("Total");
	JLabel bonus = new JLabel("Bonus");
	JLabel abis = new JLabel("Ability");
	JLabel mods = new JLabel("Mod.");
	JLabel ranks = new JLabel("Ranks");
	JLabel misc = new JLabel("Misc.");
	JLabel mMods = new JLabel("Mod.");
	
	String square = "\u25A1";
	//String square = "\u2611";
	
	JLabel acrobatics  = new JLabel(square + " Acrobatics");
	JLabel appraise = new JLabel(square + " Appraise");
	JLabel bluff = new JLabel(square + " Bluff");
	JLabel climb = new JLabel(square + " Climb");
	JLabel craft = new JLabel(square + " Craft ____________");
	JLabel craft2 = new JLabel(square + " Craft ____________");
	JLabel craft3 = new JLabel(square + " Craft ____________");
	JLabel diplomacy = new JLabel(square + " Diplomacy");
	JLabel disableDevice = new JLabel(square + " Disable Device*");
	JLabel disguise = new JLabel(square + " Disguise");
	JLabel escapeArtist = new JLabel(square + " Escape Artist");
	JLabel skFly = new JLabel(square + " Fly");
	JLabel handleAnimal = new JLabel(square + " Handle Animal*");
	JLabel heal = new JLabel(square + " Heal");
	JLabel intimidate = new JLabel(square + " Intimidate");
	JLabel arcana = new JLabel(square + " Knowledge(Arcana)*");
	JLabel dungeoneering = new JLabel(square + " Knowledge(Dungeoneering)*");
	JLabel engineering = new JLabel(square + " Knowledge(Engineering)*");
	JLabel geography = new JLabel(square + " Knowledge(Geography)*");
	JLabel history = new JLabel(square + " Knowledge(History)*");
	JLabel local = new JLabel(square + " Knowledge(Local)*");
	JLabel nature = new JLabel(square + " Knowledge(Nature)*");
	JLabel nobility = new JLabel(square + " Knowledge(Nobility)*");
	JLabel planes = new JLabel(square + " Knowledge(Planes)*");
	JLabel religion = new JLabel(square + " Knowledge(Religion)*");
	JLabel linguistics = new JLabel(square + " Linguistics*");
	JLabel perception = new JLabel(square + " Perception");
	JLabel perform1 = new JLabel(square + " Perform __________");
	JLabel perform2 = new JLabel(square + " Perform __________");
	JLabel profession1 = new JLabel(square + " Profession* __________");
	JLabel profession2 = new JLabel(square + " Profession* __________");
	JLabel ride = new JLabel(square + " Ride");
	JLabel senseMotive = new JLabel(square + " Sense Motive");
	JLabel sleightHand = new JLabel(square + " Sleight of Hand*");
	JLabel spellcraft = new JLabel(square + " Spellcraft*");
	JLabel stealth = new JLabel(square + " Stealth");
	JLabel survival = new JLabel(square + " Survival");
	JLabel swim = new JLabel(square + " Swim");
	JLabel useMagicDevice = new JLabel(square + " Use Magic Device*");
	
	JTextField chNameF = new JTextField();
	JTextField chAlignF = new JTextField();
	JTextField chLevelF = new JTextField();
	static JTextField chRaceF = new JTextField(1);
	static JTextField chSizeF = new JTextField(1);
	JTextField chGenF = new JTextField();
	JTextField chAgeF = new JTextField();
	
	JTextField pNameF = new JTextField();
	JTextField chDeityF = new JTextField();
	JTextField chHomelandF = new JTextField();
	JTextField chHeightF = new JTextField();
	JTextField chWeightF = new JTextField();
	JTextField chHairF = new JTextField();
	JTextField chEyesF = new JTextField();
	
	
	
	public characterSheet() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(page);
		page.add(appearance, BorderLayout.NORTH);
		appearance.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		appearance.add(picture);
		appearance.add(appear1);
		appearance.add(appear2);
		
		appear1.add(name1);
		appear1.add(level);
		appear1.add(gender);
		
		name2.setLayout(new BoxLayout(name2, BoxLayout.X_AXIS));
		name1.add(name2);
		name2.add(chNameF);
		chNameF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		name2.add(chAlignF);
		chAlignF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

		nameL.setLayout(new BoxLayout(nameL, BoxLayout.X_AXIS));
		name1.add(nameL);
		nameL.add(chName);
		nameL.add(Box.createRigidArea(new Dimension(65, 0)));
		nameL.add(chAlign);
		
		level.add(chLevelF);
		chLevelF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		level.add(chLevel);
		
		gender2.setLayout(new BoxLayout(gender2, BoxLayout.X_AXIS));
		genderL.setLayout(new BoxLayout(genderL, BoxLayout.X_AXIS));
		gender.add(gender2);
		gender.add(genderL);
		
		gender2.add(chRaceF);
		chRaceF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		chRaceF.setEditable(false);
		gender2.add(chSizeF);
		chSizeF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		chSizeF.setEditable(false);
		gender2.add(chGenF);
		chGenF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		gender2.add(chAgeF);
		chAgeF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		genderL.add(chRace);
		genderL.add(Box.createRigidArea(new Dimension(55, 0)));
		genderL.add(chSize);
		genderL.add(Box.createRigidArea(new Dimension(60, 0)));
		genderL.add(chGen);
		genderL.add(Box.createRigidArea(new Dimension(35, 0)));
		genderL.add(chAge);
		
		appear2.add(pNameP);
		appear2.add(deity);
		appear2.add(height);
		
		pNameP.add(pNameF);
		pNameF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		pNameP.add(pName);
		
		deity2.setLayout(new BoxLayout(deity2, BoxLayout.X_AXIS));
		deity.add(deity2);
		deity2.add(chDeityF);
		chDeityF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		deity2.add(chHomelandF);
		chHomelandF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		deityL.setLayout(new BoxLayout(deityL, BoxLayout.X_AXIS));
		deity.add(deityL);
		deityL.add(chDeity);
		deityL.add(Box.createRigidArea(new Dimension(130, 0)));
		deityL.add(chHomeland);
		
		page.add(stats, BorderLayout.CENTER);
		stats.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		stats.add(notSkills);
		notSkills.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		stats.add(skills);
		skills.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		skills.add(speed, BorderLayout.NORTH);
		speed.add(speed3, BorderLayout.CENTER);
		
		speed.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		speed.add(tempModS, BorderLayout.EAST);
		
		tempModS.add(tempMod, BorderLayout.NORTH);
		tempModS.add(tempModF, BorderLayout.CENTER);
		
		speed2.setLayout(new BoxLayout(speed2, BoxLayout.X_AXIS));
		speed3.add(speed2);
		
		speed2.add(Box.createRigidArea(new Dimension(10,0)));
		speed2.add(chSpeed);
		chSpeed.setFont(new Font("Arial", Font.BOLD, 14));
		speed2.add(Box.createRigidArea(new Dimension(70, 0)));
		
		speed2.add(chSpeedF);
		chSpeedF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		speed2.add(Box.createRigidArea(new Dimension(70, 0)));
		speed2.add(wArmorF);
		wArmorF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		speedL.setLayout(new BoxLayout(speedL, BoxLayout.X_AXIS));
		speed3.add(speedL);
		
		speedL.add(Box.createRigidArea(new Dimension(20, 0)));
		speedL.add(landL);
		speedL.add(Box.createRigidArea(new Dimension(77, 0)));
		speedL.add(baseS);
		speedL.add(Box.createRigidArea(new Dimension(73, 0)));
		speedL.add(wArmorS);
		
		fly.setLayout(new BoxLayout(fly, BoxLayout.X_AXIS));
		speed3.add(fly);
		flyL.setLayout(new BoxLayout(flyL, BoxLayout.X_AXIS));
		speed3.add(flyL);
		
		fly.add(Box.createRigidArea(new Dimension(15, 0)));
		fly.add(chFlyF);
		chFlyF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		fly.add(maneuverabilityF);
		maneuverabilityF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		fly.add(Box.createRigidArea(new Dimension(35,0)));
		fly.add(chSwimF);
		chSwimF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		fly.add(Box.createRigidArea(new Dimension(35, 0)));
		fly.add(chClimbF);
		chClimbF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		fly.add(Box.createRigidArea(new Dimension(35, 0)));
		fly.add(chBurrowF);
		chBurrowF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		flyL.add(Box.createRigidArea(new Dimension(20, 0)));
		flyL.add(chFly);
		flyL.add(Box.createRigidArea(new Dimension(20, 0)));
		flyL.add(maneuverability);
		flyL.add(Box.createRigidArea(new Dimension(40, 0)));
		flyL.add(chSwim);
		flyL.add(Box.createRigidArea(new Dimension(45, 0)));
		flyL.add(chClimb);
		flyL.add(Box.createRigidArea(new Dimension(40, 0)));
		flyL.add(chBurrow);
		
		skills.add(skTitle, BorderLayout.CENTER);
		skTitle.add(skTitle2, BorderLayout.NORTH);
		
		skillT.setFont(new Font("Arial", Font.BOLD, 14));
		
		skTitle2.add(skillT, BorderLayout.CENTER);
		skIntroL.setLayout(new BoxLayout(skIntroL, BoxLayout.X_AXIS));
		skIntroL2.setLayout(new BoxLayout(skIntroL2, BoxLayout.X_AXIS));
		
		skTitle2.add(skIntro, BorderLayout.SOUTH);
		skIntro.add(skIntroL);
		skIntro.add(skIntroL2);
		
		skIntroL.add(Box.createRigidArea(new Dimension(15, 0)));
		skIntroL.add(skNames);
		skIntroL.add(Box.createRigidArea(new Dimension(100, 0)));
		skIntroL.add(total);
		skIntroL.add(Box.createRigidArea(new Dimension(70, 0)));
		skIntroL.add(abis);
		skIntroL.add(Box.createRigidArea(new Dimension(90, 0)));
		skIntroL.add(misc);
		
		skIntroL2.add(Box.createRigidArea(new Dimension(180, 0)));
		skIntroL2.add(bonus);
		skIntroL2.add(Box.createRigidArea(new Dimension(67, 0)));
		skIntroL2.add(mods);
		skIntroL2.add(Box.createRigidArea(new Dimension(30, 0)));
		skIntroL2.add(ranks);
		skIntroL2.add(Box.createRigidArea(new Dimension(30, 0)));
		skIntroL2.add(mMods);
		
		skTitle.add(skLBonus, BorderLayout.CENTER);
		skLBonus.add(skillL);
		
		skillL.add(acrobatics);
		skillL.add(appraise);
		skillL.add(bluff);
		skillL.add(climb);
		skillL.add(craft);
		skillL.add(craft2);
		skillL.add(craft3);
		skillL.add(diplomacy);
		skillL.add(disableDevice);
		skillL.add(disguise);
		skillL.add(escapeArtist);
		skillL.add(skFly);
		skillL.add(handleAnimal);
		skillL.add(heal);
		skillL.add(intimidate);
		skillL.add(arcana);
		skillL.add(dungeoneering);
		skillL.add(engineering);
		skillL.add(geography);
		skillL.add(history);
		skillL.add(local);
		skillL.add(nature);
		skillL.add(nobility);
		skillL.add(planes);
		skillL.add(religion);
		skillL.add(linguistics);
		skillL.add(perception);
		skillL.add(perform1);
		skillL.add(perform2);
		skillL.add(profession1);
		skillL.add(profession2);
		skillL.add(ride);
		skillL.add(senseMotive);
		skillL.add(sleightHand);
		skillL.add(spellcraft);
		skillL.add(stealth);
		skillL.add(survival);
		skillL.add(swim);
		skillL.add(useMagicDevice);
		
		skLBonus.add(skBonus);
		
		notSkills.add(abiScores);
		abiScores.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		setSize(960, 1000);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent a) {
		
	}
}
