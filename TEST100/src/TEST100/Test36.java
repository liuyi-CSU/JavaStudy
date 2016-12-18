package TEST100;

public class Test36 {

	/**
	 *  类中有一个方法，方法名endsLy;

		  给一个字符串，如果以“ly”结尾的字符串，返回true。
		
		
		提示:
		方法调用 				期望值 
		endsLy("oddly") 	true 
		endsLy("y") 		false 
		endsLy("oddy") 		false 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
	}

	private static boolean endsLy(String string) {
		// TODO Auto-generated method stub
		
		return string.endsWith("ly");
	}

}
