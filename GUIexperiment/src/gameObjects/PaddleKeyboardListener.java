package gameObjects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gameLogic.GameMaster;

public final class PaddleKeyboardListener implements KeyListener {
	
	Paddle paddle;
	
	public PaddleKeyboardListener(Paddle paddle)
	{
		this.paddle = paddle; 
	}

	@Override
	public void keyPressed(KeyEvent k) {
		int keyCode = k.getKeyCode();
		if(keyCode == KeyEvent.VK_RIGHT)
		{
			paddle.setLocation((int)(paddle.getX()+1*GameMaster.getGM().timePassed()),paddle.getY());
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			
			paddle.setLocation((int)(paddle.getX()-1*GameMaster.getGM().timePassed()),paddle.getY());
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent k) {
		int keyCode = k.getKeyCode();
		if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT)
		{
			paddle.setxVel(0);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
	
		
	}

}
