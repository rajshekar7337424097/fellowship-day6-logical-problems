package com.Bl.Logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int reverse = 0;
		for (int i = 1; i <= number; i++) {
			int reminder =  number % 10;
			reverse =  (reverse * 10 ) + reminder;
			number = number / 10;
		}
		System.out.println("reverse of number"+reverse);
	}
	

}
