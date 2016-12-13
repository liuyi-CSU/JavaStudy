package TEST100;

public class Test28 {

	/**
	 *  类中有一个方法，方法名catDog;

		检查接收字符串里面有多少个cat和dog出现的次数是否相同，
		如果cat和dog出现的次数相同就返回true
		
		提示:
		方法调用 					期望值 
		catDog("catdog") 		true 
		catDog("catcat") 		false 
		catDog("1cat1cadodog") 	true 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(catDog("1cat1cadodog"));
	}
	public static boolean catDog(String str){
		return (getNum(str,"cat")==getNum(str,"dog"));
	}
	private static Object getNum(String string, String str) {
		// TODO Auto-generated method stub
		int index=0;
		int count=0;
		while(string.contains(str)){
				index=string.indexOf(str);
				count++;
				string=string.substring(index+str.length());
		}
		return count;
	}
}
