package levels;

import java.awt.Color;
import java.util.ArrayList;

import display.GameWindow;
import gameObjects.Ball;
import gameObjects.GameObject;
import gameObjects.Paddle;

public class LevelLoader {

	private static LevelLoader INSTANCE;
	
	private ArrayList<GameObject> gameObjects;
	
	private LevelLoader() 
	{
		gameObjects = new ArrayList<GameObject>();
	}
	
	public void loadLevel1()
	{
		LevelCreator level = new LevelCreator("level1.txt");
		
		gameObjects.addAll(level.getBlocks());
		
		Ball ball = new Ball(GameWindow.getGW().getSize().width/2-35-70, 630, true, 10, 10, Color.black, 1, 1, 0, 0, true);
		
		Paddle paddle = new Paddle(GameWindow.getGW().getSize().width/2-35, 700, true, 
								   70, 10, Color.blue, 0, 0, 0, 0, false, 5);
		
		gameObjects.add(ball);
		gameObjects.add(paddle);
	}
	
	public ArrayList<GameObject> getObjs()
	{
		return gameObjects;
	}
	
	public static LevelLoader getLevelLoader()
	{
		if(INSTANCE == null)
			INSTANCE = new LevelLoader();
		return INSTANCE;
	}

}
