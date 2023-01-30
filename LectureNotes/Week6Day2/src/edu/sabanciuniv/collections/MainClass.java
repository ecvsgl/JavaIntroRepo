package edu.sabanciuniv.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
	
		//List
		
		//Insertion order korunur
		List<String> aList = new ArrayList<>();
		aList.add("www");
		aList.add("rrrr");
		aList.add("yyy");
		for(String a : aList)
		{
			System.out.println(a);
		}
		
		//Set
		
		Set<Integer> sayilar = new HashSet<>();
		for (int i = 0;i <5 ;i++)
		{
			sayilar.add(i*i);
		}
		
		sayilar.add(0);
		sayilar.add(0);
		sayilar.add(0);
		for (int x : sayilar)
		{
			System.out.println(x);
		}
		
		
		//Map
		
		Map<String, Integer> plakalar = new LinkedHashMap<>();
		
		plakalar.put("Istanbul", 34);
		plakalar.put("Izmir", 35);
		plakalar.put("Ankara", 6);
		
		
		System.out.println(plakalar.get("Istanbul"));
		
		System.out.println("-----");
		System.out.println(plakalar);
		for (Integer val : plakalar.values())
		{
			System.out.println(val);
		}
		

	}

}
