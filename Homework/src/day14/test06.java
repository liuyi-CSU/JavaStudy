package day14;

public class test06 {

	/**
	 * 给定一字符串，求出现在字符串中的数字之和。 例如：sumNumbers("abc123xyz") → 123
	 * 
	 * 提示: 使用 Pattern 与 Matcher 类 方法调用 期望值 sumNumbers("abc123xyz") 123
	 * sumNumbers("aa11b33") 44 sumNumbers("7 11") 18
	 */
	public static void main(String[] args) {
		String str = "7 11";
		System.out.println(sumNumbers(str));
	}

	private static int sumNumbers(String str) {
		String[] str1 = str.split("\\D+");
		int sum = 0;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].length() > 0)
				sum = sum + Integer.parseInt(str1[i]);
		}
		return sum;

	}

}
