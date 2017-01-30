package gameLogic;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import display.GameWindow;
import gameObjects.Ball;
import gameObjects.GameObject;
import gameObjects.Paddle;
import levels.LevelLoader;

public class GameMaster {

	private boolean gameRunning;
	private static GameMaster INSTANCE;
	private long calcTime;

	private GameMaster()
	{
		gameRunning = true;
		calcTime = System.currentTimeMillis();
	}

	public void run()
	{
		final int FRAMES_PER_SECOND = 60;
		final int TICKS_PER_SECOND = 1000;
		final int TICKS_SKIPPED = TICKS_PER_SECOND/FRAMES_PER_SECOND;
		long nextGameTick = System.currentTimeMillis();
		final int MAX_FRAMESKIP = 5;
		int loops;
		LevelLoader.getLevelLoader().loadLevel1();
		
		while(gameRunning)
		{
			loops = 0;
			if(!GameWindow.getGW().isShowing())
			{
				gameRunning = false;
				GameWindow.getGW().dispose();
			}
			

			while(System.currentTimeMillis()>nextGameTick && loops<MAX_FRAMESKIP)
			{
				nextGameTick += TICKS_SKIPPED;
				loops++;
				displayGame();
			}
			
			updateGame();
			
			
		

		}
	}

	private void displayGame()
	{
		GameWindow.getGW().repaint();
	}
	
	
	private void updateGame()
	{
		ArrayList<GameObject> objs = LevelLoader.getLevelLoader().getObjs();
		//movePaddle((Paddle)objs.get(objs.size()-1));
		//		moveBall((Ball)objs.get(objs.size()-2));

	}

	private void movePaddle(Paddle p)
	{
		if(p.isMoving())
		{
			p.setxVel(p.getxVel());
			p.setLocation((int)(p.getX()+p.getxVel()), p.getY());
			if(p.getLocation().getX()<=0)
			{
				p.setLocation(0,p.getY());
			}
			else if(p.getLocation().getX()>=GameWindow.getGW().getWidth())
			{
				p.setLocation(GameWindow.getGW().getWidth(),p.getY());
			}
		}
	}

	//	private void moveBall(Ball b);
	//	{
	//		
	//	}

	public long timePassed()
	{
		return System.currentTimeMillis()-calcTime;
	}

	private void startCalcTime()
	{
		calcTime = System.currentTimeMillis();
	}



	

	public static GameMaster getGM()
	{
		if(INSTANCE == null)
			INSTANCE = new GameMaster();
		return INSTANCE;
	}

	public boolean isGameRunning() {
		return gameRunning;
	}

	public void setGameRunning(boolean gameRunning) {
		this.gameRunning = gameRunning;
	}






}
