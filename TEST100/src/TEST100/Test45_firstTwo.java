package TEST100;

public class Test45_firstTwo {

	/**
	 * 类中有一个方法，方法名firstTwo;

		  给定一个字符串，返回由其前两个字符串组成的字符串，因此字符串“Hello”产生“He”。
		如果字符串比长度2小，返回本身，所以“X”产生“X”，空字符串“”产生空字符串“”。
		注意str.length（）返回字符串的长度。
		
		
		提示:
		方法调用 					期望值 
		firstTwo("Hello") 		"He" 
		firstTwo("abcdefg") 	"ab" 
		firstTwo("ab") 			"ab" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
	}

	private static String firstTwo(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=2){
			return str;
		}else{
			return str.substring(0, 2);
		}
	}

}
