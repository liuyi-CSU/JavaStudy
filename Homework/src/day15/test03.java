package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test03 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)定义一个Worker类型(属性私有、空参有参构造、set、get方法、toString方法、equals方法、hashCode方法)，
		包含三个属性：姓名(String name)、年龄(int age)、工资(double salary),在Worker类中定义work方法打印一句话，
		如："凤姐 正在工作"，其中"凤姐"代表当前对象的姓名
	(2)定义List集合，在List集合中增加三个员工，基本信息如下：
		"凤姐" 18 20000
		"欧阳峰" 60 8000
		"刘德华" 40 30000
	(3)在"欧阳峰"之前插入一个员工，信息为：姓名："张柏芝"，年龄：35，工资3300
	(4)删除"刘德华"的信息
	(5)利用for 循环遍历，打印List 中所有员工的信息
	(6)利用迭代遍历，对List 中所有的员工调用work 方法
	(7)为Worker类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Worker worker=new Worker();
		List list=new ArrayList();
		
		list.add(new Worker("凤姐",18,20000));
		list.add(new Worker("欧阳锋",60,8000));
		list.add(new Worker("刘德华",40,30000));
		list.add(list.indexOf(new Worker("欧阳锋",60,8000)), new Worker("张柏芝",35,3300));
		list.remove(new Worker("刘德华",40,30000));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Worker object = (Worker) iterator.next();
			object.work();
		}
	}

}

class Worker{
	private String name;
	private int age;
	private double salary;
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work(){
		System.out.println(this.name+"正在工作");
	}
}
