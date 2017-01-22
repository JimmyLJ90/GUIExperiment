package gameLogic;

import display.GameWindow;
import levels.LevelLoader;

public class GameMaster {
	
	private boolean gameRunning;
	private static GameMaster INSTANCE;
	
	private GameMaster()
	{
		gameRunning = true;
	}
	
	public void run()
	{
		LevelLoader.getLevelLoader().loadLevel1();
		while(gameRunning)
		{
			displayGame();
			updateGame();
		}
	}
	
	private void updateGame()
	{
		
	}
	
	private void displayGame()
	{
		GameWindow.getGW().repaint();
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
