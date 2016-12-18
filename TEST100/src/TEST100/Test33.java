package TEST100;

public class Test33 {

	/**
	 * 类中有一个方法，方法名helloName;

		  给定一个字符串类型的名字，例如"Bob",返回"Hello Bob!"
		
		
		提示:
		方法调用 期望值 
		helloName("Bob") "Hello Bob!" 
		helloName("Alice") "Hello Alice!" 
		helloName("X") "Hello X!" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
	}
	public static String helloName(String str){
		return "Hello "+str;
	}

}
