package day19;

import java.util.Scanner;

public class Test01 {

	/**
	 * �ڿ����쳣�������, ����¼��һ������, ������ת��Ϊ�����Ƶ��ַ�����ʾ��ʽ.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ������:");
		System.out.println("����'q'����");
		Scanner sca=new Scanner(System.in);
		String line=sca.nextLine();
		while(!line.equals("q")){
			try {
				int num=Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("¼�����,������¼��");
			}
			line=sca.nextLine();
		}
	}

}
