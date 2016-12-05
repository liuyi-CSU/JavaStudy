package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {

	// 定义方法 sort1, sort2, 用来为集合中的元素进行排序
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("b");
		list1.add("f");
		list1.add("e");
		list1.add("c");
		list1.add("a");
		list1.add("d");
		System.out.println(list1);
		sort1(list1);
		System.out.println(list1);	// a, b, c, d, e, f
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(8);
		list2.add(3);
		list2.add(1);
		list2.add(4);
		sort2(list2);
		System.out.println(list2); //1,3,4,5,8
	}
	
	private static void sort1(List<String> list1) {
		method1(list1);
		Collections.sort(list1);
	}

	private static void method1(List<String> list1) {
		Collections.sort(list1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				char[] charArray1 = o1.toCharArray();
				char[] charArray2 = o2.toCharArray();
				return charArray1[0]-charArray2[0];
			}
		});
	}

	private static void sort2(List<Integer> list2) {
		// TODO Auto-generated method stub
		Collections.sort(list2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
	}

	

}
