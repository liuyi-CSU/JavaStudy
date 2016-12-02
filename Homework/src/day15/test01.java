package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class test01 {

	/**
	 * 1.分析以下需求，并用代码实现：
	(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
	(2)编写方法对List集合进行排序,禁用Collections.sort方法和TreeSet
	(2)然后利用迭代器遍历集合元素并输出
	(3)如：15 18 20 40 46 60 65 70 75 91
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		int i=0;
		Random num=new Random();
		list.add(num.nextInt());
		while(i<10){
			int n=num.nextInt(100);
			if(!list.contains(n)){
				list.add(n);
				i++;
			}
		}
		List list2=sort(list);
		ListIterator lit=list2.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next()+" ");
		}
	}

	private static List sort(List list) {
		Object[] arr=list.toArray();
		List list2=new ArrayList();
		for (int j = 0; j < arr.length-1; j++) {
			int j2 = 0;
			for (; j2 < arr.length-1-j; j2++) {
				if((int)arr[j2]>(int)arr[j2+1]){
					int temp=(int)arr[j2];
					arr[j2]=(int)arr[j2+1];
					arr[j2+1]=temp;
				}
			}
			list2.add(0, arr[j2]);
		}
		return list2;
	}
}
