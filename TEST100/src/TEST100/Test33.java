package TEST100;

public class Test33 {

	/**
	 * ������һ��������������helloName;

		  ����һ���ַ������͵����֣�����"Bob",����"Hello Bob!"
		
		
		��ʾ:
		�������� ����ֵ 
		helloName("Bob") "Hello Bob!" 
		helloName("Alice") "Hello Alice!" 
		helloName("X") "Hello X!" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
	}
	public static String helloName(String str){
		return "Hello "+str;
	}

}
