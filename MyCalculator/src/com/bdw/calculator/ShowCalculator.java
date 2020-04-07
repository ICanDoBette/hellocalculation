package com.bdw.calculator;

public class ShowCalculator {
	public static void show(String a) {
		//取得字符数组
		char[] b = a.toCharArray();
		//遍历字符数组,输出第一层
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':System.out.print("      ");break;
				case '-':System.out.print("    "); break;
				case '*':System.out.print("    ");break;
				case '/':System.out.print("      ");break;
				//用^表示￥$
				case '$':System.out.print("       "); break;
				case '0':System.out.print("  ———— "); break;
				case '1':System.out.print("   "); break;
				case '2':System.out.print("  ———— "); break;
				case '3':System.out.print("  ———— "); break;
				case '4':System.out.print("       "); break;
				case '5':System.out.print("  ———— "); break;
				case '6':System.out.print("       "); break;
				case '7':System.out.print("  ———— "); break;
				case '8':System.out.print("  ———— "); break;
				case '9':System.out.print("  ———— "); break;
				case '=':System.out.print("     "); break;
				
			default:
				break;
			}
		}
		System.out.println();
		//遍历字符数组,输出第二层
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':{
					System.out.print("   |  ");
				break;
				}
				case '-':System.out.print("    "); break;
				case '*':{
					System.out.print(" \\ /");
					break;
				}
				case '/':{
					System.out.print("   -  ");
					break;
				}
				case '$':System.out.print("   /\\  "); break;
				case '0':System.out.print(" |    |"); break;
				case '1':System.out.print(" | "); break;
				case '2':System.out.print("      |"); break;
				case '3':System.out.print("      |"); break;
				case '4':System.out.print(" |    |"); break;
				case '5':System.out.print(" |     "); break;
				case '6':System.out.print(" |     "); break;
				case '7':System.out.print("      |"); break;
				case '8':System.out.print(" |    |"); break;
				case '9':System.out.print(" |    |"); break;
				case '=':System.out.print(" ————"); break;

			default:
				break;
			}
		}
		System.out.println();
		//遍历字符数组,输出第三层
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':{
					System.out.print(" —— ——");
				break;
				}
				case '-':System.out.print(" ———"); break;
				case '*':{
					System.out.print("  \\ ");
					break;
				}
				case '/':{
					System.out.print(" -----");
					break;
				}
				case '$':System.out.print("  /  \\ "); break;
				case '0':System.out.print("       "); break;
				case '1':System.out.print(" | "); break;
				case '2':System.out.print("  ———— "); break;
				case '3':System.out.print("  ———— "); break;
				case '4':System.out.print("  ———— "); break;
				case '5':System.out.print("  ———— "); break;
				case '6':System.out.print("  ———— "); break;
				case '7':System.out.print("       "); break;
				case '8':System.out.print("  ———— "); break;
				case '9':System.out.print("  ———— "); break;
				case '=':System.out.print("     "); break;

			default:
				break;
			}
		}
		System.out.println();
	 //遍历字符数组,输出第四层
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':{
					System.out.print("   |  ");
				break;
				}
				case '-':System.out.print("    "); break;
				case '*':{
					System.out.print(" / \\");
					break;
				}
				case '/':{
					System.out.print("   -  ");
					break;
				}
				case '$':System.out.print(" /    \\"); break;
				case '0':System.out.print(" |    |"); break;
				case '1':System.out.print(" | "); break;
				case '2':System.out.print(" |     "); break;
				case '3':System.out.print("      |"); break;
				case '4':System.out.print("      |"); break;
				case '5':System.out.print("      |"); break;
				case '6':System.out.print(" |    |"); break;
				case '7':System.out.print("      |"); break;
				case '8':System.out.print(" |    |"); break;
				case '9':System.out.print("      |"); break;
				case '=':System.out.print(" ————"); break;

			default:
				break;
			}
		}
		System.out.println();
	 //遍历字符数组,输出第五层
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':{
					System.out.print("      ");
				break;
				}
				case '-':System.out.print("    "); break;
				case '*':{
					System.out.print("    ");
					break;
				}
				case '/':{
					System.out.print("      ");
					break;
				}
				case '$':System.out.print("       "); break;
				case '0':System.out.print("  ———— "); break;
				case '1':System.out.print("   "); break;
				case '2':System.out.print("  ———— "); break;
				case '3':System.out.print("  ———— "); break;
				case '4':System.out.print("       "); break;
				case '5':System.out.print("  ———— "); break;
				case '6':System.out.print("  ———— "); break;
				case '7':System.out.print("       "); break;
				case '8':System.out.print("  ———— "); break;
				case '9':System.out.print("  ———— "); break;
				case '=':System.out.print("     "); break;

			default:
				break;
			}
		}
		System.out.println();
	}
}
