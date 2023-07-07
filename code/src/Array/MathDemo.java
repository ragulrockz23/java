package Array;

import java.util.Scanner;
import java.lang.Math;

public class MathDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter X Value :");
		int x = sc.nextInt();
		System.out.println("Enter Y Value :");
		int y = sc.nextInt();
		// 28 power of 4 i.e. 28*28*28*28
		System.out.println("The Power value :" + Math.pow(x, y));
		// the square root of y
		System.out.println("The Square value :" + Math.sqrt(y));
		// the addition of x,y
		System.out.println("The Addition value :" + Math.addExact(x, y));
		// the Subtraction of x,y
		System.out.println("The Subtract value :" + Math.subtractExact(x, y));
		// the maximum value of x,y
		System.out.println("The Maximum value :" + Math.max(x, y));
		// the minimum value of x,y
		System.out.println("The Minimum value :" + Math.min(x, y));
		// the cuberoot value of x
		System.out.println("The Cuberoot value :" + Math.cbrt(x));
		// the random value of x
		System.out.println("The Random value :" + Math.random());
		// the exp of x
		System.out.println("The Minimum value :" + Math.exp(x));
		// the log value of x
		System.out.println("The log value :" + Math.log(x));
		// the log10 value of x
		System.out.println("The log10 value :" + Math.log10(x));
		// the log1p value of x
		System.out.println("The log1p value :" + Math.log1p(x));
		// the sin value of x
		System.out.println("The Sin value :" + Math.sin(x));
		// the log value of x
		System.out.println("The Cos value :" + Math.cos(x));
		// the log value of x
		System.out.println("The Tan value :" + Math.tan(x));

	}

}
