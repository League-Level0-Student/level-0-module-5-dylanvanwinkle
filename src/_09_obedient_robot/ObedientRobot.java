package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot r = new Robot("batman");

	public static void main(String[] args) {
		
		r.penDown();
		
		int task = JOptionPane.showOptionDialog(null, "What Shape do you want to see drawn.", "Shape", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Square", "Trangle", "Circle" }, null);

		int color = JOptionPane.showOptionDialog(null, "What color do you want the shape to be drawn in..", "Color", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Red", "Green", "Blue" }, null);

		if (color == 0) {
			r.setPenColor(255, 0, 0);

		}else if (color == 1) {
			r.setPenColor(0, 255, 0);

		}else if (color == 2) {
			r.setPenColor(0, 0, 255);

		}
		
		if (task == 0) {

			DrawSquare();

		}else if (task == 1) {
			DrawTriangle();

		}else if (task == 2) {
			DrawCircle();

		}
	}

	public static void DrawSquare() {
		r.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			r.move(100);
			r.turn(90);
		}
		r.penUp();
		r.move(480);
	}

	public static void DrawTriangle() {
		r.setSpeed(100);
		for (int i = 0; i < 3; i++) {
			r.move(100);
			r.turn(120);
		}
		r.penUp();
		r.move(480);
	}

	public static void DrawCircle() {
		r.setSpeed(100);
		for (int i = 0; i < 36; i++) {
			r.move(10);
			r.turn(10);
		}
		r.penUp();
		r.move(480);
	}
}
