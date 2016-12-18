package TEST100;

public class Test38 {

	/**
	 *  给定2个字符串，返回它们的连接，除了省略每个的第一个字符。 字符串将至少为1。

		提示:
		方法调用 						期望值 
		nonStart("Hello","There") 	"ellohere" 
		nonStart("java","code") 	"avaode" 
		nonStart("shotl","java") 	"hotlava" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonStart("Hello","There"));
		System.out.println(nonStart("java","code"));
		System.out.println(nonStart("shotl","java"));
	}

	private static String nonStart(String str, String str2) {
		// TODO Auto-generated method stub
		if(str.length()<1||str2.length()<1)return null;
		StringBuffer sb=new StringBuffer();
		return sb.append(str.substring(1)).append(str2.substring(1)).toString();
	}

}
