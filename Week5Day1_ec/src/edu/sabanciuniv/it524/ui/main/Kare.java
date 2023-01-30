package edu.sabanciuniv.it524.ui.main;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Kare extends JPanel{
	private int defaultSquareSize = 100;
	private int startingPointX = 200;
	private int startingPointY = 60;
	public Kare(int x, int y) 
	{
		if((x+y)%2== 0) 
		{
			this.setBackground(Color.white);
		}
		else
		{
			this.setBackground(Color.lightGray);
		}
		this.setLocation(startingPointX+(defaultSquareSize*y),startingPointY+(defaultSquareSize*x));
		this.setSize(defaultSquareSize,defaultSquareSize);
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
	}

}
