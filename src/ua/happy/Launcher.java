package ua.happy;

import java.util.Date;

public class Launcher {

	public static void main(String[] args) {

		Date date = new Date(System.currentTimeMillis() + 200000);
		Date date2 = new Date(System.currentTimeMillis());
		
		System.out.println(date2);
		System.out.println(date);
		
	}

}
