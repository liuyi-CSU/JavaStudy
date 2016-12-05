package day17;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test06 {

	/**
	 * 键盘录入一串字符串, 再录入一个字符, 根据字符找到字符串中所有的索引值, 并求出该字符在字符串中出现的总次数. 如果该字符在字符串中不存在,
	 * 那么就继续录入. 如果录入五次都没找到, 就随机生成一个字符串中已有的字符, 并求出次数及所有的索引值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请先输入一个字符串:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		System.out.println("请录入一个字符");
		String ch=sca.nextLine();
		Random rd=new Random();
		int n=1;
		while(!str.contains(ch)){
			System.out.println("您还有"+(5-n)+"次机会");
			System.out.println("请再录入一个字符:");
			ch=sca.nextLine();
			if(n==4){
				ch=str.substring(rd.nextInt(str.length()), str.length());//随机获取字符串中的一个字符
				break;
			}
			n++;
		}
		//根据字符找到字符串中所有的索引值, 并求出该字符在字符串中出现的总次数
		ArrayList<Integer> arr=new ArrayList<>();
		int index=str.indexOf(ch);
		arr.add(index);
		int count=1;
		while((str.indexOf(ch, ++index))!=-1){
			index=str.indexOf(ch, index);
			arr.add(index);
//			System.out.println("index="+index);//调试用
			count++;
		}
		System.out.println("字符出现的总的次数:"+count+"; 所有的索引值:"+arr);
	}

}
