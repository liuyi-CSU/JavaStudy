package TEST100;

public class Test46_extraFront {

	/**
	 *  类中有一个方法，方法名extraFront;

		  给定一个字符串，返回一个由原始字符串的前2个字符的3个副本组成的新字符串。 
		字符串可以是任何长度。 如果有少于2个字符，例如:"A"返回“AAA”。
		
		提示:
		方法调用 					期望值 
		extraFront("Hello") 	"HeHeHe" 
		extraFront("ab") 		"ababab" 
		extraFront("H") 		"HHH" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extraFront("Hello"));
		System.out.println(extraFront("ab"));
		System.out.println(extraFront("H"));
	}

	private static String extraFront(String string) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(string.length()<2){
			sb.append(string).append(string).append(string);
		}else{
			sb.append(string.substring(0, 2)).append(string.substring(0, 2)).append(string.substring(0, 2));
		}
		return sb.toString();
	}

}
