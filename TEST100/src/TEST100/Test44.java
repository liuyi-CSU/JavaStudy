package TEST100;

public class Test44 {

	/**
	 *类中有一个方法，方法名sumDigits;

		  给定一个字符串，返回字符串中包涵的单个数字的之和，如果不含有数字则返回0；
		如果给定的字符串只包涵一个数字，需要Integer.parseInt(string)将其转化为int类型
		
		提示:
		方法调用 					期望值 
		sumDigits("aa1bc2d3") 	6 
		sumDigits("aa11b33") 	8 
		sumDigits("Chocolate") 	0 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits("aa1bc2d3"));
		System.out.println(sumDigits("aa11b33"));
		System.out.println(sumDigits("Chocolate"));
	}

	private static int sumDigits(String string) {
		// TODO Auto-generated method stub
		char[] ch=string.toCharArray();
		int num=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9'){
				num+=Integer.parseInt(ch[i]+"");
			}
		}
		return num;
	}

}
