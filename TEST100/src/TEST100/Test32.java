package TEST100;

public class Test32 {

	/**
	 * 类中有一个方法，方法名countHi;

		  检查接收字符串里面有多少个hi，
		要求统计输入参数里面hi字符串出现的次数
		例如，给定的字符串为"hi,itheima"，里面包含一个"hi"返回结果为1
		
		提示:
		方法调用 					期望值 
		countHi("abc hi ho") 	1 
		countHi("ABChi hi") 	2 
		countHi("hihi") 		2 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));
	}

	private static int countHi(String string) {
		// TODO Auto-generated method stub
		int count=0;
		while(string.contains("hi")){
			count++;
			string=string.substring(string.indexOf("hi")+"hi".length());
		}
		return count;
	}

}
