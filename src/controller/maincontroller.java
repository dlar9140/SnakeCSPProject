package controller;
import javax.swing.JFrame;

public class maincontroller
{
	public maincontroller() 
	{
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake Game");
		
		frame.pack();
		frame.setVisible(true);
	}

public static void main(String[] args) {
	
	new maincontroller();

	}
}