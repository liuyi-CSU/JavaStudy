package day19;

public class Test03 {

	/**
	 * ��1,2,3,4���ĸ�����, ��javaдһ��main����, ��ӡ�����в�ͬ������. ��1234,1243��. Ҫ��: "4"�����ڵ�һλ,
	 * "1"�� "3"��������.
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
