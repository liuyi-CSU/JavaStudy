package day13;

public class selectSort {
	/**
	 * ѡ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,8,7,5,4,3,6,2,1};
		select(arr);
		print(arr);
	}
	//��ӡ����
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//ѡ������
	private static void select(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//�Ƚϲο���
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){//����ο�������Ԫ�رȲο���С,����ο��㽻��
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}

}
