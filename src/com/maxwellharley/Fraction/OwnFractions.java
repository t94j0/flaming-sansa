package com.maxwellharley.Fraction;
public class OwnFractions{

	public int toDecimal(Fraction inp) {
		int answer = inp.getNumerator() / inp.getDenominator();
		return answer;
	}
	
	public Fraction recip(Fraction inp) {
		Fraction answer = new Fraction(inp.getDenominator(), inp.getNumerator());
		return answer;
	}
	
	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	private int lcd(int a, int b) {
		for (int c = 1; c < b; c++) {
			if (c * a % b == 0) {
				return c * a;
			}
		}
		return a * b;
	}

}