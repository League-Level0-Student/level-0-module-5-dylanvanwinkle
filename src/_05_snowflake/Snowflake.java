package _05_snowflake;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Snowflake {

	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot r = new Robot();

		// #2. Set your robot's position to x=300 and y=300
		r.setX(300);
		r.setY(300);
		// #3. Put the robot's pen down
		r.penDown();
		// #4. Set the robots speed to 5
		r.setSpeed(5);
		// #5. use a for loop below to do everything 6
		// times (use i as the counter)
		for (int i = 0; i < 6; i++) {

			// #6. Set the pen color to black
			r.setPenColor(0, 0, 0);
			// #7. move the robot by 50
			r.move(50);
			// #8. turn the robot to the right by 60
			r.turn(60);
			// #12. set the pen color to blue for even numbers of i
if(i % 2 == 0) {
	r.setPenColor(0,0,255);
}else {
	r.setPenColor(255,0,0);
}
			// #13. set the pen color to red for all odd numbers of i

			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			for (int j = 0; j < 6; j++) {

				// #10. turn the robot to the left by 60
				r.turn(-60);
				// #11. move the robot by 50 (play the start button)
				r.move(50);
			}
		}
	}

}
