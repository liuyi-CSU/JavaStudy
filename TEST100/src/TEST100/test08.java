package TEST100;

public class test08 {

	/**
	 * ����һ���ַ���������ַ�����ǰ�����ַ���ĩβ�������ַ�ͬʱ���֣�
	 * �ͷ���true���硰edited�����򷵻�true��
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * frontAgin("edited") 	true 
	 * frontAgin("edit") 	false
	 * frontAgin("ed") 		true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="edited";
		 System.out.println(frontAgin(str));
	}

	private static boolean frontAgin(String str) {
		 return str.endsWith(str.substring(0,2));
	}

}
