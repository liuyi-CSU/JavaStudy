package TEST100;

public class Test22 {

	/**
	 * 类中有一个方法，方法名equalIsNot;
	 * 
	 * 给定一个字符串，如果字符串中出现的“is”和“not”个数相等，则返回true，否则返回false；
	 * 
	 * 提示: 
	 * 方法调用 							期望值 
	 * equalIsNot("This is not") 		false 
	 * equalIsNot("This is notnot")		true 
	 * equalIsNot("noisxxnotyynotxisi") true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
	}

	private static boolean equalIsNot(String str) {
		// TODO Auto-generated method stub
		int isNum=getNum(str,"is");
		int notNum=getNum(str,"not");
		return isNum==notNum;
	}

	private static int getNum(String string,String str) {
		// TODO Auto-generated method stub
		int count=0;
		while(string.contains(str)){
			count++;
			string=string.substring(string.indexOf(str)+str.length());
		}
		return count;
	}

}
