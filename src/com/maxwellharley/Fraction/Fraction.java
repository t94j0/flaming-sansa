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

	public Fraction add(Fraction inp) {
		int lcd = lcd(denominator, inp.getDenominator());
		Fraction answer = new Fraction(1, 1);
		if (numerator > inp.getNumerator()) {
			answer = new Fraction((inp.getNumerator() * lcd) + (numerator), lcd);
		} else if (numerator <= inp.getNumerator()) {
			answer = new Fraction((inp.getNumerator()) + (numerator * lcd), lcd);
		}
		// answer = answer.reduce(answer);
		return answer;
	}

	public Fraction subtract(Fraction inp) {
		int lcd = lcd(inp.getNumerator(), inp.getDenominator());
		Fraction answer = new Fraction((inp.getNumerator() * lcd)
				- (numerator * lcd), inp.getDenominator() * lcd);
		answer = answer.reduce(answer);
		return answer;
	}

	// My own
	public int toDecimal(Fraction inp) {
		int answer = inp.getNumerator() / inp.getDenominator();
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

	// my own
	public Fraction recip(Fraction inp) {
		Fraction answer = new Fraction(inp.getDenominator(), inp.getNumerator());
		return answer;
	}

	// goes to the reduce function
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public int lcd(int a, int b) {
		for (int c = 1; c < b; c++) {
			if (c * a % b == 0) {
				return c * a;
			}
		}
		return a * b;
	}

	public Fraction reduce(Fraction inp) {
		int gcd = gcd(inp.getNumerator(), inp.getDenominator());
		Fraction answer = new Fraction(inp.getNumerator() / gcd,
				inp.getDenominator() / gcd);
		return answer;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}
