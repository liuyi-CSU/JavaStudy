package TEST100;

public class Test54_has77 {

	/**
	 * ������һ��������������has77;
		  ����һ���������飬���������������˴����ڵ�7������������7��һ��Ԫ�طָ�����{7��1��7}���򷵻�true��
		��ʾ:
		��������						����ֵ
		has77([1,7,7])				true
		has77([1,7,1,7])			true
		has77([1,7,1,1,7])			false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,7,1};
		System.out.println(has77(arr));
	}

	private static boolean has77(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length-1; i++) {
			if(((i+1<arr.length)&&(arr[i]==7&&arr[i+1]==7))||((i+2<arr.length)&&(arr[i]==7&&arr[i+2]==7)))//��ֹ�������
//			if((arr[i]==7&&arr[i+1]==7)||(arr[i]==7&&arr[i+2]==7))    									  //���������
			{
				return true;
			}
		}
		return false;
	}

}
