package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
	public static void main(String[] args) {
		//Guess the number! Is it 1, 2, or 3???
		for (int a = 0; a >= 0; a++) {
				int random = new Random().nextInt(3);
				
				System.out.println(random);
				for (int i = 0; i < 3; i++) {
		        String guess = JOptionPane.showInputDialog("Give me a number!");
		        int number=Integer.parseInt(guess);
		        if (number == random) {
		        	JOptionPane.showMessageDialog(null, "You won!");
		        	break;
		        }
		        else {
		        	JOptionPane.showMessageDialog(null, "You got it wrong!");
		        	JOptionPane.showMessageDialog(null, "You lost!");
		        }
		        }
		       
		        String playAgain = JOptionPane.showInputDialog("Do you want to play again?");
		        if(playAgain.equalsIgnoreCase("no")) {break;}
		        else {JOptionPane.showMessageDialog(null, "Press okay to restart!");}
	}
		JOptionPane.showMessageDialog(null, "Bye!");
	}

}
