package com.java.day4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Ram");
		m1.put(1, "Raki");
		m1.put(3, "Reddy");
		m1.put(4, "Ram");
		m1.put(5, "Raki");
		m1.put(6, "Reddy");
		m1.put(null, null);
		m1.put(null, null);
		m1.remove(6);
		System.out.println(m1);
		
		Set s = m1.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(s);
		Collection c = m1.values();
		System.out.println(c);
		Set s1 = m1.entrySet();
		System.out.println(s1);
		Iterator i = s1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
               

	}

}
