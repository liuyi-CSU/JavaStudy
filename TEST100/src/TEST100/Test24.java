package TEST100;

public class Test24 {

	/**
	 * ������һ��������������twoChar;
	 * 
	 * ����һ���ַ�����һ���������Ӹ���������ʼ����һ���ַ�������2�� 
	 * �������̫���̫С���޷������ַ�������2����ʹ��ǰ2���ַ��� �ַ�����������Ϊ2��
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * twoChar("java",0) 	"ja" 
	 * twoChar("java",2) 	"va"
	 * twoChar("java",3) 	"ja"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoChar("java",3));
	}

	private static String twoChar(String string, int i) {
		// TODO Auto-generated method stub
		if(i+2>string.length()){
			return string.substring(0, 2);
		}else{
			return string.substring(i, i+2);
		}
	}

}
