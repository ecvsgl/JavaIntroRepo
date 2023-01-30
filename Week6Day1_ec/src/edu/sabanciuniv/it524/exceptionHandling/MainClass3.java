package edu.sabanciuniv.it524.exceptionHandling;

import javax.swing.JOptionPane;

public class MainClass3 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		try {
			calc.bolme(1, 123);
		} catch (YeniException e) {
			JOptionPane.showMessageDialog(null, "YeniExptOluştu" + e.getMessage());
			e.printStackTrace();
		}
	}

}
