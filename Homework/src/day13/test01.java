package day13;

import java.util.Scanner;

public class test01 {

	/**
	 * ����¼��һ���ַ���,��������λ��������"#"�滻,�õ��µ��ַ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ���");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		char[] ch = method(str);
		String str1=new String(ch);
		System.out.println(str1);
	}

	private static char[] method(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i%2!=0){
				ch[i]='#';
			}
		}
		return ch;
	}

}
