package TEST100;

public class Test23 {

	/**
	 * 类中有一个方法，方法名withoutX;
	 * 
	 * 给定一个字符串，如果第一个或最后一个字符是'x'，则返回没有这些'x'字符串的字符串， 否则返回字符串不变。
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * withoutX("xHix") 	"Hi" 
	 * withoutX("xHi") 		"Hi" 
	 * withoutX("Hxix") 	"Hxi"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutX("Hxix"));
	}
	public static String withoutX(String str){
		if(str.startsWith("x")&&str.endsWith("x")){
			return str.substring(1, str.length()-1);
		}
		else if(str.startsWith("x")){
			return str.substring(1);
		}else if(str.endsWith("x")){
			return str.substring(0, str.length()-1);
		}else{
			return str;
		}
	}

}
