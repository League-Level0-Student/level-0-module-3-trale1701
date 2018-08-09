package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String ayh =JOptionPane.showInputDialog("Are you happy?");
		if(ayh.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}
		else if (ayh.equalsIgnoreCase("no")) {
			String dywtbh = JOptionPane.showInputDialog("Do you want to be happy?");
			if (dywtbh.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
			}
			else if (dywtbh.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something!");
			}
		}
	}
}
