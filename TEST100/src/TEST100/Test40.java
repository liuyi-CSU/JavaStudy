package TEST100;

public class Test40 {

	/**
	 *  ������һ��������������minCat;

		 ���������ַ�����������ƴ����һ�𣬲����ؽ����
		���ǣ���������ַ����ĳ��Ȳ�ͬ����ӽϳ��ַ�����ʡ���ַ���ʹ������϶��ַ����ĳ�����ͬ��
		���硰Hello���͡�Hi��������loHi���� ���ַ����������κγ��ȡ�
		
		
		��ʾ:
		�������� ����ֵ 
		minCat("Hello","Hi") "loHi" 
		minCat("Hello","java") "ellojava" 
		minCat("java","Hello") "javaello" 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCat("Hello","Hi"));
		System.out.println(minCat("Hello","java"));
		System.out.println(minCat("java","Hello"));
	}

	private static String minCat(String str, String str2) {
		// TODO Auto-generated method stub
		int len=str.length()<str2.length()?str.length():str2.length();
		StringBuffer sb=new StringBuffer();
		return sb.append(str.substring(str.length()-len)).append(str2.substring(str2.length()-len)).toString();
	}


}
