package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class test01 {

	/**
	 * 1.�����������󣬲��ô���ʵ�֣�
	(1)����10��1��100֮����������(�����ظ�)������һ��List����
	(2)��д������List���Ͻ�������,����Collections.sort������TreeSet
	(2)Ȼ�����õ�������������Ԫ�ز����
	(3)�磺15 18 20 40 46 60 65 70 75 91
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
