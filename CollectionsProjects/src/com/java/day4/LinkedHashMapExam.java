package com.java.day4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExam {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m2 = new LinkedHashMap<Integer, String>(5);
		m2.put(1, "Ram");
		m2.put(1, "Raki");
		m2.put(3, "Reddy");
		m2.put(4, "Ram");
		m2.put(5, "Raki");
		m2.put(6, "Reddy");
		m2.put(null, null);
		m2.remove(5);
		System.out.println(m2.containsKey(6)); 
		System.out.println(m2.get(3));
		System.out.println(m2);
		Set s = m2.entrySet();
		Iterator I1 = s.iterator();
		while(I1.hasNext()){
			Map.Entry<Integer, String> m3 =(Map.Entry<Integer, String>) I1.next();
			System.out.println(m3.getKey()+ "           " + m3.getValue());
		}

	}

}
