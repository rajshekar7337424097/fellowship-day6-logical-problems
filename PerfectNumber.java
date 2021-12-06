package com.Bl.Logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("enter the n value");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.close();
		PerfectNumber perfect = new PerfectNumber();
		for (int i = 1; i <= range; i++) {
			if(perfect.checkPerfectNumber(i)) {
				System.out.println(i+"\t");
			}
		}
	}
	public boolean checkPerfectNumber(int number) {
		int sum = 0;
		for(int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			return true;
		}else {
			return false;
		}
	}
}
