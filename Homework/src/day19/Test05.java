package day19;

import java.math.BigInteger;
import java.util.Scanner;

public class Test05 {

	/**
	 * ģ��������֤�Ĺ���, ����Ҫ��ʵ����ش���.(������ʾ: ��һ����Ҫʹ������) 
	 * a. ��ʾ�û��ڿ���̨�������֤��, ��һ���ַ������б��� 
	 * b. �ж����֤�����Ƿ���18λ����16λ 
	 * c. �ж����֤�ų����һλ��, ������������ 
	 * d. �����֤�е�������Ϣ��ȡ��������ӡ������̨��.
	 * �������֤����Ϊ: 420683199010194273 ��ȡ��Ľ��Ϊ: 19901019
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������֤��:");
		Scanner sca = new Scanner(System.in);
		String str=sca.nextLine();
		if(str.length()!=18&&str.length()!=16){
			System.out.println("��������ȷ���ȵ����֤��");
			str=sca.nextLine();
		}
		method1(str);
		System.out.println("����:"+str.substring(6, 14));
	}

	private static void method1(String str) {
		try {
			String str2=str.substring(0, str.length()-1);
			long num= Long.parseLong(str2);
			System.out.println("num="+num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("��������ȷ��ʽ�����֤��");
		}
	}

}
