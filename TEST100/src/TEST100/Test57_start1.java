package TEST100;

public class Test57_start1 {

	/**
	 * ������һ��������������start1;
		  ���������ⳤ�ȵ��������飬 �����ж��ٸ�������1��Ϊ���ǵĵ�һ��Ԫ�ء�
		��ʾ:
		��������					����ֵ
		start1([1,2,3],[1,3])	2
		start1([7,2,3],[1])		1
		start1([1,2],[])		1

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3};
		int[] arr2={1,3};
		System.out.println(start1(arr1,arr2));
	}

	private static int start1(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int num=0;
		if(arr1.length!=0&&arr2.length!=0){
			if(arr1[0]==1){
				num++;
			}
			if(arr2[0]==1){
				num++;
			}
		}else if(arr2.length!=0){
			if(arr2[0]==1){
				num++;
			}
		}else{
			return num;
		}
		return num;
	}


}
