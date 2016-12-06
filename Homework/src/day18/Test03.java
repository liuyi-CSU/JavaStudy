package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {

	/**
	 * 创建一个Map集合，里面有如下元素
	{香蕉 = 5.6 ，樱桃 = 25 ，桃子 = 5.6 ， 苹果 = 2.3}
	a. 遍历该map集合，并且统计有多少种水果（key）用两种方式进行遍历 
	b. 将“香蕉”的价格修改为10.9 
	c. 删除桃子这组数据
	d. 将修改后的map中所有key和value都输出到控制台 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("香蕉", 5.6);
		hm.put("樱桃", 25.0);
		hm.put("桃子", 5.6);
		hm.put("苹果", 2.3);
		hm.put("香蕉", 10.9);
		hm.remove("桃子");
		int count1=traverse1(hm);
		System.out.println("********************");
		int count2=traverse2(hm);
	}

	private static int traverse2(HashMap<String, Double> hm) {
		// TODO Auto-generated method stub
		Set<String> keySet=hm.keySet();
		Iterator<String> it = keySet.iterator();
		int count=0;
		for (String string : hm.keySet()) {
			System.out.println(string+"="+hm.get(string));
			count++;
		}
		System.out.println("count="+count);
		return count;
	}

	private static int traverse1(HashMap<String, Double> hm) {
		// TODO Auto-generated method stub
		Set<Map.Entry<String, Double>>entrySet=hm.entrySet();
		Iterator<Entry<String, Double>> it = entrySet.iterator();
		int count=0;
		while(it.hasNext()){
			Entry<String, Double> en=it.next();
			String key=en.getKey();
			Double value=en.getValue();
			count++;
			System.out.println(key+"="+value);
		}
		System.out.println("count="+count);
		return count;
	}

}
