package com.bdw.calculator;

public class ShowCalculator {
	public static void show(String a) {
		//ȡ���ַ�����
		char[] b = a.toCharArray();
		//�����ַ�����,�����һ��
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':System.out.print("      ");break;
				case '-':System.out.print("    "); break;
				case '*':System.out.print("    ");break;
				case '/':System.out.print("      ");break;
				//��^��ʾ��$
				case '$':System.out.print("       "); break;
				case '0':System.out.print("  �������� "); break;
				case '1':System.out.print("   "); break;
				case '2':System.out.print("  �������� "); break;
				case '3':System.out.print("  �������� "); break;
				case '4':System.out.print("       "); break;
				case '5':System.out.print("  �������� "); break;
				case '6':System.out.print("       "); break;
				case '7':System.out.print("  �������� "); break;
				case '8':System.out.print("  �������� "); break;
				case '9':System.out.print("  �������� "); break;
				case '=':System.out.print("     "); break;
				
			default:
				break;
			}
		}
		System.out.println();
		//�����ַ�����,����ڶ���
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
				case '=':System.out.print(" ��������"); break;

			default:
				break;
			}
		}
		System.out.println();
		//�����ַ�����,���������
		for (int i = 0; i < b.length; i++) {
			switch (b[i]) {
				case '+':{
					System.out.print(" ���� ����");
				break;
				}
				case '-':System.out.print(" ������"); break;
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
				case '2':System.out.print("  �������� "); break;
				case '3':System.out.print("  �������� "); break;
				case '4':System.out.print("  �������� "); break;
				case '5':System.out.print("  �������� "); break;
				case '6':System.out.print("  �������� "); break;
				case '7':System.out.print("       "); break;
				case '8':System.out.print("  �������� "); break;
				case '9':System.out.print("  �������� "); break;
				case '=':System.out.print("     "); break;

			default:
				break;
			}
		}
		System.out.println();
	 //�����ַ�����,������Ĳ�
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
				case '=':System.out.print(" ��������"); break;

			default:
				break;
			}
		}
		System.out.println();
	 //�����ַ�����,��������
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
				case '0':System.out.print("  �������� "); break;
				case '1':System.out.print("   "); break;
				case '2':System.out.print("  �������� "); break;
				case '3':System.out.print("  �������� "); break;
				case '4':System.out.print("       "); break;
				case '5':System.out.print("  �������� "); break;
				case '6':System.out.print("  �������� "); break;
				case '7':System.out.print("       "); break;
				case '8':System.out.print("  �������� "); break;
				case '9':System.out.print("  �������� "); break;
				case '=':System.out.print("     "); break;

			default:
				break;
			}
		}
		System.out.println();
	}
}
