package day19;

public class Test03 {

	/**
	 * 用1,2,3,4这四个数字, 用java写一个main函数, 打印出所有不同的排列. 如1234,1243等. 要求: "4"不能在第一位,
	 * "1"和 "3"不能相连.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		while (num <= 4321) {
			if (num >= 1234 && num <= 4321 && String.valueOf(num).contains("4")
					&& String.valueOf(num).contains("3")
					&& String.valueOf(num).contains("2")
					&& String.valueOf(num).contains("1")
					&& !String.valueOf(num).contains("13")
					&& !String.valueOf(num).contains("31")
					&& !String.valueOf(num).startsWith("4")) {
				System.out.println(num);
			}
			num++;
		}
	}
}
