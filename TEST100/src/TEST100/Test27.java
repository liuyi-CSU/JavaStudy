package TEST100;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test27 {

	/**
	 * 类中有一个方法，方法名countTriple;

	 	“三元组”是指一个连续出现的三次的字符，返回给定字符串中三元组的个数，
		“三元组”是可以重叠的：“AAAA”包含两个三元组
		
		提示:
		方法调用 						期望值 
		countTriple("abcXXXabc") 	1 
		countTriple("xxxabyyyycd") 	3 
		countTriple("a") 			0 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countTriple("xxxabyyyycd"));
	}

	private static int countTriple(String str) {
		// TODO Auto-generated method stub
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else{
				hm.put(c, hm.get(c)+1);
			}
		}
		//count = method1(count, hm);
		count = method2(count,hm);
		return count;
	}

	private static int method2(int count, HashMap<Character, Integer> hm) {
		// TODO Auto-generated method stub
		for(Character key:hm.keySet()){
			if(hm.get(key)>=3){
				count++;
			}
		}
		return count;
	}

	private static int method1(int count, HashMap<Character, Integer> hm) {
		for(Entry<Character,Integer>en:hm.entrySet()){
			Character key=en.getKey();
			Integer value=en.getValue();
			if(value>=3){
				count++;
			}
		}
		return count;
	}

}
