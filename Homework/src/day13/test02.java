package day13;

import java.util.Scanner;

public class test02 {

	/**
	 * 定义一个int类型的数组,长度为6,通过键盘录入的方式为其赋值.需求: 利用冒泡排序或者选择排序进行从大到小排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入长度为6的数组:");
		int[] arr=new int[6];
		Scanner sca=new Scanner(System.in);
		input(arr, sca);
		//冒泡排序
		//bubbleSort(arr);
		//选择排序
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
			System.out.println("输入第"+(i+1)+"个数");
			arr[i]=sca.nextInt();
		}
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
