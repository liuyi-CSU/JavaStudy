package day13;

import java.util.Scanner;

public class test05 {

	/**
	 * ���������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ����������жϵڶ�����ĸ ˼·: 1.���������ڵ���ĸ��ͷ������ String[]
	 * arr = { "", "M", "Tu", "W", "Th", "F", "Sa", "Su" }; 2.���庺������ String[]
	 * arrWeek = { "", "һ", "��", "��", "��", "��", "��", "��" }; 3.��ѭ��.
	 * ������¼��M,W��Ψһ����ĸʱ, ֱ�Ӵ�ӡ��Ӧ������ ������¼��T,Sʱ, ����¼��ڶ�����ĸ�����ж� ��¼��������ĸʱ, ֱ��Ҫ�����¼��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "", "M", "Tu", "W", "Th", "F", "Sa", "Su" };
		String[] arrWeek = { "", "һ", "��", "��", "��", "��", "��", "��" };
		System.out.println("���������ڼ��ĵ�һ����ĸ:");
		Scanner sca = new Scanner(System.in);
		while (true) {
			String str = sca.nextLine();
			if (!str.equals("T") && !str.equals("S")) {
				while(!find(arr, arrWeek,str)){
					System.out.println("����������:");
					str=sca.nextLine();
				}
				break;
			} else if (str.equals("T") || str.equals("S")){
				System.out.println("������ڶ����ַ�:");
				String str2 = str + sca.nextLine();
				while(!find(arr, arrWeek,str2)){
					System.out.println("����������ڶ���\"Сд\"�ַ�:");
					str2=str+sca.nextLine();
				}
				break;
			}
			
		}
	}

	private static boolean find(String[] arr, String[] arrWeek,String str) {
		boolean flag=false;
		for (int i = 0; i < arrWeek.length; i++) {
			if (str.equals(arr[i])) {
				System.out.println(arrWeek[i]);
				flag=true;
				return flag;
			}
		}
		return flag;
	}

}
