package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac sign?");
		if (sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Mars.\n" + 
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		else if (sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Venus.\n" + 
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		else if (sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Mercury\n" + 
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
			
		}
		else if (sign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "A water sign; ruled by the Moon.\n" + 
					"Emotional, group oriented, seeks security, family.");
		}
		else if (sign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by the Sun.\n" + 
					"Generous, organized, protective, beautiful.");
		}
		else if (sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Mercury.\n" + 
					"Particular, logical, practical, sense of duty, critical.");
		}
		else if (sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Venus.\n" + 
					"Balanced, seeks beauty, sense of justice.");
		}
		else if (sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Pluto\n" + 
					"Passionate, exacting, loves extremes, combative, reflective.");
		}
		else if (sign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Jupiter.\n" + 
					"Happy, absent minded, creative, adventurous.");
		}
		else if (sign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn.\n" + 
					"Timeless, driven, calculating, ambitious.");
		}
		else if (sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Uranus.\n" + 
					"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.\n" + 
					"\n" + 
					"");
		}
		else if (sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Neptune.\n" + 
					"Likeable, energetic, passionate, sensitive.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That is not a Zodiac sign.");
		}
	
	}	
}
