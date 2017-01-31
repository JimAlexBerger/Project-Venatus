package character;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener{
	
	private double dx = 0;
	private double dy = 0;
	
	double forceX = 0;
	double forceY = 0;
	
	public void update(){
		this.dx += forceX;
		this.dy += forceY;
		this.x += dx;
		this.y += dy;
		this.forceX = 0;
		this.forceY = 0;
		this.dx *= 0.9;
		this.dy *= 0.9;
	}
	
	@Override
	public void keyReleased(KeyEvent e){
		System.out.println("released");
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("pressed");

		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("typed");

		
	}
	
}
