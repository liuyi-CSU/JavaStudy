package TEST100;

public class Test43 {

	/**
	 * ������һ��������������withoutEnd;

		  ����һ���ַ���������һ��û�е�һ�������һ���ַ��İ汾�����ԡ�Hello��������all���� �ַ�����������Ϊ2��
		
		��ʾ:
		�������� 					����ֵ 
		withoutEnd("Hello") 	"ell" 
		withoutEnd("java") 		"av" 
		withoutEnd("coding") 	"odin" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}

	private static String withoutEnd(String str) {
		// TODO Auto-generated method stub
		if(str.length()<2){
			System.out.println("�ַ�����������Ϊ2");
			return null;
		}else{
			return str.substring(1, str.length()-1);
		}
	}

}
