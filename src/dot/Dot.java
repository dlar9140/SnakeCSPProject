package dot;

import java.awt.Color;
import java.awt.Graphics;

public class Dot
{
	private int xCoor, yCoor, width, height;
	
	public Dot(int xCoor, int titleSize, int i, int yCoor)
	{
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = titleSize;
		height = titleSize;
	}
	
	public void tick()
	{
		
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(xCoor * width,  yCoor * height,  width, height);
	}

	public int getxCoor()
	{
		return xCoor;
	}

	public void setxCoor(int xCoor)
	{
		this.xCoor = xCoor;
	}

	public int getyCoor()
	{
		return yCoor;
	}

	public void setyCoor(int yCoor)
	{
		this.yCoor = yCoor;
	}
	
	
}
