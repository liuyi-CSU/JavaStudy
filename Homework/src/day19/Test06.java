package day19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test06 {

	/**
	 * (��չ��)������һ��Map,�洢Ԫ��Ϊ:
	HashMap<String,Integer> map = new HashMap<>();
	map.put("����",3);
	map.put("����",7);
	map.put("����",9);
	map.put("����",7);
	map.put("����",8);
	Ҫ��ɾ��ֵ������ֵ����Ϊ7��Ԫ��.
	��ɾ����Ľ��Ϊ:
	{����=3, ����=9, ����=8}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map2 = new HashMap<>();
		HashMap<String,Integer> map = new HashMap<>();
		map.put("����",3);
		map.put("����",7);
		map.put("����",9);
		map.put("����",7);
		map.put("����",8);
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
