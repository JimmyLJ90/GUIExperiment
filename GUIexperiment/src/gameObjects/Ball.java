package gameObjects;

import java.awt.Color;

public final class Ball extends MovingObject {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6404726336174537094L;

	public Ball(int x, int y, boolean visible, int width, int height,Color color, double xVel, double yVel, double xAccel, double yAccel, boolean moving) {
		super(x, y, visible, width, height,color, xVel, yVel, xAccel, yAccel, moving);
		
	}
	

	
	
	

}
