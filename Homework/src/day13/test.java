package day13;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();//String��ķ����ĵ������Ҫ���¸�ֵ,��ΪString�����´�������,ԭ���ݱ�Ϊ����
		System.out.println(sb);
	}

}
