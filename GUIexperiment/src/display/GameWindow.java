package display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;

import gameObjects.Ball;
import gameObjects.Block;
import gameObjects.Paddle;

public class GameWindow extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static GameWindow INSTANCE;

	private GameWindow()
	{
		Dimension size = new Dimension(600,600);
		this.setSize(size);
		this.setResizable(false);
		this.setVisible(true);


	}


	public void paint(Graphics page)
	{
		this.setBackground(this.getBackground());
		page.clearRect(0, 0, this.getWidth(), this.getHeight());

		
	}

	public static GameWindow getGW()
	{
		if(INSTANCE == null)
			INSTANCE = new GameWindow();
		return INSTANCE;
	}



}
