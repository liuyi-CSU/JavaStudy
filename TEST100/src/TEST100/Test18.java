package TEST100;

public class Test18 {

	/**
	 * ������һ��������������makeAbba;
	 * 
	 * ���������ַ���a��b�����ؽ�������abba��˳�����һ��Ľ���� ���硣 ��Hi���͡�Bye������"HiByeByeHi"��
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ 
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
