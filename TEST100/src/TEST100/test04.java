package TEST100;

public class test04 {

	/**
	 * ����һ���ַ��������ظ��ַ������������ָ��������ַ���������
	 * 
	 * ��ʾ: �������� ����ֵ maxBlock("hoopla") 2 maxBlock("abbCCCddBBBxx") 3
	 * maxBlock("") 0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbCCCddBBBBBBBBxx";
		int n = maxBlock(str);
		System.out.println(n);
	}

	private static int maxBlock(String str) {
		int n = 1;//n��ͳ�Ƶ�ǰ��ĸ���ֵĴ���
		int max = 0;//max�����浱ǰ��󳤶�
		char[] ch = str.toCharArray();
		if (ch.length <= 1) {
			n = ch.length;
		} else {
			for (int i = 0; i < ch.length - 1; i++) {
				if (ch[i] == ch[i + 1]) {
					n++;
				} else {
					if (n > max) {
						max = n;
					}
					n = 1;
				}
			}
		}
		if (n > max) {
			max = n;
		}
		return max;
	}

}
