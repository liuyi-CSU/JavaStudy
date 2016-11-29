package day13;

import java.util.Scanner;

public class test05 {

	/**
	 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母 思路: 1.定义以星期的字母开头的数组 String[]
	 * arr = { "", "M", "Tu", "W", "Th", "F", "Sa", "Su" }; 2.定义汉字数组 String[]
	 * arrWeek = { "", "一", "二", "三", "四", "五", "六", "日" }; 3.死循环.
	 * 当键盘录入M,W等唯一的字母时, 直接打印对应的星期 当键盘录入T,S时, 继续录入第二个字母进行判断 当录入其他字母时, 直接要求继续录入
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "", "M", "Tu", "W", "Th", "F", "Sa", "Su" };
		String[] arrWeek = { "", "一", "二", "三", "四", "五", "六", "日" };
		System.out.println("请输入星期几的第一个字母:");
		Scanner sca = new Scanner(System.in);
		while (true) {
			String str = sca.nextLine();
			if (!str.equals("T") && !str.equals("S")) {
				while(!find(arr, arrWeek,str)){
					System.out.println("请重新输入:");
					str=sca.nextLine();
				}
				break;
			} else if (str.equals("T") || str.equals("S")){
				System.out.println("请输入第二个字符:");
				String str2 = str + sca.nextLine();
				while(!find(arr, arrWeek,str2)){
					System.out.println("请重新输入第二个\"小写\"字符:");
					str2=str+sca.nextLine();
				}
				break;
			}
			
		}
	}

	private static boolean find(String[] arr, String[] arrWeek,String str) {
		boolean flag=false;
		for (int i = 0; i < arrWeek.length; i++) {
			if (str.equals(arr[i])) {
				System.out.println(arrWeek[i]);
				flag=true;
				return flag;
			}
		}
		return flag;
	}

}
