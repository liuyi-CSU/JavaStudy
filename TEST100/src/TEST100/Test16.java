package TEST100;

public class Test16 {

	/**
	 * 类中有一个方法，方法名repeatFront;
	 * 
	 * 传入一个字符串和整型数字, 截取字符串的前n位, 拼接上前n-1位, 再拼接n-2位,再n-3以此类推... n的范围应该是0到字符串长度之间.
	 * 例如：("xyz", 3) -> "xyzxyx"
	 * 
	 * 
	 * 提示: 
	 * 方法调用 							期望值 
	 * repeatFront("Chocolate",4) 		"ChocChoChC"
	 * repeatFront("Chocolate",3) 		"ChoChC" 
	 * repeatFront("Ice Cream",2) 		"IcI"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Chocolate";
		int num=4;
		System.out.println(repeatFront(str,num));
	}
	public static StringBuffer repeatFront(String str,int num){
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
//		sb.append(str);
		for (int i = num; i>=0 ; i--) {
			sb.append(str.substring(0, i));
		}
		return sb;
	}
}
