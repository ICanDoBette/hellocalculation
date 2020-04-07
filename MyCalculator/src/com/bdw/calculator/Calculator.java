package com.bdw.calculator;


/*public class CalculatorUtil {
	//加法
	public int addNum(int a,int b) {
		return a+b;
	}
	//减法
	public int subtNum(int a,int b) {
		return a-b;
	}
	//乘法
	public int multNum(int a,int b) {
		return a*b;
	}
	//除法
	public int divNum(int a,int b) {
		return a/b;
	}
	//平方
	public double squNum(int a) {
		return Math.sqrt(a);
	}
	
	public static int Calculate(char[] num) {
		int level = 0;  //优先级
		int sum = 0;
		int a = 0;
		//运算对象栈
		char[] opnd = new char[10];
		//运算符栈
		char[] oprt = new char[10];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (num[i] == j) {
					
				} 
			}
		}
	}
}*/

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	//运算常量
	private final static char ADD = '+';
	private final static char SUBTRACT = '-';
	private final static char MULTIPLY = '*';
	private final static char DIVIDE = '/';
	private final static char SQU = '$';
	public static void main(String[] args) {
		// 鑾峰彇杈撳叆鐨勫��  
		// "3+(1*2)-(5+2)"
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数字表达式：");
		String expression = in.nextLine();
		String postfix = Calculator.infixToPostfix(expression);
		System.out.println(postfix);
		System.out.println(Calculator.calculator(postfix));
	}

	/**
	 * 璇ユ柟娉曠敤鏉ュ皢涓紑琛ㄨ揪寮忥紙鏁板琛ㄨ揪寮忥級杞负鍚庣紑琛ㄨ揪寮忥紙閫嗘尝鍏拌〃杈惧紡锛�
	 * Infix to Postfix 
	 * http://blog.fishc.com/2093.html/2#prettyPhoto 涓紑琛ㄨ揪寮忚浆鍚庣紑琛ㄨ揪寮�
	 * http://blog.tpircsboy.com/acm/poj-1686/  鍚庣紑琛ㄨ揪寮忔眰鍊�
	 * http://www.aijava.cn/13197.html
	 * @param infixPression
	 * @return
	 */
	public static String infixToPostfix(String infixExpression){
		Stack<Character> S1 = new Stack<Character>();// 杩愮畻绗︽爤
		Stack<Character> S2 = new Stack<Character>();// 琛ㄨ揪寮忔爤
		int len = infixExpression.length(); // 涓紑琛ㄨ揪寮忕殑闀垮害
		int index = 0;
		while(index < len){ // 寰幆鍙栧嚭涓紑琛ㄨ揪寮忎腑鐨勫瓧绗�
			char c = infixExpression.charAt(index);
			switch(c){
			case '(':
				S1.push(c);
				break;
			case ')':
				while(S1.peek() != '(') {
					S2.push(S1.pop());
				}
				S1.pop();
				break;
			case ADD:
			case SUBTRACT:
				while(!S1.empty() && S1.peek() != '(') {
					S2.push(S1.pop());
				}
				S1.push(c);
				break;
			case MULTIPLY:
			case DIVIDE:
			case SQU:
				while(!S1.empty() && S1.peek().toString().matches("["+MULTIPLY+DIVIDE+"]")) {
					S2.push(S1.pop());
				}
				S1.push(c);
				break;
			default:
				S2.push(c);
			}
			index++;
		}
		while(!S1.empty()) {
			S2.push(S1.pop());
		}
		Iterator<Character> iter = S2.iterator();
		StringBuffer postSeq = new StringBuffer();
		while(iter.hasNext()) {
			postSeq.append(iter.next());
		}
		return postSeq.toString();
	}
	
	public static int calculator(String postfix) {
		Stack<Integer> S = new Stack<Integer>();
		int op1,op2,result = 0;//涓存椂鍙橀噺锛屼繚瀛樻搷浣滅鍜屼腑闂寸粨鏋�
		for(int i=0; i<postfix.length(); i++) {
				if(postfix.charAt(i)=='+' ||postfix.charAt(i)=='-' ||postfix.charAt(i)=='*' ||postfix.charAt(i)=='/') {
					// 濡傛灉鍙栧嚭鐨勬槸鎿嶄綔绗�
					//System.err.println("绗﹀悎"+postfix.charAt(i));
					op1 = Integer.parseInt(S.pop()+"");
					op2 = Integer.parseInt(S.pop()+"");
					result = calculatorTwoNum(op1, op2, postfix.charAt(i));//璁＄畻涓棿缁撴灉
					//System.out.println("缁撴灉锛�"+result);
					S.push(result);
				}else if (postfix.charAt(i)=='$') {
					op1 = Integer.parseInt(S.pop()+"");
					result = calculatorSquNum(op1);
					S.push(result);
				} 
		else if(Character.isDigit(postfix.charAt(i))){
					//涓嶆槸鎿嶄綔绗﹀氨鐩存帴鍘嬪叆鏍�
					//System.err.println("鏁板瓧"+postfix.charAt(i));
					S.push(Integer.parseInt(postfix.charAt(i)+""));
				}
				
		}
		return result;
	}

	private static int calculatorTwoNum(int op1, int op2, char operator) {
		int result = 0;
		//鍒嗘儏鍐佃绠�
		switch (operator) {
		case ADD:
			result=op1+op2;
			break;
		case SUBTRACT:
			result=op2-op1;
			break;
		case MULTIPLY:
			result=op1*op2;
			break;
		case DIVIDE:
			result=op2/op1;
			//System.out.println("res:"+result);
			break;
		}
		return result;
	}
	private static int calculatorSquNum(int op1) {
		return op1*op1;
	}
}

