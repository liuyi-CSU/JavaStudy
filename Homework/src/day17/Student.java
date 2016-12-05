package day17;

public class Student {

	/**
	 * 1,定义一个学生类
	 * 		成员变量:姓名,语文成绩,数学成绩,英语成绩,总成绩
	 * 		成员方法:空参,有参构造,有参构造的参数分别是姓名,语文成绩,数学成绩,英语成绩
	 * 			  toString方法,在遍历集合中的Student对象打印对象引用的时候会显示属性值
	 */
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	public int getSum() {
		return sum;
	}
	public String toString(){
		return name+"..."+chinese+"..."+math+"..."+english;
	}
	
}
