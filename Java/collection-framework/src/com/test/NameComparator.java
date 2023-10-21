package com.test;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
	 return o1.name.compareTo(o2.name); // 0 Aman Bhuvan A>B  65>66   -1  1
	}
	

}
