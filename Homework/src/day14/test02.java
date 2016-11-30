package day14;

import java.util.Scanner;

public class test02 {

	/**
	 * (1)键盘录入一个小数，要求小数点后的小数位最少2位 (2)定义方法，实现保留小数点后的两位小数(只舍不进) (3)如：输入5.6789
	 * 输出5.67, 输入5.67389 输出5.67
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个小数:");
		Scanner sca = new Scanner(System.in);
		while (true) {
			String str = sca.nextLine();
			String[] str2 = str.split("\\.");
			if (str2.length != 2) {
				System.out.println("请重新输入正确的小数");
			} else {
				if (str2[1].length() < 2) {
					System.out.println("要求小数位至少2位");
					continue;
				}else{
					System.out.println(str2[0]+"."+str2[1].substring(0,2));
					break;
				}
			}
		}
	}

}
