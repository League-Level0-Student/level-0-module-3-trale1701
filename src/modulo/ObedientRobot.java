package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot t = new Robot();
	public static void main(String[] args) {
		String command = JOptionPane.showInputDialog("What shape do you want me to draw?");
		String color = JOptionPane.showInputDialog("What color do you want me to use?");
		if(color.equals( "red")) {
	        t.setPenColor(255,0,0);
	    }
	    if(color.equals("blue")) {
	        t.setPenColor(0,0,255);
	    }
	    if(color.equals("green")) {
	        t.setPenColor(0,255,0);
	    }
	    if (command.equalsIgnoreCase("square")) {
			square();
		}
	    else if (command.equalsIgnoreCase("circle")) {
			circle();
		}
	    else if (command.equalsIgnoreCase("triangle")) {
			triangle();
		}
		else {
			t.setSpeed(10);
			t.turn(999999999);
		}
	}
	static void square() {
		t.setSpeed(50);
		t.miniaturize();
		t.setPenWidth(5);
		t.penDown();
		for (int i = 0; i < 4; i++) {
			t.turn(90);
			t.move(100);	
		}
		t.penUp();
		t.move(100);
	}
	static void circle() {
		t.setSpeed(50);
		t.miniaturize();
		t.setPenWidth(5);
		t.penDown();
		for (int i = 0; i < 90; i++) {
			t.turn(4);
			t.move(5);
		}
		t.penUp();
		t.move(100);
	}
	static void triangle() {
		t.setSpeed(50);
		t.miniaturize();
		t.setPenWidth(5);
		t.penDown();
		for (int i = 0; i < 3; i++) {
			t.move(100);
			t.turn(120);

		}
		t.penUp();
		t.move(200);
	}

}
