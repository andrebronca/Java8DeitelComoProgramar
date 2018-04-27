package com.deitel.cap08.classes_e_objetos;

public class Time2 {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if (second <= 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	//resolvi implementar desta forma
	private boolean validateTime(int hour, int minute, int second) {
		
		if (hour < 0 || hour >= 24) {
			return false;
		}
		
		if (minute < 0 || minute >= 60) {
			return false;
		}
		
		if (second <= 0 || second >= 60) {
			return false;
		}
		
		return true;
	}
	
	//adaptado
	public void setTime(int hour, int minute, int second) {
		if (validateTime(hour, minute, second)) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			throw new IllegalArgumentException("Verifique os valores: hour(0-23), minute and second (0-59)");
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("Hour must be 0-23");
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("Minute must be 0-59");
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("Second must be 0-59");
		}
		this.second = second;
	}
	
	//formato: HH:MM:SS
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond()) + " "
				+ (getHour() < 12 ? "AM" : "PM");
	}
	
}
