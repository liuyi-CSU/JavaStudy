package day17;

import java.util.Comparator;
import java.util.TreeSet;

public class Test03 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)����һ��Ա����Employee�������������ԣ�����(String name)������(int age)������(int salary)
	(2)����5������װ��TreeSet�����չ��ʴӸߵ�������������(������ͬ����������ӵ͵��ߣ����ʺ����䶼��ͬ��
		���������ֵ�˳�����У����ǲ���ȥ��(���������䡢���ʶ���ͬ))
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				int num=o2.getSalary()-o1.getSalary();
				int num2=o1.getAge()-o2.getAge();
				int num3=o1.getName().compareToIgnoreCase(o2.getName());
				return num==0?(num2==0?(num3==0?1:num3):num2):num;
			}
		});
		ts.add(new Employee("���ʞ�",23,20000));
		ts.add(new Employee("��Ԫ�",70,90000));
		ts.add(new Employee("���",48,20000));
		ts.add(new Employee("���",40,70000));
		ts.add(new Employee("��߳�",30,20000));
		System.out.println(ts);
	}

}
