package TEST100;

public class Test34 {

	/**
	 * ������һ��������������middleThree;

	  ����һ���������ȵ��ַ��������м䷵���ַ�������3�����ԡ�candy��������and���� �ַ�����������Ϊ3��
	
	��ʾ:
	�������� 						����ֵ 
	middleThree("Candy") 		"and" 
	middleThree("and") 			"and" 
	middleThree("solving") 		"lvi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(middleThree("Candy"));
		System.out.println(middleThree("and"));
		System.out.println(middleThree("solving"));
	}

	private static String middleThree(String str) {
		// TODO Auto-generated method stub
		if(str.length()<3||str.length()%2!=1){
			System.out.println("�����볤�ȴ��ڵ���3���������ȵ��ַ���");
			return "";
		}else{
			return str.substring(str.length()/2-1, str.length()/2+2);
		}
	}

}
