package day17;

import java.util.Scanner;

public class Test07 {

	/**
	 * ��������һ��ש�������Լ�������������һЩСש��ÿ��1Ӣ�磩�ʹ�ש��ÿ��5Ӣ�磩��
���������ѡ���ש��������ܹ�ƴ�ӳɹ����򷵻�true�����򷵻�false��
		��ʾ:
		�������� ����ֵ 
		makeBricks(3,1,8) true 
		makeBricks(3,1,9) false 
		makeBricks(3,2,10) true 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("������Сש�������min:");
		int min=sca.nextInt();
		System.out.println("�������ש�������max:");
		int max=sca.nextInt();
		System.out.println("�����볤��len:");
		int len=sca.nextInt();
		
		boolean bl=makeBricks(max,min,len);
		System.out.println(bl);
	}

	private static boolean makeBricks(int max, int min, int len) {
		// TODO Auto-generated method stub
		int x_max=len/5;//�����Ҫ��ש��ĸ���;
		int x_min=len%5;//������ҪСש��ĸ���;
		if(max*5+min<len)return false;
		if(max*5+min==len)return true;
		if(max>=x_max){
			if(min<x_min){
				return false;
			}else{
				return true;
			}
		}else{//��Ϊmax*5+min>len,������max<x_maxʱ,ʣ�೤�ȶ���Сש�鲹��.
			return true;
		}
	}

}
