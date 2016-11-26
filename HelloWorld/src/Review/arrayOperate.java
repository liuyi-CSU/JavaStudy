package Review;

public class arrayOperate {

	/**
	 * @param arr�����������󣬲��ô���ʵ�֣�
	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
	��ʾ˼·���Ȳ������ֵ����Сֵ���ֵ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,2,9,15,1,5,20,7,18};
		int len=arr.length;
		print(arr,len);
		int maxi=getMaxi(arr,len);
		int mini=getMini(arr,len);
		swop(arr,maxi,mini,len);
		System.out.println("���Q���M��:");
		print(arr,len);
		
	}
	/**
	 �@�ǫ@ȡ���M�����ֵ�ķ���
	 @param arr ����һ��int��������
	 @return ���������е����ֵ
	 */
	public static int getMaxi(int[]arr,int len){
		int maxi=0;
		int Max=arr[0];
		for(int i=1;i<len;i++){
			if(arr[i]>Max){
				Max=arr[i];
				maxi=i;
			}
		}
		return maxi;
	}
	/**
	 �@�ǫ@ȡ���M����Сֵ�ķ���
	 @param arr ����һ��int�������鼰���鳤��
	 @return ���������е���Сֵ
	 */
	public static int getMini(int[]arr,int len){
		int mini=0;
		int Min=arr[0];
		for(int i=1;i<len;i++){
			if(arr[i]<Min){
				Min=arr[i];
				mini=i;
			}
		}
		return mini;
	}
	/**
	 �@�ǽ������M���������ķ���
	 @param arr ����һ��int�������飬���ֵ��Сֵ������Լ����鳤��
	 */
	public static void swop(int[]arr,int maxi,int mini,int len){
		int temp=arr[maxi];
		arr[maxi]=arr[len-1];
		arr[len-1]=temp;
		temp=arr[mini];
		arr[mini]=arr[0];
		arr[0]=temp;
	}
	/**
	 �@�Ǵ�ӡ���M�ķ���
	 @param arr ����һ��int�������飬�������鳤��
	 */
	public static void print(int[]arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
