package TEST100;

public class Test34 {

	/**
	 * 类中有一个方法，方法名middleThree;

	  给定一个奇数长度的字符串，从中间返回字符串长度3，所以“candy”产生“and”。 字符串长度至少为3。
	
	提示:
	方法调用 						期望值 
	middleThree("Candy") 		"and" 
	middleThree("and") 			"and" 
	middleThree("solving") 		"lvi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(middleThree("Candy"));
		System.out.println(middleThree("and"));
		System.out.println(middleThree("solving"));
	}

	private static String middleThree(String str) {
		// TODO Auto-generated method stub
		if(str.length()<3||str.length()%2!=1){
			System.out.println("请输入长度大于等于3的奇数长度的字符串");
			return "";
		}else{
			return str.substring(str.length()/2-1, str.length()/2+2);
		}
	}

}
