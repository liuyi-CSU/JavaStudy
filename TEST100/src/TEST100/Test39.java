package TEST100;

public class Test39 {

	/**
	 *  类中有一个方法，方法名mixString;

		  给定两个字符串参数a和b，创建一个更大的字符串，由a的第一个字符，b的第一个字符，
		a的第二个字符，b的第二个字符等组成。 任何剩余的字符在结果的末尾。
		例如："abc"和"xyz"返回的是："axbycz".
		
		提示:
		方法调用 						期望值 
		mixString("abc","xyz") 		"axbycz" 
		mixString("Hi","There") 	"HTihere" 
		mixString("xxxx","There") 	"xTxhxexre" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mixString("abc","xyz"));
		System.out.println(mixString("Hi","There"));
		System.out.println(mixString("xxxx","There"));
	}

	private static String mixString(String string, String string2) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		int len=string.length()<string2.length()?string.length():string2.length();
		String str=string.substring(len);
		String str2=string2.substring(len);
		char[] ch=string.toCharArray();
		char[] ch2=string2.toCharArray();
		for (int i = 0; i < len; i++) {
			sb.append(ch[i]).append(ch2[i]);
		}
		sb.append(str).append(str2);
		return sb.toString();
	}

}
