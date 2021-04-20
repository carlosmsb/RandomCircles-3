package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int numOfCircles = 10;
	private static final int minRadius = 5;
	private static final int maxRadius = 50;
	
	public void run() {
		for(int i=0; i<numOfCircles; i++ ) {
			drawCircle();
		}
	}
	
	private void drawCircle() {
		double radius = rgen.nextDouble(minRadius, maxRadius);
		double x = rgen.nextDouble(0, getWidth() - radius * 2);
		double y = rgen.nextDouble(0, getHeight() - radius * 2);
		GOval circle = new GOval(x, y, radius * 2, radius * 2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
}
