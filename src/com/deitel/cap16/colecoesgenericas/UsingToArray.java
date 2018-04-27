package com.deitel.cap16.colecoesgenericas;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
	
	public static void main(String[] args) {
		
		String[] colors = {"black", "yellow", "green"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		links.addLast("red");	//adiciona na última posição
		links.add("pink");		//adiciona na última posição
		links.add(3, "green");	//adiciona na terceira posição
		links.addFirst("cyan");
		
		//obtém elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("Colors: ");
		
		for (String color: colors) {
			System.out.println(color);
		}
	}
}
