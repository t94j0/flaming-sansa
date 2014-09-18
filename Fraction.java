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


	public Fraction reduce() {
		int gcd = gcd(numerator, denominator);
		Fraction answer = new Fraction(numerator / gcd,
				denominator / gcd);
		return answer;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public int toDecimal() {
		int answer = numerator / denominator;
		return answer;
	}
	
	public Fraction toRecip() {
		Fraction answer = new Fraction(denominator, numerator);
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
