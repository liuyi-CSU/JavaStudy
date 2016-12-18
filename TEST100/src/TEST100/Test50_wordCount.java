package TEST100;

import java.util.HashMap;

public class Test50_wordCount {

	/**
	 * 类中有一个方法，方法名wordCount;
		  给定一个字符串数组，返回一个Map ，每个不同的字符串作为key
		value为字符串在数组中出现的次数。
		提示:
		方法调用								期望值
		wordCount(["a","b","a","c","b"])	{"b":2,"c":1,"a":2}
		wordCount(["c","b","a"])			{"b":1,"c":1,"a":1}
		wordCount(["c","c","c","c"])		{"c":4}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"a","b","a","c","b"};
		HashMap<String,Integer> hm=wordCount(str);
		System.out.println(hm);
	}

	private static HashMap wordCount(String[] str) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for (String string : str) {
			if(!hm.containsKey(string)){
				hm.put(string, 1);
			}else{
				hm.put(string, hm.get(string)+1);
			}
		}
		return hm;
	}

}
