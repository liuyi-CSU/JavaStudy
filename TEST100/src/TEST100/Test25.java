package TEST100;

public class Test25 {

	/**
	 * 类中有一个方法，方法名extraEnd;

  给定一个字符串，返回一个由原始字符串的最后2个字符的3个副本组成的新字符串。 字符串长度至少为2。

		提示:
		方法调用 				期望值 
		extraEnd("Hello") 	"lololo" 
		extraEnd("ab") 		"ababab" 
		extraEnd("Hi") 		"HiHiHi" 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extraEnd("Hello"));
	}

	private static StringBuffer extraEnd(String string) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(string.length()<2){
			sb.append("字符串长度至少为2:");
		}else{
			for(int i=0;i<3;i++){
				sb.append(string.substring(string.length()-2));
			}
		}
		return sb;
	}

}
