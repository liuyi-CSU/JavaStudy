package day12;
/**liuyi-CSU*/
public class test01 {

	/**
	 *1.定义一个测试类:
	编写主函数:
	1.定义一个字节数组, 内容为97,98,99
	2.定义一个字符串引用s1,使用字符串中的参数为字节数组的构造方法创建字符串对象,传入字节数组
	3.定义一个字符串引用s2,使用字符串中的参数为字符串的构造方法创建字符串对象, 传入参数"helloworld"
	4.定义一个字符数组,内容为 'a','b','c'
	5.定义一个字符串引用s3,使用字符串中的参数为字符数组的构造方法创建字符串对象,传入字符数组
	6.在控制台中输出s1 , s2, s3 的内容
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch={97,98,99};
		String s1=new String(ch);
		String s2="helloworld";
		char[] ch1={'a','b','c'};
		String s3=new String(ch1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
