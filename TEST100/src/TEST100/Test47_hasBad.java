package TEST100;

public class Test47_hasBad {

	/**
	 * ������һ��������������hasBad;

	  ����һ���ַ����������bad���������ַ����е�����0��1�����򷵻�true��
	���硰badxxx����xbadxx���������ǡ�xxbadxx���� �ַ����������κγ��ȣ�
	����0.ע�⣺ʹ��.equals�������Ƚ�2���ַ�����
	
	��ʾ:
	�������� 				����ֵ 
	hasBad("badxx") 	true 
	hasBad("xbadxx") 	true 
	hasBad("xxbadxx") 	false 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));
	}

	private static boolean hasBad(String str) {
		// TODO Auto-generated method stub
		if(str.indexOf("bad")<2){
			return true;
		}else{
			return false;
		}
	}

}
