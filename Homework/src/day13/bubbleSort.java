package day13;

public class bubbleSort {

	/**
	 * ð������
	 */
	public static void main(String[] args) {
		int[] arr={3,4,53,1,12,5553,23,24,23,34};
		sort(arr);
		print(arr);

	}

	private static void print(int[] arr) {//��ӡ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//��Ҫ�ȽϵĴ���
			for(int j=0;j<arr.length-1-i;j++){//ǰ�����ڵ�Ԫ�رȽ�
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
