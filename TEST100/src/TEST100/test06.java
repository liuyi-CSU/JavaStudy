package TEST100;

public class test06 {

	/**
	 * 
	 给定一个字符串，如果一个长度为2的子字符串出现在它的开始和结束， 
	 返回一个字符串， 没有子串在开头，所以“HelloHe”产生“lloHe”。
	 * 子串可能与自身重叠，因此“Hi”产生“”。 否则，返回原始字符串不变。
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * without2("HelloHe") 	"lloHe" 
	 * without2("HelloHi") 	"HelloHi"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloHe";
		without2(str);
	}

	private static void without2(String str) {
		if(str.startsWith(str.substring(str.length()-2))){
			String substring = str.substring(2);
			System.out.println(substring);
		}else{
			System.out.println(str);
		}
	}

}
