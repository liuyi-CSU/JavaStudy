package day14;

public class test03 {

	/**
	 * 不用正则剔除字符串里的数字
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="h1e2l3l4o5w6o7r8l9d10";
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>'a'&&ch[i]<'z'||ch[i]>'A'&&ch[i]<'Z'){
				sb=sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
		System.out.println(sb);
	}

}
