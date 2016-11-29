package day13;

public class binarySearch {

	/**
	 * 快速排序算法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,12,23,34,45,56,67,78,89,910};//有序数列
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		int value=56;
		mid = binary(arr, min, max, mid, value);
		if(mid!=-1){
			System.out.println(mid);
		}else{
			System.out.println("没有所查找的数value");
		}
		Math.random();
		
	}

	private static int binary(int[] arr, int min, int max, int mid, int value) {
		while(arr[mid]!=value){
			if(arr[mid]>value){
				max=mid-1;//中间值大于参考值则在左半部分继续查找
			}else{
				min=mid+1;//中间值小于参考值则在右半部分继续查找
			}
			mid=(min+max)/2;
			if(min>max){
				return -1;
			}
		}
		return mid;
	}

}
