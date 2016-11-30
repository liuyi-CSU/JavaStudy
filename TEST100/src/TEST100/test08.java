package TEST100;

public class test08 {

	/**
	 * 给定一个字符串，如果字符串的前两个字符和末尾的两个字符同时出现，
	 * 就返回true，如“edited”，则返回true。
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * frontAgin("edited") 	true 
	 * frontAgin("edit") 	false
	 * frontAgin("ed") 		true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="edited";
		 System.out.println(frontAgin(str));
	}

	private static boolean frontAgin(String str) {
		 return str.endsWith(str.substring(0,2));
	}

}
