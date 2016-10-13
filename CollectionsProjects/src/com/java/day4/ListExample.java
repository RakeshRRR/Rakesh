package com.java.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
	         int b =    a.length;
		System.out.println(b);
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Rakesh");
		l.add("srunjith");
		l.add("Ravi");
		l.add("RamReddy");
		Collections.synchronizedList(l);
		//Collections.sort(l);
		System.out.println(l.size());   
		System.out.println(l.isEmpty());
		Object[] o = l.toArray();
		for(Object o1:o){
			System.out.println(o1);
		}
		// System.out.println(o);
		
      System.out.println(l);
      Iterator<String> itr = l.iterator();
      while(itr.hasNext()){
    	  System.out.println(itr.next());
      }
      
    	  

      /*for(Object o:l){
    	  System.out.println(o);
      }*/
	}

}
