package Review;

public class arrayCalculate {

	/**
	 * @param 
	 * ��֪һά����int[] arr = {88,66,99,77,44,55,66};
		1)����һ������,������������
		2)����һ������,�������������ֵ
		3)����һ������,������������Сֵ
		4)����һ������,������ת����
		5)����һ������,��66�������е�һ�γ��ֵ�����
		6)����һ������,��66�����������һ�γ��ֵ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {88,66,99,77,44,55,66};
		int len=arr.length;
		traverse(arr,len);
		int max=getMax(arr,len);
		System.out.println("max:"+max);
		int min=getMin(arr,len);
		System.out.println("min:"+min);
		reversal(arr,len);
		System.out.print("reversal��:");
		print(arr,len);
		int first=getFirst(arr,len);
		System.out.println("first:"+first);
		int last=getLast(arr,len);
		System.out.println("last:"+last);
	}
//	1)����һ������,������������
	public static void traverse(int[] arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
//	2)����һ������,�������������ֵ
	public static int getMax(int[] arr,int len){
		int max=arr[0];
		for(int i=0;i<len;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
//	3)����һ������,������������Сֵ
	public static int getMin(int[] arr,int len){
		int min=arr[0];
		for(int i=0;i<len;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
//	4)����һ������,������ת����
	public static void reversal(int[] arr,int len){
		for(int i=0;i<len/2;i++){
			int temp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=temp;
		}
	}
//	5)����һ������,��66�������е�һ�γ��ֵ�����
	public static int getFirst(int[] arr,int len){
		for(int i=0;i<len;i++){
			if(arr[i]==66){
				return i;
			}
		}
		return -1;
	}
//	6)����һ������,��66�����������һ�γ��ֵ�����
	public static int getLast(int[] arr,int len){
		for(int i=len-1;i>0;i--){
			if(arr[i]==66){
				return i;
			}
		}
		return -1;
	}
	public static void print(int[] arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
