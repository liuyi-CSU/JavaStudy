package TEST100;

public abstract class test11 {

	/**
	 * 如果字符串中的’g’的相邻左边或者右边有另外一个’g’，则’g’在这个字符串中是happy的，
	 * 如果字符串中所有的’g’都是happy的则返回true，否则返回false。
	 * 
	 * 提示: 
	 *  方法调用 				期望值
	 *  gHappy("xxggxx") 	true 
	 *  gHappy("xxgxx") 	false
	 *  gHappy("xxggyygxx") false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxggyyxgx";
		System.out.println(gHappy(str));
	}

	private static boolean gHappy(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]=='g'){
				if(ch[i+1]=='g'){
					i++;
				}else{
					return false;
				}
			}
		}
		return true;
	}

}
