package TEST100;

public class Test30 {

	/**
	 * 类中有一个方法，方法名nTwice;

		  给定一个字符串和一个int n，返回一个由原字符串中前n个字符和后N个字符组成的字符串,
		字符串长度至少为n个。
		
		提示:
		方法调用 						期望值 
		nTwice("Hello",2) 			"Helo" 
		nTwice("Chocolate",3) 		"Choate" 
		nTwice("Chocolate",1) 		"Ce" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nTwice("Hello",2));
		System.out.println(nTwice("Chocolate",3));
		System.out.println(nTwice("Chocolate",1));
	}

	private static String nTwice(String string, int i) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(i>string.length()){
			System.out.println("字符串长度至少为n个");
			return "";
		}else{
			sb.append(string.substring(0, i)).append(string.substring(string.length()-i));
			return sb.toString();
		}
	}

}
