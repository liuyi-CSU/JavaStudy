package day13;

public class binarySearch {

	/**
	 * ���������㷨
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,12,23,34,45,56,67,78,89,910};//��������
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		int value=56;
		mid = binary(arr, min, max, mid, value);
		if(mid!=-1){
			System.out.println(mid);
		}else{
			System.out.println("û�������ҵ���value");
		}
		Math.random();
		
	}

	private static int binary(int[] arr, int min, int max, int mid, int value) {
		while(arr[mid]!=value){
			if(arr[mid]>value){
				max=mid-1;//�м�ֵ���ڲο�ֵ������벿�ּ�������
			}else{
				min=mid+1;//�м�ֵС�ڲο�ֵ�����Ұ벿�ּ�������
			}
			mid=(min+max)/2;
			if(min>max){
				return -1;
			}
		}
		return mid;
	}

}
