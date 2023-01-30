package edu.sabanciuniv.it524.ui.test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass {

	public static void main(String[] args) {
		//Frame 
		JFrame frm = new JFrame();
		frm.setLocation(100,100);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(500,500);
		frm.getContentPane().setLayout(null);//tüm componentlerin size ve location bilgilerini biz vericez.
		//Üstündeki obje
		JLabel label = new JLabel();
		label.setLocation(200,200);
		label.setSize(300,100);
		ImageIcon whitePawn = new ImageIcon("whitePawn.png");
		label.setIcon(whitePawn);
		frm.getContentPane().add(label);
		
		frm.setVisible(true);
	}

}
