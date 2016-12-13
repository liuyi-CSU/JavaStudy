package TEST100;

public class Test20 {

	/**
	 * 类中有一个方法，方法名firstHalf;
	 * 
	 * 给定一个长度为偶数的字符串，返回上半部分。 所以字符串“WooHoo”产生“Woo”。
	 * 
	 * 
	 * 提示: 
	 * 方法调用 					期望值 
	 * firstHalf("WooHoo") 		"Woo" 
	 * firstHalf("HelloThere") 	"Hello"
	 * firstHalf("abcdef") 		"abc"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstHalf("HelloThere"));
	}

	private static String firstHalf(String str) {
		// TODO Auto-generated method stub
		return str.substring(0,str.length()/2);
	}

}
