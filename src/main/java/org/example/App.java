package org.example;

import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		out.println("---------main begins--------");

		int a = 10;
		int b = 30;
		int c = 20;
		
		
		out.println(Calculator.add(a, b));
		out.println(Calculator.add(a, b, c));
		out.println(Calculator.abs(5));
		
		out.println("---------main ends-----------");
	}

}
