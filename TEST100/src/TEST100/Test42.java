package TEST100;

public class Test42 {

	/**
	 *  类中有一个方法，方法名withoutString;

		  给定两个字符串参数base和remove，返回删除了remove字符串的base字符串（不区分大小写），
		并且返回的base字符串不含有remove的重叠事例。
		例如：("This is a FISH", "IS") -> "Th a FH" 
		
		提示:
		方法调用 期望值 
		withoutString("Hello there","llo") "He there" 
		withoutString("Hello there","e") "Hllo thr" 
		withoutString("Hello there","x") "Hello there" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutString("Hello there","llo"));
		System.out.println(withoutString("Hello there","e"));
		System.out.println(withoutString("Hello there","x"));
	}

	private static String withoutString(String str, String str2) {
		// TODO Auto-generated method stub
		String Str=str.toLowerCase();
		String Str2=str2.toLowerCase();
		StringBuffer sb=new StringBuffer(str);
		while()
		return sb.toString();
	}

}
