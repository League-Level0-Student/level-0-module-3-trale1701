//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot a = new Robot();
		a.setSpeed(100);
		a.turn(180);
        a.move(200);
        a.turn(180);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 5; i++) {
		String color =JOptionPane.showInputDialog("What color do you what to use?");
		//5. Use an if/else statement to set the pen color that the user requested
        if(color.equals( "red")) {
        	a.setPenColor(255,0,0);
        }
        else if(color.equals("blue")) {
        	a.setPenColor(0,0,255);
        }
        //6. If the user doesn’t enter anything, choose a random color
        else {
        	a.setRandomPenColor();
        }
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
        a.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
        a.penDown();
        a.turn(90);
        a.move(50);
        a.turn(90);
        a.move(50);
        a.turn(90);
        a.move(50);
        a.turn(90);
        a.move(50);
        a.penUp();
        a.move(100);
		}
	}
}
