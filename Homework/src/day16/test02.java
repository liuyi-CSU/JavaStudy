package day16;

import java.util.ArrayList;
import java.util.Collection;

public class test02 {

	/**
	 * �Ѽ����д洢���Person����,Person������������,�ҳ���������
	a,����һ��Person���͵ı���, �ȼ�ס��һ��Ԫ��
	b,ѭ����������
	c,��ÿһ��Ԫ�غͱ����Ƚ�����, ��������е�Ԫ�رȱ�����ס�������
	d,�ñ�����ס�������ϴ��Ԫ��
	e,���ر�����ס��Ԫ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Person> list=new ArrayList<>();
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("��Ԫ�",44));
		list.add(new Person("���",22));
		int age=method(list);
		System.out.println(age);
	}

	private static int method(Collection<Person> list) {
		int age=19;
		for (Person person : list) {
			if(person.getAge()>age){
				age=person.getAge();
			}
		}
		return age;
	}

}

class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}