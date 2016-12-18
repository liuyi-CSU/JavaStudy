package TEST100;

public class Test35 {

	/**
	 * 类中有一个方法，方法名sameEnds;

	  给定一字符串，截取出该字符串开头和结尾相同的内容且不可重叠，并返回。
	例如：("javaXYZjava") -> "java",否则返回空。
	
	
	提示:
	方法调用 期望值 
	sameEnds("abXYab") "ab" 
	sameEnds("xx") "x" 
	sameEnds("xxx") "x" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sameEnds("abXYab"));
		System.out.println(sameEnds("xx"));
		System.out.println(sameEnds("xxx"));
	}

	private static String sameEnds(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		int i=1;
		while(str.substring(0, i).length()<=str.length()/2){
			if(str.endsWith(str.substring(0, i))){
				sb.append(str.substring(0, i));
				i++;
			}else{
				i++;
			}
		}
		return sb.toString();
	}

}
