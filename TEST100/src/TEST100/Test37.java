package TEST100;

public class Test37 {

	/**
	 * ������һ��������������withoutX2;

		  ����һ���ַ��������ǰ�����ַ��е�һ���������ǡ�x����
		�򷵻�û����Щ��x���ַ����ַ��������򷵻��ַ������䡣 
		
		
		��ʾ:
		�������� ����ֵ 
		withoutX2("xHi") "Hi" 
		withoutX2("Hxi") "Hi" 
		withoutX2("Hi") "Hi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutX2("xHi"));
		System.out.println(withoutX2("Hxi"));
		System.out.println(withoutX2("Hi"));
	}

	private static String withoutX2(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(str.length()<2)return null;
		char[] ch=str.substring(0, 2).toCharArray();
		for (char c : ch) {
			if(c!='x'){
				sb.append(c);
			}
		}
		sb.append(str.substring(2));
		return sb.toString();
	}

}
