package gameObjects;

import java.awt.Color;

public final class Paddle extends MovingObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3473088651746244091L;
	private double speedMax;
	private int timeWithWidthUpgrade;
	private int timeWithSpeedUpgrade;
	private int timeWithAccelUpgrade;
	private boolean widthUpgrade;
	private boolean speedUpgrade;
	private boolean accelUpgrade;
	private double widthMod;

	public Paddle(int x, int y, boolean visible, int width, int height,Color color, double xVel, double yVel, double xAccel, double yAccel,
			boolean moving, double speedMax) {
		super(x, y, visible, width, height,color, xVel, yVel, xAccel, yAccel, moving);
		this.speedMax = speedMax;
		timeWithWidthUpgrade = timeWithSpeedUpgrade = timeWithAccelUpgrade = 0;
		widthUpgrade = speedUpgrade = accelUpgrade = false;
		widthMod = 1;
		this.addKeyListener(new PaddleKeyboardListener(this));
		
	}
	


	public int getTimeWithWidthUpgrade() {
		return timeWithWidthUpgrade;
	}

	public int getTimeWithSpeedUpgrade() {
		return timeWithSpeedUpgrade;
	}

	public int getTimeWithAccelUpgrade() {
		return timeWithAccelUpgrade;
	}

	public boolean isWidthUpgrade() {
		return widthUpgrade;
	}

	public boolean isSpeedUpgrade() {
		return speedUpgrade;
	}

	public boolean isAccelUpgrade() {
		return accelUpgrade;
	}

	public double getWidthMod() {
		return widthMod;
	}

	


	public void setTimeWithWidthUpgrade(int timeWithWidthUpgrade) {
		this.timeWithWidthUpgrade = timeWithWidthUpgrade;
	}

	public void setTimeWithSpeedUpgrade(int timeWithSpeedUpgrade) {
		this.timeWithSpeedUpgrade = timeWithSpeedUpgrade;
	}

	public void setTimeWithAccelUpgrade(int timeWithAccelUpgrade) {
		this.timeWithAccelUpgrade = timeWithAccelUpgrade;
	}

	public void setWidthUpgrade(boolean widthUpgrade) {
		this.widthUpgrade = widthUpgrade;
	}

	public void setSpeedUpgrade(boolean speedUpgrade) {
		this.speedUpgrade = speedUpgrade;
	}

	public void setAccelUpgrade(boolean accelUpgrade) {
		this.accelUpgrade = accelUpgrade;
	}

	public void setWidthMod(double widthMod) {
		this.widthMod = widthMod;
	}


	public double getSpeedMax() {
		return speedMax;
	}


	public void setSpeedMax(double speedMax) {
		this.speedMax = speedMax;
	}


}
