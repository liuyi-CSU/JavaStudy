package TEST100;

public class test02 {

	/**
	 * ����2���ַ�����a��b������һ���µ��ַ�������a�ĵ�һ���ַ���b�����һ���ַ��� ���ԡ�you���͡�java��������ya����
	 * �����һ���ַ����ĳ���Ϊ0����ʹ��'@'��Ϊ��ȱ�ٵ��ַ���
	 * 
	 * ��ʾ: 
	 * �������� 						����ֵ 
	 * lastChars("last","chars") 	"ls" 
	 * lastChars("yo","java") 		"ya"
	 * lastChars("hi","") 			"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="last";
		String b="";
		StringBuilder str=lastChars(a, b);
		System.out.println(str);//
	}

	private static StringBuilder lastChars(String a, String b) {
		if(a.equals("")){
			a="@";
		}
		if(b.equals("")){
			b="@";
		}
		StringBuilder str=new StringBuilder();
		str.append(a.substring(0, 1));
		str.append(b.substring(b.length()-1));
		return str;
	}

}
