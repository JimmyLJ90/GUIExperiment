package gameObjects;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;

public abstract class GameObject extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6113957664606973966L;
	private Rectangle collisionFrame;
	
	public GameObject(int x, int y, boolean visible, int width, int height , Color color)
	{
		this.setLocation(x, y);
		this.setSize(width, height);
		this.setVisible(visible);
		this.setBackground(color);
		setCollisionFrame(new Rectangle(this.getX(),this.getY(),this.getWidth(),this.getHeight()));
	}

	public Rectangle getCollisionFrame() {
		return collisionFrame;
	}

	public void setCollisionFrame(Rectangle collisionFrame) {
		this.collisionFrame = collisionFrame;
	}

}
