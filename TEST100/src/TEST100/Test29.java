package TEST100;

public class Test29 {

	/**
	 * 类中有一个方法，方法名lastTwo;

	 	给定一个任意长度的字符串，返回一个新的字符串，其中最后的2个字符,被交换，所以“coding”产生“codign”。
		
		提示:
		方法调用 期望值 
		lastTwo("coding") "codign" 
		lastTwo("cat") "cta" 
		lastTwo("ab") "ba" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastTwo("coding"));
		System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ab"));
	}
	public static String lastTwo(String str){
		StringBuffer sb=new StringBuffer();
		if(str.length()<2){
			return str;
		}else{
			sb.append(str.substring(0, str.length()-2)).append(str.charAt(str.length()-1)).append(str.charAt(str.length()-2));
			return sb.toString();
		}
	}

}
