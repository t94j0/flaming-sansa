package com.maxwellharley.Fraction;

public class Fraction {
	private int denominator, numerator;

	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public Fraction add(Fraction inp){
		int gcd = gcd(inp.numerator, inp.denominator);
		Fraction answer = new Fraction()
	}
	//My own
	public int toDecimal(Fraction inp){
		int answer = inp.numerator/inp.denominator;
		return answer;
	}
	
	public Fraction multiply(Fraction inp) {
		Fraction answer = new Fraction(numerator * inp.getNumerator(),
				denominator * inp.getDenominator());
		answer = reduce(answer);
		return answer;
	}

	public Fraction divide(Fraction inp) {
		Fraction answer = new Fraction(numerator / inp.getNumerator(),
				denominator / inp.getDenominator());
		answer = reduce(answer);
		return answer;
	}
	//my own
	public Fraction recip(Fraction inp) {
		Fraction answer = new Fraction(inp.denominator, inp.numerator);
		return answer;
	}
	//goes to the reduce function
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public Fraction reduce(Fraction inp) {
		int gcd = gcd(inp.numerator, inp.denominator);
		Fraction answer = new Fraction(inp.numerator / gcd, inp.denominator
				/ gcd);
		return answer;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}
