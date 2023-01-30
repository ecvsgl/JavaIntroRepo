package edu.sabanciuniv.it524.ui.main;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class MainClass {
	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Efe");
		SatrancTahtasi tahta = new SatrancTahtasi();
		tahta.ekrandaGoster();
		tahta.taslariDiz();
				
		
		
		
		
		//frm.getContentPane().setLayout(new FlowLayout());//Flowlayout otomatik yerleştirir objeleri readjustment olduğu zaman screen siz
		//frm.setVisible(true); //Frame kapanması default olarak uygulama kapanması demek değildir.
		
		
	}

}
