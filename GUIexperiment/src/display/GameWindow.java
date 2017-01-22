package display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;

import gameObjects.Ball;
import gameObjects.Block;
import gameObjects.GameObject;
import gameObjects.Paddle;
import levels.LevelLoader;

public class GameWindow extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static GameWindow INSTANCE;

	private GameWindow()
	{
		int height = 800;
		Dimension size = new Dimension((int)(height*1280.0/1024),height);
		this.setSize(size);
		this.setResizable(false);
		this.setVisible(true);
	

	}


	public void paint(Graphics page)
	{
		this.setBackground(this.getBackground());
		page.clearRect(0, 0, this.getWidth(), this.getHeight());
		ArrayList<GameObject> gameObjects = LevelLoader.getLevelLoader().getObjs();
		for(int i = 0; i<gameObjects.size();i++)
		{
			GameObject obj = gameObjects.get(i);
			if(!obj.isDestroyed())
			{
				page.setColor(obj.getBackground());
				if(obj instanceof Ball)
					page.fillOval(obj.getX(), obj.getY(), obj.getWidth(), obj.getHeight());
				else
					page.fillRect(obj.getX(), obj.getY(), obj.getWidth(), obj.getHeight());
				
			}
		}

		
	}

	public static GameWindow getGW()
	{
		if(INSTANCE == null)
			INSTANCE = new GameWindow();
		return INSTANCE;
	}



}
