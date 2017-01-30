package character;

import java.awt.event.KeyEvent;

public class player extends Character {
	
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
	
	void keyReleased(KeyEvent e){
		System.out.println(e);
	}
}
