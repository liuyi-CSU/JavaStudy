package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test06 {

	/**
	 * 6.编写程序，循环接收用户从键盘输入多个字符串，直到输入“end”时循环结束，并将所有已输入的字符串倒序打印
		例如输入: 
		abc
		def
		end
		输出: fedcba
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串，end结束");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		str = method(sca, str);
	}

	private static String method(Scanner sca, String str) {
		while((!str.equals("end"))&&(!str.isEmpty())){
			char[] ch=str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[ch.length-1-i]);
			}
			str=sca.nextLine();
		}
		return str;
	}
}
