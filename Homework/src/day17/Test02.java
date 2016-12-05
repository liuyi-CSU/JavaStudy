package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test02 {

	/**
	 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 * 
	 * 1,创建Scanner对象,键盘录入
	 * 2,创建TreeSet集合对象,TreeSet集合中传入比较器
	 * 3,无限循环不断接收整数,遇到quit退出,因为退出是quit,所以键盘录入的时候应该都以字符串的形式录入
	 * 4,判断是quit就退出,不是将其转换为Integer,并添加到集合中
	 * 5,遍历TreeSet集合并打印每一个元素
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请键入,\"quit\"结束输入");
		Scanner sca=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int num=o2-o1;
				return num==0?1:num;
			}
		});
		String str=sca.nextLine();
		while(!str.equals("quit")){
			ts.add(Integer.parseInt(str));
			str=sca.nextLine();
		}
		System.out.println(ts);
	}

}
