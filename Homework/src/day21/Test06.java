package day21;

import java.util.Scanner;

public class Test06 {

	/**
	 * ���һ������, �����û������һ��С��10��������, ������������������Ҫ���򷵻�-1. ������������Ľ׳˷��ظ�������,
	 * ���ڿ���̨���.(�������-1��������Բ����޷��������㡱)(14��) ����: �û�����5 ��ô���÷����󷵻ص���120. ���ڿ���̨���120.
	 * �û�����12�򷵻�-1, ���ڿ���̨������Բ����޷��������㡱
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ��С��10��������:");
		Scanner sca=new Scanner(System.in);
		System.out.println(getNum(sca.nextInt()));
	}

	private static int getNum(int num) {
		// TODO Auto-generated method stub
		if(num>=10||num<=0){
			System.out.println("�Բ����޷���������");
			return -1;
		}else if(num==1){
			return 1;
		}else{
			return num*getNum(num-1);
		}
	}

}
