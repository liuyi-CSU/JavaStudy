package day19;

import java.math.BigInteger;
import java.util.Scanner;

public class Test05 {

	/**
	 * 模拟审核身份证的过程, 按照要求实现相关代码.(友情提示: 不一定需要使用正则) 
	 * a. 提示用户在控制台输入身份证号, 用一个字符串进行保存 
	 * b. 判断身份证号码是否是18位或者16位 
	 * c. 判断身份证号除最后一位外, 其他都是数字 
	 * d. 将身份证中的生日信息获取出来并打印到控制台上.
	 * 比如身份证号码为: 420683199010194273 截取后的结果为: 19901019
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入身份证号:");
		Scanner sca = new Scanner(System.in);
		String str=sca.nextLine();
		if(str.length()!=18&&str.length()!=16){
			System.out.println("请输入正确长度的身份证号");
			str=sca.nextLine();
		}
		method1(str);
		System.out.println("生日:"+str.substring(6, 14));
	}

	private static void method1(String str) {
		try {
			String str2=str.substring(0, str.length()-1);
			long num= Long.parseLong(str2);
			System.out.println("num="+num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("请输入正确格式的身份证号");
		}
	}

}
