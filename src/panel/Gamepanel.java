package panel;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gamepanel extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 500, HEIGHT = 500;
	


	public Gamepanel() {
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

}
