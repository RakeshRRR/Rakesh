package com.java.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExam {
	public static void main(String [] args){
		LinkedList<Integer> L = new LinkedList<Integer>();
		L.add(1);
		L.add(5);
		L.add(0, 0);
		L.add(1, 1);
		L.add(10);
		L.addFirst(25);
		L.addLast(22);
		L.remove(4);
		System.out.println(L);
	/*	for(Integer I:L){
			System.out.println(I);
		}*/
		
		Iterator<Integer> it = L.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Integer I = it.next();
			System.out.println(I);
		}
		
		
	}

}
