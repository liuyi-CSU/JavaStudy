package day17;

import java.util.Comparator;
import java.util.TreeSet;

public class Test03 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)定义一个员工类Employee，包含三个属性：姓名(String name)、年龄(int age)、工资(int salary)
	(2)创建5个对象装入TreeSet，按照工资从高到底排序输出结果(工资相同，按照年龄从低到高，工资和年龄都相同，
		按照姓名字典顺序排列，但是不能去重(姓名、年龄、工资都相同))
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
		ts.add(new Employee("朱允炆",23,20000));
		ts.add(new Employee("朱元璋",70,90000));
		ts.add(new Employee("朱标",48,20000));
		ts.add(new Employee("朱棣",40,70000));
		ts.add(new Employee("朱高炽",30,20000));
		System.out.println(ts);
	}

}
