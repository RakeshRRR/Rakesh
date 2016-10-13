package com.java.day4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("Z");
		ts.add("S");
		ts.add("R");
		//ts.add(4);Heterogeneous Objects are no possible
		//ts.remove(2);default natural sorting order
		ts.add("Z");
		//ts.add(null);
		System.out.println(ts);  
		/*Iterator<Object> i = ts.iterator();
		
		while(i.hasNext()){
			Object o1 =i.next();
			System.out.println(o1);*/
		
		

	}

}

