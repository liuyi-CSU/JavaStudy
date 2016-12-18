package TEST100;

public class Test47_hasBad {

	/**
	 * 类中有一个方法，方法名hasBad;

	  给定一个字符串，如果“bad”出现在字符串中的索引0或1处，则返回true，
	例如“badxxx”或“xbadxx”，而不是“xxbadxx”。 字符串可以是任何长度，
	包括0.注意：使用.equals（）来比较2个字符串。
	
	提示:
	方法调用 				期望值 
	hasBad("badxx") 	true 
	hasBad("xbadxx") 	true 
	hasBad("xxbadxx") 	false 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));
	}

	private static boolean hasBad(String str) {
		// TODO Auto-generated method stub
		if(str.indexOf("bad")<2){
			return true;
		}else{
			return false;
		}
	}

}
