package TEST100;

public class Test42 {

	/**
	 *  ������һ��������������withoutString;

		  ���������ַ�������base��remove������ɾ����remove�ַ�����base�ַ����������ִ�Сд����
		���ҷ��ص�base�ַ���������remove���ص�������
		���磺("This is a FISH", "IS") -> "Th a FH" 
		
		��ʾ:
		�������� ����ֵ 
		withoutString("Hello there","llo") "He there" 
		withoutString("Hello there","e") "Hllo thr" 
		withoutString("Hello there","x") "Hello there" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutString("Hello there","llo"));
		System.out.println(withoutString("Hello there","e"));
		System.out.println(withoutString("Hello there","x"));
	}

	private static String withoutString(String str, String str2) {
		// TODO Auto-generated method stub
		String Str=str.toLowerCase();
		String Str2=str2.toLowerCase();
		StringBuffer sb=new StringBuffer(str);
		while()
		return sb.toString();
	}

}
