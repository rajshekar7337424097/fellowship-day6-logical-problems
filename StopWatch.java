package com.Bl.Logical;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		double dif;
		Scanner sc =  new Scanner(System.in);
		System.out.println("press enter to start a time");
		double start = sc.nextInt();
		start  = System.currentTimeMillis();
		
		System.out.println("press enter to stop the  time");
		double  stop = sc.nextInt();
		stop = System.currentTimeMillis();
		sc.close();
		
		if (stop == 0) {
			double now = System.currentTimeMillis();
			dif = now - start;
		} else {
			 dif = stop - start;
		}
		// in microseconds
		System.out.println("elapsed time is: " +  dif + "ms");
		// in milliseconds
		double mils = dif % 1000;
		System.out.println("elapsed time is: " + mils + "msecs");
		dif = (dif - mils) / 1000;
		// in seconds
		double secs = dif % 60;
		System.out.println("elapsed time is: " + secs + "secs");
		dif = (dif - secs) / 60;
		// in minutes
		double minutes = dif % 60;
		System.out.println("elapsed time is: " + minutes + "min");

		
		
			
	}

}
