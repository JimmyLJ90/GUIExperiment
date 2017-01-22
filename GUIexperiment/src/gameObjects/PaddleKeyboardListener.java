package gameObjects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
			paddle.setxAccel(1);
			paddle.setMoving(true);
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			paddle.setxAccel(-1);
			paddle.setMoving(true);
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent k) {
		int keyCode = k.getKeyCode();
		if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT)
		{
			paddle.setxAccel(0);
			paddle.setMoving(false);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
	
		
	}

}
