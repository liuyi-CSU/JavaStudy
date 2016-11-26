package Review;

public class arrayCalculate {

	/**
	 * @param 
	 * 已知一维数组int[] arr = {88,66,99,77,44,55,66};
		1)定义一个方法,用来遍历数组
		2)定义一个方法,用来求数组最大值
		3)定义一个方法,用来求数组最小值
		4)定义一个方法,用来反转数组
		5)定义一个方法,求66在数组中第一次出现的索引
		6)定义一个方法,求66在数组中最后一次出现的索引
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
		System.out.print("reversal后:");
		print(arr,len);
		int first=getFirst(arr,len);
		System.out.println("first:"+first);
		int last=getLast(arr,len);
		System.out.println("last:"+last);
	}
//	1)定义一个方法,用来遍历数组
	public static void traverse(int[] arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
//	2)定义一个方法,用来求数组最大值
	public static int getMax(int[] arr,int len){
		int max=arr[0];
		for(int i=0;i<len;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
//	3)定义一个方法,用来求数组最小值
	public static int getMin(int[] arr,int len){
		int min=arr[0];
		for(int i=0;i<len;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
//	4)定义一个方法,用来反转数组
	public static void reversal(int[] arr,int len){
		for(int i=0;i<len/2;i++){
			int temp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=temp;
		}
	}
//	5)定义一个方法,求66在数组中第一次出现的索引
	public static int getFirst(int[] arr,int len){
		for(int i=0;i<len;i++){
			if(arr[i]==66){
				return i;
			}
		}
		return -1;
	}
//	6)定义一个方法,求66在数组中最后一次出现的索引
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
