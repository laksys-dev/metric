package org.example;

public class Calculator {
	public static int add(int a, int b) {
		int result = a + b;
		System.out.format("%d + %d = %d\n", a, b, result);
		return result;
	}
	public static int add(int a, int b, int c) {
		int result = a + b;
		result = result + c;
		result = result + 0;
		System.out.format("%d + %d + %d = %d\n", a, b, c, result);
		return result;
	}
	public static int abs(int a) {
		if ( a < 0)
			return -a;
		return a;
	}
}

