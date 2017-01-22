package gameObjects;

import java.awt.Color;

public abstract class MovingObject extends GameObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3621196247527293987L;
	private double xVel;
	private double yVel;
	private double xAccel;
	private double yAccel;
	private boolean moving;
	private double velMod;
	private double accelMod;
	
	
	
	public MovingObject(int x, int y, boolean destroyed, int width, int height,Color color, double xVel, double yVel, double xAccel, double yAccel, 
			boolean moving) 
	{
		super(x, y, destroyed, width, height, color);
		this.xVel = xVel;
		this.yVel = yVel;
		this.xAccel = xAccel;
		this.yAccel = yAccel;
		this.setVelMod(1);
		this.setAccelMod(1);
		this.setMoving(moving);

	}



	public double getxVel() {
		return xVel;
	}



	public double getyVel() {
		return yVel;
	}



	public double getxAccel() {
		return xAccel;
	}



	public double getyAccel() {
		return yAccel;
	}



	public void setxVel(double xVel) {
		this.xVel = xVel;
	}



	public void setyVel(double yVel) {
		this.yVel = yVel;
	}



	public void setxAccel(double xAccel) {
		this.xAccel = xAccel;
	}



	public void setyAccel(double yAccel) {
		this.yAccel = yAccel;
	}



	public boolean isMoving() {
		return moving;
	}



	public void setMoving(boolean moving) {
		this.moving = moving;
	}



	public double getVelMod() {
		return velMod;
	}



	public void setVelMod(double velMod) {
		this.velMod = velMod;
	}



	public double getAccelMod() {
		return accelMod;
	}



	public void setAccelMod(double accelMod) {
		this.accelMod = accelMod;
	}

}
