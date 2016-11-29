package day13;

import java.util.Scanner;

public class test03 {

	/**
	 * 创建一个类实现MyStringUtils接口并按以下要求实现两个抽象方法
		a)字符串反转方法: 将传入的字符串进行反转后返回(禁用StringBuffer的reverse方法) 
		b)字符串过滤数字: 将传入的字符串的数字过滤返回(比如传入abd78df, 返回abddf)
		并在测试类中进行测试
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符串");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		clazz str1=new clazz(); 
		System.out.println(str1.reverse(str));
		System.out.println(str1.reverse2(str));
	}

}

interface MyStringUtils{
	public abstract String reverse(String str);
	public abstract String reverse2(String str);
}

class clazz implements MyStringUtils{
	/**反转函数*/
	public String reverse(String str){
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String str1=String.valueOf(ch);
		return str1;
	}
	/**删除数字*/
	public String reverse2(String str){
		char ch[]=str.toCharArray();
		int count=0;//记录数字出现的次数
		for (int i = 0; i < ch.length-count; i++) {
			if(ch[i]>='0'&&ch[i]<='9'){
				for(int j=i;j<ch.length-1;j++){
					ch[j]=ch[j+1];
				}
				count++;
				i--;
			}
		}
		String str1=String.valueOf(ch, 0, ch.length-count);
		return str1;
		
	}
}
