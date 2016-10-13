package com.java.day4;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedHashsetexam {

	public static void main(String[] args) {
		LinkedHashSet<Integer> L = new LinkedHashSet<Integer>();
		L.add(1);
		L.add(5);
		L.add(0);//insertion order preserved
		L.add(1);
		L.add(10);
		//L.addFirst(25);
		//L.addLast(22);
		L.remove(4);
		System.out.println(L);
		
		java.util.Iterator<Integer> it = L.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
