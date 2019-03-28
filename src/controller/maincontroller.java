package controller;
import java.awt.Component;

import javax.swing.JFrame;
import panel.Gamepanel;

public class maincontroller
{
	public maincontroller() 
	{
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake Game");
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setVisible(true);
	}

public static void main(String[] args) {
	
	new maincontroller();

	}
}