package day17;

import java.util.Scanner;

public class Test08 {

	/**
	 * ����һ������makeChocolate, ����Ҫ��һ���涨�������ɿ���,��ÿ��һ�����ÿ���幫����ɿ�����.
	 * ����������������,��һ����С�ɿ������ĸ���,�ڶ����Ǵ��ɿ������ĸ���,�������ǹ涨������.
	 * ������������ʹ��С�ɿ�����֮ǰʹ�ô��ɿ�����,������Ҫʹ�ö��ٸ�С�ɿ�����������ɹ涨������,��������򷵻�-1.
	 * ��ʾ: 
	 * �������� 					����ֵ
	 * makeChocolate(4,5,9) 	4 
	 * makeChocolate(4,1,10) 	-1
	 * makeChocolate(4,1,7) 	2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("������С�ɿ���������min:");
		int min=sca.nextInt();
		System.out.println("��������ɿ���������max:");
		int max=sca.nextInt();
		System.out.println("������涨������len:");
		int len=sca.nextInt();
		
		int bl=makeBricks(max,min,len);
		System.out.println(bl);
	}
//����ʹ��С�ɿ�����֮ǰʹ�ô��ɿ�����,������Ҫʹ�ö��ٸ�С�ɿ�����������ɹ涨������,��������򷵻�-1.
	private static int makeBricks(int max, int min, int len) {
		// TODO Auto-generated method stub
		int x_max=len/5;//�����Ҫ�Ĵ��ɿ�����
		if((max>x_max?x_max:max)*5+min>=len){
			return len-x_max*5;
		}else{
			return -1;
		}
		
	}

}
