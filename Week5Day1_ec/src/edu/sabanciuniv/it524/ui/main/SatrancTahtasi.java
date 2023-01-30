package edu.sabanciuniv.it524.ui.main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class SatrancTahtasi extends JFrame{
	
	private Kare [][] kareler = new Kare [8][8];
	
	public SatrancTahtasi()
	{
		this.setTitle("Satranç V1.0");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Artık kapanınca çarpı ile, uygulama da quit edicek.
		this.setSize(600,600);
		this.setLocation(200,100);
		this.getContentPane().setLayout(null);

		for(int x = 0; x<8; x++) {
			for (int y=0; y<8;y++) {
				
				Kare kare = new Kare(x,y);
				kareler [x][y] = kare;

				this.getContentPane().add(kare);
			}
		}
		public void ekrandaGoster() {
			this.setVisible(true);		
	}
	}

	
