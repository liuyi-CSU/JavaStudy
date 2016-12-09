package day19;

import java.util.Scanner;

public class Test01 {

	/**
	 * 在考虑异常的情况下, 键盘录入一个整数, 并将其转换为二进制的字符串表示形式.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数:");
		System.out.println("输入'q'结束");
		Scanner sca=new Scanner(System.in);
		String line=sca.nextLine();
		while(!line.equals("q")){
			try {
				int num=Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("录入错误,请重新录入");
			}
			line=sca.nextLine();
		}
	}

}
