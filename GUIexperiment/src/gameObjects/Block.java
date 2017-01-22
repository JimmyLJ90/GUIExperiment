package gameObjects;

import java.awt.Color;

public class Block extends GameObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6134135067556110360L;
	private int worth;
	private boolean speedUpgrade, accelUpgrade, widthUpgrade;
	
	public Block(int x, int y, boolean visible, int width, int height,Color color, int worth, 
			boolean speedUpgrade, boolean accelUpgrade,boolean widthUpgrade) 
	{
		super(x, y, visible, width, height,color);
		this.worth = worth;
		this.speedUpgrade = speedUpgrade;
		this.accelUpgrade = accelUpgrade;
		this.widthUpgrade = widthUpgrade;
		
	}


	public int getWorth() {
		return worth;
	}

	public boolean isSpeedUpgrade() {
		return speedUpgrade;
	}

	public boolean isAccelUpgrade() {
		return accelUpgrade;
	}

	public boolean isWidthUpgrade() {
		return widthUpgrade;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	public void setSpeedUpgrade(boolean speedUpgrade) {
		this.speedUpgrade = speedUpgrade;
	}

	public void setAccelUpgrade(boolean accelUpgrade) {
		this.accelUpgrade = accelUpgrade;
	}

	public void setWidthUpgrade(boolean widthUpgrade) {
		this.widthUpgrade = widthUpgrade;
	}

	
	

}
