package day13;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();//String里的方法的点操作需要重新赋值,因为String会重新创建对象,原内容变为垃圾
		System.out.println(sb);
	}

}
