package TEST100;

public class test13 {

	/**
	 * 
	 ����һ���ַ���������һ��û���ַ����ĵ�һ�������һ���ַ��İ汾�� �ַ����������κγ��ȣ�����0��
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ
	 * withouEnd2("Hello") 	"ell" 
	 * withouEnd2("abc") 	"b"
	 * withouEnd2("ab") 	""
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withouEnd2("Hello"));
	}
	public static String withouEnd2(String str){
		if(str.length()<=2)return "";
		else{
			return str.substring(1, str.length()-1);
		}
	}

}
