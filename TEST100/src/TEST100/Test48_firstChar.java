package TEST100;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test48_firstChar {

	/**
	 * 类中有一个方法，方法名firstChar; 给定一个非空字符串数组，为每个不同的第一个字符返回一个Map ，
	 * 键为字符串的首个字符，值为含有该键首个字符的所有字符串进行追加，例如：["salt","tea","soda","toast"]字符串数组
	 * 返回结果是{“t”:"teatoast","s":"saltsoda"}，键是不同字符串的首个字符，值是按它们在数组中的顺序追加在一起。 
	 * 提示:
	 * 方法调用 										期望值
	 * firstChar(["salt","tea","soda","toast"])		{"t":"teatoast","s":"saltsoda"}
	 * firstChar(["aa","bb","cc","aAA","cCC","d"])	{"d":"d","b":"bb","c":"cccCC","a":"aaaAA"} firstChar([]) {}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"salt","tea","soda","toast"};
		HashMap<String,String> hm=firstChar(str);
		System.out.println(hm);
	}

	private static HashMap firstChar(String[] str) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if(!hm.containsKey(str[i].charAt(0)+"")){
				hm.put(str[i].charAt(0)+"", str[i]);
			}else{
				hm.put(str[i].charAt(0)+"", hm.get(str[i].charAt(0)+"")+str[i]);
			}
		}
		return hm;
	}

}
