package TEST100;

public class test01 {

	/**
	 *  ����һ���ַ��������ǰ�����ַ��е�һ���������ǡ�x����
		�򷵻�û����Щ��x���ַ����ַ��������򷵻��ַ�������

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="xabcde";
		String str2=str1.substring(2);
		System.out.println(withoutX2(str1, str2));
	}

	private static String withoutX2(String str1, String str2) {
		char[] ch=str1.toCharArray();
		for (int i = 0; i < 2; i++) {
			if(ch[i]!='x'){
				str2=ch[i]+str2;
			}
		}
		return str2;
	}

}
