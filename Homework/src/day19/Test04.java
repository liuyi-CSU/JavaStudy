package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Test04 {

	/**
	 * .分析以下需求，并用代码实现： 
	 * (1)有类似这样的字符串："1.2,3.4,5.6,7.8,5.56,44.55"请按照要求，依次完成以下试题
	 * (2)以逗号作为分隔符，把已知的字符串分成一个String类型的数组，数组中的每一个元素类似于"1.2","3.4"这样的字符串
	 * (3)把数组中的每一个元素以
	 * "."作为分隔符，把"."左边的元素作为key，右边的元素作为value，封装到Map中，Map中的key和value都是Object类型
	 * (注意, 这里有5.6与5.56两个数字, 这样切分出来后会有两个相同的key, 值都为5,
	 * 思考一下,这里应该怎么做才能将这两个key都保留???) 
	 * (4)把map中的key封装在Set中，并把Set中的元素输出
	 * (5)把map中的value封装到Collection中，把Collection中的元素输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1.2,3.4,5.6,7.8,5.56,44.55";
		String[] str1=str.split(",");
		HashMap hm = toHashMap(str1);
		System.out.println(hm);
	}

	private static HashMap toHashMap(String[] str1) {
		HashMap hm=new HashMap();
		TreeSet ts=new TreeSet();
		Collection c=new ArrayList();
		System.out.println(Arrays.asList(str1));
		for (String string : str1) {
			
			String[] str2=string.split("\\.");
			Object key=str2[0];
			Object value=str2[1];
			if(!hm.containsKey(key)){
				hm.put(key, value);
				ts.add(key);
				c.add(value);
			}else{
				hm.put("备份"+key, value);
				ts.add("备份"+key);
				c.add(value);
			}
		}
		System.out.println("Set: "+ts);
		System.out.println("Collection: "+c);
		return hm;
	}

}
