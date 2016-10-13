package com.java.day4;

import java.util.HashSet;
import java.util.SortedSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetExample {

	
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
		h.add(1);//insertion order not preserved
		h.add("rani");
		h.add(4);
		h.add("rakkesh");
		h.add ("Reddy");
		
		//h.clear();
		h.isEmpty();
		System.out.println(h);
		
		java.util.Iterator<Object> it =  h.iterator();
		while(it.hasNext()){
			Object O= it.next();
			System.out.println(O);
		}
		
		

	}

}
