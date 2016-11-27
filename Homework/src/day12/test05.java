package day12;
/**liuyi-CSU*/
import java.util.Collections;
import java.util.Scanner;

public class test05 {

	/**
	 *  需求: 键盘录入一段字符串, 将该字符串反转, 并输出到控制台上
		实现方式一: 倒序遍历数组
		实现方式二: 反转数组
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请录入一段字符串");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		char[] ch=str.toCharArray();
		//method1(ch);
		method2(ch);
	}

	private static void method2(char[] ch) {
		for(int i=0;i<ch.length/2;i++){
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

	private static void method1(char[] ch) {
		for (int i = ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);
		}
	}
}
