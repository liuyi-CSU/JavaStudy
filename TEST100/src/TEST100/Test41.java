package TEST100;

public class Test41 {

	/**
	 * 类中有一个方法，方法名right2;

		 给定一个字符串，返回一个“旋转右2”版本，其中最后2个字符移动到开始。 字符串长度至少为2。
		
		提示:
		方法调用 				期望值 
		right2("Hello") 	"loHel" 
		right2("java") 		"vaja" 
		right2("Hi") 		"Hi" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
	}

	private static String right2(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		return sb.append(str.substring(str.length()-2)).append(str.substring(0, str.length()-2)).toString();
	}

}
