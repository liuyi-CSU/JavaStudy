package TEST100;

public class Test21 {

	/**
	 * ������һ��������������middleTwo;
	 * 
	 * ����һ������Ϊż�����ַ���������һ�����м������ַ�����ɵ��ַ����� ����ַ�����string��������ri���� �ַ�����������Ϊ2��
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * middleTwo("string") 	"ri" 
	 * middleTwo("code") 	"od"
	 * middleTwo("ab") 		"ab"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(middleTwo("string"));
	}

	private static String middleTwo(String str) {
		// TODO Auto-generated method stub
		return str.substring(str.length()/2-1, str.length()/2+1);
	}

}
