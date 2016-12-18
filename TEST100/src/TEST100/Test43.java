package TEST100;

public class Test43 {

	/**
	 * 类中有一个方法，方法名withoutEnd;

		  给定一个字符串，返回一个没有第一个和最后一个字符的版本，所以“Hello”产生“all”。 字符串长度至少为2。
		
		提示:
		方法调用 					期望值 
		withoutEnd("Hello") 	"ell" 
		withoutEnd("java") 		"av" 
		withoutEnd("coding") 	"odin" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}

	private static String withoutEnd(String str) {
		// TODO Auto-generated method stub
		if(str.length()<2){
			System.out.println("字符串长度至少为2");
			return null;
		}else{
			return str.substring(1, str.length()-1);
		}
	}

}
