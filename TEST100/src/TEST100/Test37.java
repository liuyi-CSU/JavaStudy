package TEST100;

public class Test37 {

	/**
	 * 类中有一个方法，方法名withoutX2;

		  给定一个字符串，如果前两个字符中的一个或两个是“x”，
		则返回没有这些“x”字符的字符串，否则返回字符串不变。 
		
		
		提示:
		方法调用 期望值 
		withoutX2("xHi") "Hi" 
		withoutX2("Hxi") "Hi" 
		withoutX2("Hi") "Hi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutX2("xHi"));
		System.out.println(withoutX2("Hxi"));
		System.out.println(withoutX2("Hi"));
	}

	private static String withoutX2(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(str.length()<2)return null;
		char[] ch=str.substring(0, 2).toCharArray();
		for (char c : ch) {
			if(c!='x'){
				sb.append(c);
			}
		}
		sb.append(str.substring(2));
		return sb.toString();
	}

}
