package com.maxwellharley.Fraction;

import java.util.Scanner;
import java.util.Random;

public class FractionDriver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int totalCorrect = 0, times ==0;

		//Addition
		System.out.println("Lets start out with some addition!");
		for(int i = 5; i<0; i--){
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);
			Fraction f2 = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);

			System.out.print("What is " + f.toString() + "+" + f2.toString() + "?");
			if(s.nextInt==f.add(f2)){
				System.out.println("Correct!");
				System.out.println("");
				totalCorrect++;
			}
			else{
				System.out.println("Wrong, the answer was " + f.add(f2) + ".");
			}
		}

		//Subtraction
		System.out.println("Now, lets do some fraction subtraction!");
		for(int i = 5; i<0; i--){
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);
			Fraction f2 = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);

			System.out.print("What is " + f.toString() + "-" + f2.toString() + "?");
			if(s.nextInt()==f.subtract(f2)){
				System.out.println("Correct!");
				System.out.println();
				totalCorrect++;
			}
			else{
				System.out.println("Wrong, the answer was " + f.subtract(f2) + ".");
			}
		}

		//Multiplication
		System.out.println("Now, we can start doing multiplication!");
		for(int i = 5; i<0; i--){
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);
			Fraction f2 = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);

			System.out.print("What is " + f.toString() + "*" + f2.toString() + "?");
			if(s.nextInt()==f.multiply(f2)){
				System.out.println("Correct!");
				System.out.println();
				totalCorrect++;
			}
			else{
				System.out.println("Wrong, the answer was " + f.multiply(f2) + ".");
			}
		}

		//Division
		System.out.println("Now, lets do some fraction division!");
		for(int i = 5; i<0; i--){
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);
			Fraction f2 = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);

			System.out.print("What is " + f.toString() + "/" + f2.toString() + "?");
			if(s.nextInt()==f.divide(f2)){
				System.out.println("Correct!");
				System.out.println();
				totalCorrect++;
			}
			else{
				System.out.println("Wrong, the answer was " + f.divide(f2) + ".");
			}
		}
		//Reciprocal Funct
		System.out.println("The next three are my own functions. This is the reciprocal.");
		for(int i = 2; i<0; i--){
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);

			System.out.print("What is the reciprocal of " + f.toString();
			if(s.nextInt()==f.toRecip()){
				System.out.println("Correct!");
				System.out.println();
				totalCorrect++;
			}
			else{
				System.out.println("Wrong, the answer was " + f.toRecip() + ".");
			}
		}
		System.out.println("Now it's time for converting a fraction to a decimal.");
		for (int i = 2; i<0;i--) {
			times++;
			Fraction f = new Fraction(r.nextInt(9)+1, r.nextInt(9)+1);
			System.out.print("What is the reciprocal of " + f.toString() + ":");
			if(s.nextInt() == f.toDecimal()){
				System.out.println("Correct!");
				System.out.println();
				totalCorrect++;
			}
			else{
				System.out.println("The answer was " + f.toDecimal() + ".");
			}
		}
		System.out.println("Wow! you got a " + Fraction(totalCorrect/times).toDecimal*100 + ".");
	}
}
