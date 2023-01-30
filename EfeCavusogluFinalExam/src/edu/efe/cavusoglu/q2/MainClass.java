package edu.efe.cavusoglu.q2;

public class MainClass {

	public static void main(String[] args) {
		DBWriter writer = new DBWriter();
		writer.writeTextToDatabase("products.txt");
	}

}
	