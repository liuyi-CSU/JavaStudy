package TEST100;

public class Test30 {

	/**
	 * ������һ��������������nTwice;

		  ����һ���ַ�����һ��int n������һ����ԭ�ַ�����ǰn���ַ��ͺ�N���ַ���ɵ��ַ���,
		�ַ�����������Ϊn����
		
		��ʾ:
		�������� 						����ֵ 
		nTwice("Hello",2) 			"Helo" 
		nTwice("Chocolate",3) 		"Choate" 
		nTwice("Chocolate",1) 		"Ce" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nTwice("Hello",2));
		System.out.println(nTwice("Chocolate",3));
		System.out.println(nTwice("Chocolate",1));
	}

	private static String nTwice(String string, int i) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(i>string.length()){
			System.out.println("�ַ�����������Ϊn��");
			return "";
		}else{
			sb.append(string.substring(0, i)).append(string.substring(string.length()-i));
			return sb.toString();
		}
	}

}
