package TEST100;

public class Test23 {

	/**
	 * ������һ��������������withoutX;
	 * 
	 * ����һ���ַ����������һ�������һ���ַ���'x'���򷵻�û����Щ'x'�ַ������ַ����� ���򷵻��ַ������䡣
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * withoutX("xHix") 	"Hi" 
	 * withoutX("xHi") 		"Hi" 
	 * withoutX("Hxix") 	"Hxi"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutX("Hxix"));
	}
	public static String withoutX(String str){
		if(str.startsWith("x")&&str.endsWith("x")){
			return str.substring(1, str.length()-1);
		}
		else if(str.startsWith("x")){
			return str.substring(1);
		}else if(str.endsWith("x")){
			return str.substring(0, str.length()-1);
		}else{
			return str;
		}
	}

}
