package TEST100;

public class Test45_firstTwo {

	/**
	 * ������һ��������������firstTwo;

		  ����һ���ַ�������������ǰ�����ַ�����ɵ��ַ���������ַ�����Hello��������He����
		����ַ����ȳ���2С�����ر������ԡ�X��������X�������ַ��������������ַ���������
		ע��str.length���������ַ����ĳ��ȡ�
		
		
		��ʾ:
		�������� 					����ֵ 
		firstTwo("Hello") 		"He" 
		firstTwo("abcdefg") 	"ab" 
		firstTwo("ab") 			"ab" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
	}

	private static String firstTwo(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=2){
			return str;
		}else{
			return str.substring(0, 2);
		}
	}

}
