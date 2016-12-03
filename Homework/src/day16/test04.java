package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test04 {

	// 定义方法 frequency, 用来统计集合中指定元素出现的次数 

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		System.out.println(frequency(list, "a"));	// 3
		System.out.println(frequency(list, "b"));	// 2
		System.out.println(frequency(list, "c"));	// 1
		System.out.println(frequency(list, "d"));	// 5
		System.out.println(frequency(list, "xxx"));	// 0
	}
	public static int frequency(List list, String str){
		int count=0;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			if(str.equals(object)){
				count++;
			}
		}
		return count;
	}
}
