package gameLogic;

import display.GameWindow;

public class GameMaster {
	
	private boolean gameRunning;
	private GameWindow screen;
	private static GameMaster INSTANCE;
	
	private GameMaster()
	{
		gameRunning = true;
		screen = GameWindow.getGW();
	}
	
	public void run()
	{
		while(gameRunning)
		{
			
		}
	}
	
	private void updateGame()
	{
		
	}
	
	private void displayGame()
	{
		
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
