package day12;
/**liuyi-CSU*/
public class test02 {

	/**
	 * 定义一个测试类:
编写主函数:
	1.定义一个字符串引用s1, 赋值为 "itheima"
	2.调用字符串中的方法判断s1中是否包含"ma",并在控制台输出该结果
	3.调用字符串中的方法判断s1是否以"hei"开头,并在控制台输出该结果
	4.调用字符串中的方法判断s1是否以".txt"结尾,并在控制台输出该结果
	5.调用字符串中的方法判断s1内容是否为空,并在控制台中输出结果
	5.调用字符串中的方法判断s1内容是否与"留意依夏"相同,并在控制台中输出结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="itheima";
		boolean b1=s1.contains("ma");
		System.out.println(b1);
		boolean b2=s1.startsWith("hei");
		System.out.println(b2);
		boolean b3=s1.endsWith(".txt");
		System.out.println(b3);
		boolean b4=s1.isEmpty();
		System.out.println(b4);
		boolean b5=s1.equals("留意依夏");
		System.out.println(b5);
	}

}
