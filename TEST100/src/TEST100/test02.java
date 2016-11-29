package TEST100;

public class test02 {

	/**
	 * 给定2个字符串，a和b，返回一个新的字符串，由a的第一个字符和b的最后一个字符， 所以“you”和“java”产生“ya”。
	 * 如果任一个字符串的长度为0，则使用'@'作为其缺少的字符。
	 * 
	 * 提示: 
	 * 方法调用 						期望值 
	 * lastChars("last","chars") 	"ls" 
	 * lastChars("yo","java") 		"ya"
	 * lastChars("hi","") 			"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="last";
		String b="";
		StringBuilder str=lastChars(a, b);
		System.out.println(str);//
	}

	private static StringBuilder lastChars(String a, String b) {
		if(a.equals("")){
			a="@";
		}
		if(b.equals("")){
			b="@";
		}
		StringBuilder str=new StringBuilder();
		str.append(a.substring(0, 1));
		str.append(b.substring(b.length()-1));
		return str;
	}

}
