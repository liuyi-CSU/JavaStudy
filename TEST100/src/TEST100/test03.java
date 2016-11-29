package TEST100;

public class test03 {

	/**
	 * 给定一个字符串，返回一个字符串长度2由其前2个字符组成。 如果字符串长度小于2，使用“@”表示缺少的字符。
	 * 提示: 
	 * 	方法调用 				期望值
	 *  atFirst("hello") 	"he" 
	 *  atFirst("hi") 		"hi" 
	 *  atFirst("h") 		"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="h";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		int len=str.length();
		String str2=atFirst(str1,len);
		System.out.println(str2);
		
	}
	public static String atFirst(StringBuilder str,int len){
		if(len<2){
			if(len==0){
				return str.append("@@").toString();
			}else{
				return str.append("@").toString();
		
			}
		}else{
			return str.substring(0, 2);
		}
	}

}
