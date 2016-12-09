package day19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test06 {

	/**
	 * (扩展题)例如有一个Map,存储元素为:
	HashMap<String,Integer> map = new HashMap<>();
	map.put("张三",3);
	map.put("李四",7);
	map.put("王五",9);
	map.put("赵六",7);
	map.put("周琦",8);
	要求删除值集合中值所有为7的元素.
	即删除后的结果为:
	{张三=3, 王五=9, 周琦=8}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map2 = new HashMap<>();
		HashMap<String,Integer> map = new HashMap<>();
		map.put("张三",3);
		map.put("李四",7);
		map.put("王五",9);
		map.put("赵六",7);
		map.put("周琦",8);
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key=entry.getKey();
			Integer value=entry.getValue();
			if(value!=7){
				map2.put(key, value);
			}
		}
		System.out.println(map2);
	}

}
