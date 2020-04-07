package com.bdw.calculator;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数字表达式：");
		String expression = in.nextLine();
		String postfix = Calculator.infixToPostfix(expression);
		System.out.println(expression + '=' +Calculator.calculator(postfix));
		new ShowCalculator().show(expression+ '=' +Calculator.calculator(postfix));
	}
}
