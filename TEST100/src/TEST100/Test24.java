package TEST100;

public class Test24 {

	/**
	 * 类中有一个方法，方法名twoChar;
	 * 
	 * 给定一个字符串和一个索引，从给定索引开始返回一个字符串长度2。 
	 * 如果索引太大或太小，无法定义字符串长度2，请使用前2个字符。 字符串长度至少为2。
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * twoChar("java",0) 	"ja" 
	 * twoChar("java",2) 	"va"
	 * twoChar("java",3) 	"ja"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoChar("java",3));
	}

	private static String twoChar(String string, int i) {
		// TODO Auto-generated method stub
		if(i+2>string.length()){
			return string.substring(0, 2);
		}else{
			return string.substring(i, i+2);
		}
	}

}
