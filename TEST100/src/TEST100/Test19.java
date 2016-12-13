package TEST100;

public class Test19 {

	/**
	 * 类中有一个方法，方法名deFront;
	 * 
	 * 给定一个字符串，返回一个没有前2个字符的版本。 如果第一个字符是'a'，则保留第一个字符 如果第二个字符是'b'。
	 * 则保留第二个字符，字符串可以是任意长度。
	 * 
	 * 
	 * 提示: 
	 * 方法调用				 期望值 
	 * deFront("Hello") 	"llo" 
	 * deFront("java") 		"va" 
	 * deFront("away")		"aay"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deFront("away"));
	}
	public static StringBuffer deFront(String str){
		StringBuffer sb=new StringBuffer();
		if(str.length()<2){
			return sb.append("");
		}else if(str.startsWith("a")&&str.charAt(1)=='b'){
			sb.append(str);
		}else if(str.startsWith("a")){
			sb.append("a").append(str.substring(2, str.length()));
		}else if(str.charAt(1)=='b'){
			sb.append("b").append(str.subSequence(2, str.length()));
		}else{
			sb.append(str.substring(2, str.length()));
		}
		return sb;
	}
}
