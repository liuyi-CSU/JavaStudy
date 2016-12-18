package TEST100;

public class Test40 {

	/**
	 *  类中有一个方法，方法名minCat;

		 给定两个字符串，将它们拼接在一起，并返回结果。
		但是，如果两个字符串的长度不同，则从较长字符串中省略字符，使得它与较短字符串的长度相同。
		例如“Hello”和“Hi”产生“loHi”。 两字符串可以是任何长度。
		
		
		提示:
		方法调用 期望值 
		minCat("Hello","Hi") "loHi" 
		minCat("Hello","java") "ellojava" 
		minCat("java","Hello") "javaello" 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCat("Hello","Hi"));
		System.out.println(minCat("Hello","java"));
		System.out.println(minCat("java","Hello"));
	}

	private static String minCat(String str, String str2) {
		// TODO Auto-generated method stub
		int len=str.length()<str2.length()?str.length():str2.length();
		StringBuffer sb=new StringBuffer();
		return sb.append(str.substring(str.length()-len)).append(str2.substring(str2.length()-len)).toString();
	}


}
