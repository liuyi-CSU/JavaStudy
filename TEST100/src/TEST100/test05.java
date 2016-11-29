package TEST100;

public class test05 {

	/**
	 * 传入一个字符串和整型数字, 把字符串的最后n个字符重复n次,返回出来. n的范围应该是0到字符串长度之间.
	 * 
	 * 提示: 
	 * 方法调用 					期望值
	 * repeatEnd("Hello",3) 	"llollollo" 
	 * repeatEnd("Hello",2) 	"lolo"
	 * repeatEnd("Hello",1) 	"o"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		int n=3;
		repeatEnd(str, n);
	}

	private static void repeatEnd(String str, int n) {
		if(str.length()<n||n<0){
			System.out.println("n的范围应该是0到"+str.length()+"之间");
		}
		String str1=str.substring(str.length()-n, str.length());
		for(int i=0;i<str1.length();i++){
			System.out.print(str1);
		}
	}

}
