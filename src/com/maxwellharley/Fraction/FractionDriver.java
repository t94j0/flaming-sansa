package com.maxwellharley.Fraction;

import java.util.Random;

public class FractionDriver {
	public static void main(String[] args) {
		Random r = new Random();
		Fraction f = new Fraction(r.nextInt(9) + 1, r.nextInt(9) + 1);
		Fraction f2 = new Fraction(8, 10);
		System.out.println(f.multiply(f2));
	}
}
