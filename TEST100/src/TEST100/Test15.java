package TEST100;

import java.awt.image.BufferStrategy;

public class Test15 {

	/**
	 * 
	 * 类中有一个方法，方法名doubleChar;
	 * 
	 * 方法中包含有1个参数，是给定的字符串， 要求把输入参数的每个字符复制一次 例如，给定的字符串为"abc"，返回结果为"aabbcc"
	 * 
	 * 
	 * 提示: 
	 * 方法调用 					期望值 
	 * doubleChar("The") 		"TThhee" 
	 * doubleChar("AAbb") 		"AAAAbbbb"
	 * doubleChar("Hi-There") 	"HHii--TThheerree"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi-There";
		System.out.println(doubleChar(str));
	}
	public static StringBuffer doubleChar(String str){
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (char c : ch) {
			sb.append(c);
			sb.append(c);
		}
		return sb;
	}
}
