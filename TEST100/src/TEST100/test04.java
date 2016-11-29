package TEST100;

public class test04 {

	/**
	 * 给定一个字符串，返回该字符串中连续出现个数最多的字符的数量。
	 * 
	 * 提示: 方法调用 期望值 maxBlock("hoopla") 2 maxBlock("abbCCCddBBBxx") 3
	 * maxBlock("") 0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbCCCddBBBBBBBBxx";
		int n = maxBlock(str);
		System.out.println(n);
	}

	private static int maxBlock(String str) {
		int n = 1;//n来统计当前字母出现的次数
		int max = 0;//max来储存当前最大长度
		char[] ch = str.toCharArray();
		if (ch.length <= 1) {
			n = ch.length;
		} else {
			for (int i = 0; i < ch.length - 1; i++) {
				if (ch[i] == ch[i + 1]) {
					n++;
				} else {
					if (n > max) {
						max = n;
					}
					n = 1;
				}
			}
		}
		if (n > max) {
			max = n;
		}
		return max;
	}

}
