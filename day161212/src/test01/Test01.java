package test01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test01 {

	/**
	 * ����һ������ int[] arr = {1,3,6,4,3,5,4}; (8��) 
	 * a)����һ��ArrayList, ���������Ԫ����ӽ�ȥ,
	 * ��Ԫ�ز����ظ�(�����鲻��) 
	 * b)����һ��TreeSet, ���������Ԫ�ش���ü�����, �����������Ҳ���ȥ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,6,4,3,5,4};
		method1(arr);
		method2(arr);
	}

	private static void method2(int[] arr) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int num=o2.compareTo(o1);
				return num==0?1:num;
			}
		});
		for (Integer i : arr) {
			ts.add(i);
		}
	}

	private static void method1(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for (Integer i : arr) {
			if(!list.contains(i)){
				list.add(i);
			}else{
				continue;
			}
		}
	}

}
