package TEST100;

public class Test14 {

	/**
	 * ��дһ���࣬����ΪItheima;
	 * ������һ��������������theEnd;
	 * ����һ���ַ�����һ������������������ǰ�淵��һ���ַ�������1�����ǲ���������false�� 
	 * ����������´����ĺ��淵��һ���ַ�������1��
	 * �ַ������Ƿǿյġ�
	 * ��ʾ: 
	 * ��������					 ����ֵ
	 * theEnd("Hello",true) 	"H" 
	 * theEnd("Hello",false) 	"o"
	 * theEnd("oh",true) 		"o"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(theEnd("Hello",true));
	}

	private static char[] theEnd(String string, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Itheima{
	public static String theEnd(String str,Boolean bl){
		if(bl==true){
			return str.substring(0,0);
		}else{
			return str.substring(str.length(),str.length());
		}
	}
}