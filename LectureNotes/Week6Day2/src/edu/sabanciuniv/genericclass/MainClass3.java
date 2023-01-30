package edu.sabanciuniv.genericclass;

import java.util.ArrayList;

public class MainClass3 {

	public static void main(String[] args) {
	
		
		ArrayList isimler = new ArrayList();
		
		isimler.add("aaa");
		isimler.add("bbb");
		isimler.add("ccc");
		isimler.add(123);
		
		 Integer uc = (Integer) isimler.get(3); //Type Casting burada zorunlu
		 
		 int z = 145 * uc;
		 System.out.println(uc);
		 
		 String c = (String)isimler.get(0);
		
		
		
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("zzz");
		names.add("yyy");
		//names.add(334);
		
		String abc = names.get(1); //Type Casting yapmaya gerek yok
		

	}

}
