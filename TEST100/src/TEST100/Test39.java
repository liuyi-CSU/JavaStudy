package TEST100;

public class Test39 {

	/**
	 *  ������һ��������������mixString;

		  ���������ַ�������a��b������һ��������ַ�������a�ĵ�һ���ַ���b�ĵ�һ���ַ���
		a�ĵڶ����ַ���b�ĵڶ����ַ�����ɡ� �κ�ʣ����ַ��ڽ����ĩβ��
		���磺"abc"��"xyz"���ص��ǣ�"axbycz".
		
		��ʾ:
		�������� 						����ֵ 
		mixString("abc","xyz") 		"axbycz" 
		mixString("Hi","There") 	"HTihere" 
		mixString("xxxx","There") 	"xTxhxexre" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mixString("abc","xyz"));
		System.out.println(mixString("Hi","There"));
		System.out.println(mixString("xxxx","There"));
	}

	private static String mixString(String string, String string2) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		int len=string.length()<string2.length()?string.length():string2.length();
		String str=string.substring(len);
		String str2=string2.substring(len);
		char[] ch=string.toCharArray();
		char[] ch2=string2.toCharArray();
		for (int i = 0; i < len; i++) {
			sb.append(ch[i]).append(ch2[i]);
		}
		sb.append(str).append(str2);
		return sb.toString();
	}

}
