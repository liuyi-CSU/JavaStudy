package day16;

import java.util.ArrayList;
import java.util.Collection;

public class test02 {

	/**
	 * 把集合中存储多个Person对象,Person有姓名和年龄,找出年龄最大的
	a,定义一个Person类型的变量, 先记住第一个元素
	b,循环遍历集合
	c,用每一个元素和变量比较年龄, 如果集合中的元素比变量记住的年龄大
	d,用变量记住这个年龄较大的元素
	e,返回变量记住的元素
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Person> list=new ArrayList<>();
		list.add(new Person("刘邦",23));
		list.add(new Person("项羽",24));
		list.add(new Person("朱元璋",44));
		list.add(new Person("朱棣",22));
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