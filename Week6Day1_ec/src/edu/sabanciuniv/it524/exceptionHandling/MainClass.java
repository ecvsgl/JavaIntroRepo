package edu.sabanciuniv.it524.exceptionHandling;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main (String [] args) {
		String input1 =
				JOptionPane.showInputDialog("Lütfen birinci sayıyı girin : ");
		String input2 =
				JOptionPane.showInputDialog("Lütfen ikinci sayıyı girin : ");
		
		int sayi1; //Parantez dışına çıkması için.
		int sayi2;
		
		try 
		{
			sayi1 = Integer.parseInt(input1);			// Parantez dışına nasıl çıkcak? Önceden initialize et.
			sayi2 = Integer.parseInt(input2);			// Parantez dışına nasıl çıkcak?

			JOptionPane.showMessageDialog(null, "Girdiğiniz sayı : "+sayi1); //bunu try içine de alabilirsin.

			int sonuc = sayi1/sayi2;
			JOptionPane.showMessageDialog(null, "Sonuç: "+sonuc);
		} 
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Number format hatalı.");
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace(); //Exception nerden kaynaklı bilmiyorsan bu sana neden olduğunu söyler. Yerini de. MÜKO!
			String txt = "";
			for (StackTraceElement element: e.getStackTrace()) {
				txt += element;
			}
			JOptionPane.showMessageDialog(null, "Arith exept." + txt);
			return; //alt satıra geçsin istemiyoruz çünkü. Burda bitmeli eğer yanlış girildi ise.
		}

	}
}
