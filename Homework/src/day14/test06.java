package day14;

public class test06 {

	/**
	 * ����һ�ַ�������������ַ����е�����֮�͡� ���磺sumNumbers("abc123xyz") �� 123
	 * 
	 * ��ʾ: ʹ�� Pattern �� Matcher �� �������� ����ֵ sumNumbers("abc123xyz") 123
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
