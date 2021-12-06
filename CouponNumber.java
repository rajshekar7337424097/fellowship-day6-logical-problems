package com.Bl.Logical;

import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter required number of coupons");
		int N = sc.nextInt();
		sc.close();
		char[] r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

		for (int i = 0; i < N; i++) {
			int random = (int) (Math.random() * 999999999); 

			StringBuffer sb = new StringBuffer();
			while (random > 0) {
				sb.append(r[random % r.length]);
				random /= r.length;
			}
			String CouponCode = sb.toString();
			System.out.println("Coupon Code \t" + CouponCode);
		}
	}
}



