package TEST100;

public class Test36 {

	/**
	 *  ������һ��������������endsLy;

		  ��һ���ַ���������ԡ�ly����β���ַ���������true��
		
		
		��ʾ:
		�������� 				����ֵ 
		endsLy("oddly") 	true 
		endsLy("y") 		false 
		endsLy("oddy") 		false 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
	}

	private static boolean endsLy(String string) {
		// TODO Auto-generated method stub
		
		return string.endsWith("ly");
	}

}
