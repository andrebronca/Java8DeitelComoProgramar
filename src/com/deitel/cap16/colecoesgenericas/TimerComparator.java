package com.deitel.cap16.colecoesgenericas;

import java.util.Comparator;

import com.deitel.cap08.classes_e_objetos.Time2;

public class TimerComparator implements Comparator<Time2> {

	@Override
	public int compare(Time2 t1, Time2 t2) {
		int hourDifference = t1.getHour() - t2.getHour();
		
		if (hourDifference != 0) {
			return hourDifference;
		}
		
		int minuteDifference = t1.getMinute() - t2.getMinute();
		
		if (minuteDifference != 0) {
			return minuteDifference;
		}
		
		int secondDifference = t1.getSecond() - t2.getSecond();
		return secondDifference;
	}

}
