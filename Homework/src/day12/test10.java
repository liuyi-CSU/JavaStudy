package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test10 {

	/**
	 * 编写一个转换字符的方法, 将控制台输入的字符串传入该方法中, 要求: 
	 a) 将该字符串中的大写字母变成小写字母, 
	 b) 将小写字母转成大写字母, 将数字替换成*, 其余字符不变. 
	 c) 统计转换了多少次(大小写转换+数字替换的总和)在控制台输出转换后的字符串以及转换总次数 
	 !!!注意:不能使用toUpperCase()和toLowerCase(); (a的ASCII值为97, A的ASCII值为65)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入任意字符串:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		str.toUpperCase();
		char[] ch=str.toCharArray();
		int count=0;
		count = method(ch, count);
		print(ch);
		System.out.println();
		System.out.println("count="+count);
	}
	//打印字符串
	private static void print(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	//转换及计数
	private static int method(char[] ch, int count) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z'){
				count++;
				ch[i]=(char)((int)ch[i]-32);
			}else if(ch[i]>='A'&&ch[i]<='Z'){
				count++;
				ch[i]=(char)((int)ch[i]+32);
			}else if(ch[i]>='0'&&ch[i]<='9'){//注意要用单引号
				count++;
				ch[i]='*';
			}else{
				continue;
			}
			
		}
		return count;
	}

}
