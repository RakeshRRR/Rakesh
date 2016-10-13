package com.java.day4;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<Integer, String> m1 = new TreeMap<Integer, String>();
		m1.put(1, "Ram");
		m1.put(1, "Raki");
		m1.put(3, "deddy");
		m1.put(4, "Ram");
		m1.put(5, "Raki");
		m1.put(6, "Reddy");
		//m1.put(null, null);
		//m1.put(null, null);
		System.out.println(m1);
		
		Set t = m1.entrySet();
		Iterator I2 =t.iterator();
		while(I2.hasNext()){
			Map.Entry<Integer,String> m2 = (Map.Entry<Integer,String>) I2.next();
			
			//System.out.println(m2);
			System.out.println(m2.getKey()+"    "+m2.getValue());
		
		}

		

	}

}
