package day17;

public class Student {

	/**
	 * 1,����һ��ѧ����
	 * 		��Ա����:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܳɼ�
	 * 		��Ա����:�ղ�,�вι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	 * 			  toString����,�ڱ��������е�Student�����ӡ�������õ�ʱ�����ʾ����ֵ
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
