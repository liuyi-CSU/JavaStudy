package day13;

import java.util.Scanner;

public class test02 {

	/**
	 * ����һ��int���͵�����,����Ϊ6,ͨ������¼��ķ�ʽΪ�丳ֵ.����: ����ð���������ѡ��������дӴ�С����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���볤��Ϊ6������:");
		int[] arr=new int[6];
		Scanner sca=new Scanner(System.in);
		input(arr, sca);
		//ð������
		//bubbleSort(arr);
		//ѡ������
		selectSort(arr);
		print(arr);
	}

	private static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	private static void input(int[] arr, Scanner sca) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�����"+(i+1)+"����");
			arr[i]=sca.nextInt();
		}
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
