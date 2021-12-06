package com.Bl.Logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter the number to check prime or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		PrimeNumber prime = new PrimeNumber();
		prime.checkPrimeNumber(number);

	}
	public void checkPrimeNumber(int number) {
		int i = 2;
		while (i <= number ) {
			if(number % i == 1) {
				System.out.println(number+"\t is Prime number");
			}else {
				System.out.println(number+"\t is not a prime number");
			}
			i++;
			break;
		}
	}
}
