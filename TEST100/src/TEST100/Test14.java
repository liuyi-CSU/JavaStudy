package TEST100;

public class Test14 {

	/**
	 * 书写一个类，类名为Itheima;
	 * 类中有一个方法，方法名theEnd;
	 * 给定一个字符串和一个布尔参数，从它的前面返回一个字符串长度1，除非布尔参数是false， 
	 * 在这种情况下从它的后面返回一个字符串长度1。
	 * 字符串将是非空的。
	 * 提示: 
	 * 方法调用					 期望值
	 * theEnd("Hello",true) 	"H" 
	 * theEnd("Hello",false) 	"o"
	 * theEnd("oh",true) 		"o"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(theEnd("Hello",true));
	}

	private static char[] theEnd(String string, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Itheima{
	public static String theEnd(String str,Boolean bl){
		if(bl==true){
			return str.substring(0,0);
		}else{
			return str.substring(str.length(),str.length());
		}
	}
}