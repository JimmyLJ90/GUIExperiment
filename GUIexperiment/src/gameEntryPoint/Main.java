package gameEntryPoint;

import java.util.concurrent.TimeUnit;

import gameLogic.GameMaster;

public class Main {

	public static void main(String[] args)
	{
		GameMaster gm = GameMaster.getGM();
		gm.run();
	}

}
