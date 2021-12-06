package com.Bl.Logical;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("enter value ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		int prev = 0;
		int current =1;
		if(count > 0) {
			System.out.println(prev);
			System.out.println(current);
			for (int i = 1; i <= count; i++) {
				int temp = prev + current;
				System.out.println(temp+"\t");
				prev = current;
				current= temp;
			}

		}else {
			System.out.println("invalid input");
		}
	}
}


