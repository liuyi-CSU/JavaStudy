package TEST100;

public class Test51_sum67 {
	/**
	 *  ������һ��������������sum67;
		  ��һ���������飬���������е����ֵ��ܺͣ�������麬����6��7��ô���Բ������6��ʼ�����쵽��7�����ֶΣ�ÿ6������������һ��7����
		����0��ʾû�����֡�
		��ʾ:
		��������							����ֵ
		sum67(1,2,2)					5
		sum67(1,2,2,6,99,99,7)			5
		sum67(1,1,6,7,2)				4
		sum67(1,6,6,2,2,7,1,6,99,99,7)	2

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,6,6,2,2};
		//System.out.println(sum67_1(arr));
		System.out.println(sum67_2(arr));
	}

	private static int sum67_1(int[] arr) {//�˷������Դ���û��7�����
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		int index6=-1;
		int index7=-1;
		for (int i = 0; i < arr.length; i++) {
			sum1+=arr[i];
			if((arr[i]==6)&&(index7==-1)&&(index6==-1)){
				index6=i;
			}
			if((arr[i]==7)&&(index6!=-1)&&(index7==-1)){
				index7=i;
			}
			if((index6!=-1)&&(index7!=-1)){
				for(int j=index6;j<=index7;j++){
					sum2+=arr[j];
				}
				sum1=sum1-sum2;
				index6=-1;
				index7=-1;
				sum2=0;
			}
		}
		return sum1;
	}
	
	public static int sum67_2(int[] arr){//�˷��� �� ���Դ���û��7�����
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==6) {
				while (true) {
					i++;
					if (arr[i]==7) {
						
						break;
					}
				}
				continue;
			}
			sum+=arr[i];
		}
		return sum;
		
	}


}
