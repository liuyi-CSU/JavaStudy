package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class Test01 {

	/**
	 * 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
	 * 
	 * 分析:
	 * 1,定义一个学生类
	 * 		成员变量:姓名,语文成绩,数学成绩,英语成绩,总成绩
	 * 		成员方法:空参,有参构造,有参构造的参数分别是姓名,语文成绩,数学成绩,英语成绩
	 * 			  toString方法,在遍历集合中的Student对象打印对象引用的时候会显示属性值
	 * 2,键盘录入需要Scanner,创建键盘录入对象
	 * 3,创建TreeSet集合对象,在TreeSet的构造函数中传入比较器,按照总分比较
	 * 4,录入五个学生,所以以集合中的学生个数为判断条件,如果size是小于5就进行存储
	 * 5,将录入的字符串切割,用逗号切割,会返回一个字符串数组,将字符串数组中从二个元素转换成int数,
	 * 6,将转换后的结果封装成Student对象,将Student添加到TreeSet集合中
	 * 7,遍历TreeSet集合打印每一个Student对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请键入:(姓名,语文成绩,数学成绩,英语成绩)");
		Scanner sca=new Scanner(System.in);
		TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num=o2.getSum()-o1.getSum();
				return num==0?1:num;
			}
		});
		while(ts.size()<5){
			String str1=sca.nextLine();
			String[] str2=str1.split(",");
			ts.add(new Student(str2[0],Integer.parseInt(str2[1]),Integer.parseInt(str2[2]),Integer.parseInt(str2[3])));
		}
		System.out.println(ts);
	}

}
