package day13;

public class selectSort {
	/**
	 * 选择排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,8,7,5,4,3,6,2,1};
		select(arr);
		print(arr);
	}
	//打印数组
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//选择排序
	private static void select(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//比较参考点
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){//如果参考点后面的元素比参考点小,则与参考点交换
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}

}
