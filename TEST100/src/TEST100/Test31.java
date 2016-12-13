package TEST100;

public class Test31 {

	/**
	 *  类中有一个方法，方法名sumNumbers;

		  给定一字符串，求出现在字符串中的数字之和。
		例如：sumNumbers("abc123xyz") → 123
		
		提示:
		方法调用 期望值 
		sumNumbers("abc123xyz") 123 
		sumNumbers("aa11b33") 44 
		sumNumbers("7 11") 18 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNumbers("abc123xyz"));
		System.out.println(sumNumbers("aa11b33"));
		System.out.println(sumNumbers("7 11"));
	}
	
	public static int sumNumbers(String str){
		
		String[] ch=str.split("[^0-9]");
		int num=0;
		for (String string : ch) {
			if(string.length()!=0){
				num+=Integer.parseInt(string);
			}
		}
		return num;
	}

}
