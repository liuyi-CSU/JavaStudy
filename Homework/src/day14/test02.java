package day14;

import java.util.Scanner;

public class test02 {

	/**
	 * (1)����¼��һ��С����Ҫ��С������С��λ����2λ (2)���巽����ʵ�ֱ���С��������λС��(ֻ�᲻��) (3)�磺����5.6789
	 * ���5.67, ����5.67389 ���5.67
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ��С��:");
		Scanner sca = new Scanner(System.in);
		while (true) {
			String str = sca.nextLine();
			String[] str2 = str.split("\\.");
			if (str2.length != 2) {
				System.out.println("������������ȷ��С��");
			} else {
				if (str2[1].length() < 2) {
					System.out.println("Ҫ��С��λ����2λ");
					continue;
				}else{
					System.out.println(str2[0]+"."+str2[1].substring(0,2));
					break;
				}
			}
		}
	}

}
