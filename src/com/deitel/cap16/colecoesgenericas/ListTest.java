package com.deitel.cap16.colecoesgenericas;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>();
		
		for (String color : colors) {
			list1.add(color);
		}
		
		String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<>();
		
		for (String color: colors2) {
			list2.add(color);
		}
		
		list1.addAll(list2);	//concatena as listas
		list2 = null;			//esvazia a lista
		printList(list1);
		
		convertToUpperCaseStrings(list1);
		printList(list1);
		System.out.println("..................");
		
		System.out.printf("%nDeleting elements 4 to 6...");
		removeItems(list1, 4, 7);	//remove: violet, silver, gold (método tem a explicação)
		printList(list1);
		printReversedList(list1);
	}
	
	private static void printList(List<String> list) {
		System.out.printf("%nList:%n");
		
		for (String color : list) {
			System.out.printf("%s ", color);
		}
		
		System.out.println();
	}
	
	private static void convertToUpperCaseStrings(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while (iterator.hasNext()) {
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	
	private static void removeItems(List<String> list, int start, int end) {
		/* funcionamento: 
		 * inicio da remoção: start (tem contagem inicial em: 0)
		 * término da remoção: end (tem contagem sequencial): 1, 2, 3, ...
		 */
		list.subList(start, end).clear();	//remove os itens
	}
	
	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%nReversed List:%n");
		
		while (iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());	
		}
	}
}
