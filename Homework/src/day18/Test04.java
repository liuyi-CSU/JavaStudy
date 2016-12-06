package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test04 {

	/**
	 * map中有如下数据：{茄子 = 2.0, 黄瓜 = 2.5 ，西红柿 = 5.0, 土豆 = 3.0 , 豆角 = 3.5} 
	 * a.实现一个询问价格的方法（获取用户在控制台上输入的蔬菜名称，然后在该map集合中查询对应的价格）有，则输出相对应的价格，如果
	 * 没有则提示用户“已经卖完” 
	 * b. 将黄瓜的价格上调 1 元，（不能直接赋值3.5） 
	 * c. 将所有蔬菜的价格大于3的蔬菜名称打印到控制台
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("茄子", 2.0);
		hm.put("黄瓜", 2.5);
		hm.put("西红柿", 5.0);
		hm.put("土豆", 5.0);
		hm.put("豆角", 5.0);
		System.out.println("老板要什么菜?");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		if(hm.containsKey(str)){
			System.out.println(hm.get(str));
		}else{
			System.out.println("已经卖完");
		}
		System.out.println("还有黄瓜的价格上调了!");
		hm.put("黄瓜", hm.get("黄瓜")+1.0);
		System.out.println("黄瓜价格"+hm.get("黄瓜"));
		Set<String> keySet=hm.keySet();
		Iterator<String> it = keySet.iterator();
		System.out.println("以下蔬菜价格大于3元,爱买不买");
		while (it.hasNext()) {
			String str1 = (String) it.next();
			if(hm.get(str1)>3.0){
				System.out.println(str1+"要"+hm.get(str1)+"元");
			}
		}
	}

}
