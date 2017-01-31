package launcher;

import java.awt.EventQueue;

import character.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		
		Player tim = new Player();
		System.out.println(tim.x);
	}

}
