package com.deitel.cap16.colecoesgenericas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {

	public static void main(String[] args) {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> list = Arrays.asList(suits);
		
		System.out.printf("Array não ordenado: %s%n", list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Array na ordem inversa: %s%n", list);
	}
}
