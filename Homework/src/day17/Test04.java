package day17;

import java.util.Comparator;
import java.util.TreeSet;

public class Test04 {

	/**
	 * �����������󣬲��ô���ʵ�֣�	
	(1)����һ��TreeSet���ϣ�Ȼ�����6��Double���͵����ݣ��ֱ���[1.1,5.2,6.3,2.5,5.2,3.3]
	(2)��ȥ�أ�Ȼ��������(�Ӵ�С)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Double> ts=new TreeSet<>(new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				int num=o2.compareTo(o1);
				return num==0?1:num;
			}
		});
		Double[] db={1.1,5.2,6.3,2.5,5.2,3.3};
		for (Double double1 : db) {
			ts.add(double1);
		}
		System.out.println(ts);
	}

}
