package com.deitel.cap16.colecoesgenericas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.deitel.cap08.classes_e_objetos.Time2;

public class Sort3 {

	public static void main(String[] args) {
		List<Time2> list = new ArrayList<>();
		
		list.add(new Time2(6, 24, 34));
		list.add(new Time2(18, 14, 58));
		list.add(new Time2(6, 05, 34));
		list.add(new Time2(12, 14, 58));
		list.add(new Time2(6, 24, 22));
		
		System.out.printf("Unsorted array elements:%n%s%n", list);
		
		Collections.sort(list, new TimerComparator());
		
		System.out.printf("Sorted list elements:%n%s%n", list);
	}
}
