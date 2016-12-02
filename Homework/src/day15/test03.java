package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test03 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)����һ��Worker����(����˽�С��ղ��вι��졢set��get������toString������equals������hashCode����)��
		�����������ԣ�����(String name)������(int age)������(double salary),��Worker���ж���work������ӡһ�仰��
		�磺"��� ���ڹ���"������"���"����ǰ���������
	(2)����List���ϣ���List��������������Ա����������Ϣ���£�
		"���" 18 20000
		"ŷ����" 60 8000
		"���»�" 40 30000
	(3)��"ŷ����"֮ǰ����һ��Ա������ϢΪ��������"�Ű�֥"�����䣺35������3300
	(4)ɾ��"���»�"����Ϣ
	(5)����for ѭ����������ӡList ������Ա������Ϣ
	(6)���õ�����������List �����е�Ա������work ����
	(7)ΪWorker����дequals �����������������䡢����ȫ�����ʱ��ŷ���true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Worker worker=new Worker();
		List list=new ArrayList();
		
		list.add(new Worker("���",18,20000));
		list.add(new Worker("ŷ����",60,8000));
		list.add(new Worker("���»�",40,30000));
		list.add(list.indexOf(new Worker("ŷ����",60,8000)), new Worker("�Ű�֥",35,3300));
		list.remove(new Worker("���»�",40,30000));
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
		System.out.println(this.name+"���ڹ���");
	}
}
