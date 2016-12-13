package TEST100;

public class Test21 {

	/**
	 * 类中有一个方法，方法名middleTwo;
	 * 
	 * 给定一个长度为偶数的字符串，返回一个由中间两个字符串组成的字符串， 因此字符串“string”产生“ri”。 字符串长度至少为2。
	 * 
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * middleTwo("string") 	"ri" 
	 * middleTwo("code") 	"od"
	 * middleTwo("ab") 		"ab"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(middleTwo("string"));
	}

	private static String middleTwo(String str) {
		// TODO Auto-generated method stub
		return str.substring(str.length()/2-1, str.length()/2+1);
	}

}
