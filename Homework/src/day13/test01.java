package day13;

import java.util.Scanner;

public class test01 {

	/**
	 * 键盘录入一段字符串,对其奇数位的数据用"#"替换,得到新的字符串并输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一段字符串");
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
