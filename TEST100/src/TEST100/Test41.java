package TEST100;

public class Test41 {

	/**
	 * ������һ��������������right2;

		 ����һ���ַ���������һ������ת��2���汾���������2���ַ��ƶ�����ʼ�� �ַ�����������Ϊ2��
		
		��ʾ:
		�������� 				����ֵ 
		right2("Hello") 	"loHel" 
		right2("java") 		"vaja" 
		right2("Hi") 		"Hi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
	}

	private static String right2(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		return sb.append(str.substring(str.length()-2)).append(str.substring(0, str.length()-2)).toString();
	}

}
