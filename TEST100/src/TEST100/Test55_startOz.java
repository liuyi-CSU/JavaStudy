package TEST100;

public class Test55_startOz {

	/**
	 * 类中有一个方法，方法名startOz;
	  给定一个字符串，返回一个由前2个字符组成的字符串，但是如果它是'o'，
	则包含第一个字符，如果它是'z'，则包含第二个字符，所以“ozymandias”产生“oz”。
	提示:
	方法调用					期望值
	startOz("ozymandias")	"oz"
	startOz("bzoo")			"z"
	startOz("oxx")			"o"

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
	}
	public static String startOz(String str){
		if(str.length()>2){
			if(str.substring(0, 2).contains("z")&&str.substring(0, 2).contains("o")){
				return str.substring(0, 2);
			}else if(str.substring(0, 2).contains("z")){
				return str.substring(1, 2);
			}else if(str.substring(0, 2).contains("o")){
				return str.substring(0, 1);
			}else{
				return "";
			}
		}else{
			return str;
		}
			
	}

}
