package TEST100;

public class test06 {

	/**
	 * 
	 ����һ���ַ��������һ������Ϊ2�����ַ������������Ŀ�ʼ�ͽ����� 
	 ����һ���ַ����� û���Ӵ��ڿ�ͷ�����ԡ�HelloHe��������lloHe����
	 * �Ӵ������������ص�����ˡ�Hi������������ ���򣬷���ԭʼ�ַ������䡣
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * without2("HelloHe") 	"lloHe" 
	 * without2("HelloHi") 	"HelloHi"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloHe";
		without2(str);
	}

	private static void without2(String str) {
		if(str.startsWith(str.substring(str.length()-2))){
			String substring = str.substring(2);
			System.out.println(substring);
		}else{
			System.out.println(str);
		}
	}

}
