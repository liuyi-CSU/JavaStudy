package TEST100;

public class Test20 {

	/**
	 * ������һ��������������firstHalf;
	 * 
	 * ����һ������Ϊż�����ַ����������ϰ벿�֡� �����ַ�����WooHoo��������Woo����
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ 
	 * firstHalf("WooHoo") 		"Woo" 
	 * firstHalf("HelloThere") 	"Hello"
	 * firstHalf("abcdef") 		"abc"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstHalf("HelloThere"));
	}

	private static String firstHalf(String str) {
		// TODO Auto-generated method stub
		return str.substring(0,str.length()/2);
	}

}
