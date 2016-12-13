package TEST100;

public class Test18 {

	/**
	 * 类中有一个方法，方法名makeAbba;
	 * 
	 * 给定两个字符串a和b，返回将它们以abba的顺序放在一起的结果， 例如。 “Hi”和“Bye”返回"HiByeByeHi"。
	 * 
	 * 
	 * 提示: 
	 * 方法调用 					期望值 
	 * makeAbba("Hi","Bye") 	"HiByeByeHi" 
	 * makeAbba("Yo","Alice")	"YoAliceAliceYo" 
	 * makeAbba("What","Up") 	"WhatUpUpWhat"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeAbba("Hi","Bye"));
	}
	public static StringBuffer makeAbba(String str1,String str2){
		StringBuffer sb=new StringBuffer();
		sb.append(str1).append(str2).append(str2).append(str1);
		return sb;
	}

}
