package com.deitel.cap16.colecoesgenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		//criação da lita
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<>();
		
		//atribui a lista de strings para o list
		for (String color : colors) {
			list.add(color);
		}
		
		//lista de conteúdo para remover
		String[] removeColors = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<>();
		
		for (String color : removeColors) {
			removeList.add(color);
		}
		
		System.out.println("ArrayList: ");
		
		//exibindo o conteúdo da lista completa
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		
		//chama o método que verifica o conteúdo para remover
		removeColors(list, removeList);
		
		System.out.printf("%n%nArrayList after calling removeColors:%n");
		
		//exibição da lista após remoção
		for(String color : list) {
			System.out.printf("%s ", color);
		}
	}
	
	private static void removeColors(Collection<String> listaCompleta, Collection<String> listaDoQueRemover) {
		Iterator<String> iterator = listaCompleta.iterator();
		
		while(iterator.hasNext()) {
			if (listaDoQueRemover.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
}
