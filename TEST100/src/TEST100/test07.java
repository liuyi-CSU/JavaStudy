package TEST100;

public class test07 {

	/**
	 * �������ַ�������code���ֵĴ����� ����code���ֵĴ��� ע��:���ڳ���Ա�ɻϸ��, code�ĵ������ַ�d,���ܴ����.
	 * ����,cobe, come, cope co*e �������ַ���Ҫ��������.
	 * 
	 * ��ʾ: �������� ����ֵ countCode("aaacodebbb") 1 countCode("codexxcode") 2
	 * countCode("cozexxcope") 2
	 */
	public static void main(String[] args) {
		String str = "cozexxcope";
		countCode(str);
		System.out.println(getCount());
	}

	private static int count = 0;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		test07.count = count;
	}

	private static void countCode(String str) {
		// TODO Auto-generated method stub
		int indexOf = str.indexOf("co");
		String str1 = str.substring(indexOf,indexOf +  4);
		String str2 = str.substring(indexOf + 4);
		if (str1.endsWith("e")) {
			count++;
			if (str2.length() >= 4) {
				countCode(str2);
			}
		}else if (str2.length() >= 4) {
			countCode(str2);
		}
	}
}

/*
 * System.out.println(countCode(str)); }
 * 
 * public static int countCode(String str) { return countCode(0, str); }
 * 
 * public static int countCode(int i, String str) { int indexOf =
 * str.indexOf("co"); String str1 = str.substring(indexOf, indexOf + 4); String
 * str2 = str.substring(indexOf + 4); if (str1.endsWith("e")) { if
 * (str2.length() >= 4 && str2.contains("co")) { return countCode(i+1, str2); }
 * else { return i+1; } } else { if (str2.length() >= 4 && str2.contains("co"))
 * { return countCode(i, str2); } else { return i; } } }
 */
