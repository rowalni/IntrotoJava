package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
			Robot r2d2 = new Robot();
	
	// 3. delete this line (used only for testing)
		void go() {
			
		// 6. Make the robot go as fast as possible
				r2d2.setSpeed(15);
		// 4. make a variable to hold the length of the triangle and set it to 50
				int length = 50;
		// 7. Do the following (up to step 10) 60 times
				for (int i = 0; i < 60; i++) {
					
				}
			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
					drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right

	

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length); {
		r2d2.penDown();
		for (int i = 0; i < 3; i++) {
			r2d2.move(length);
			r2d2.turn(360/3);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
}
