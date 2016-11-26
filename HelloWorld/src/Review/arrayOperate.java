package Review;

public class arrayOperate {

	/**
	 * @param arr分析以下需求，并用代码实现：
	(1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
	(2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组
	提示思路：先查找最大值和最小值出现的索引。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,2,9,15,1,5,20,7,18};
		int len=arr.length;
		print(arr,len);
		int maxi=getMaxi(arr,len);
		int mini=getMini(arr,len);
		swop(arr,maxi,mini,len);
		System.out.println("交換數組后:");
		print(arr,len);
		
	}
	/**
	 這是獲取數組中最大值的方法
	 @param arr 接收一個int类型数组
	 @return 返回数组中的最大值
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
	 這是獲取數組中最小值的方法
	 @param arr 接收一個int类型数组及数组长度
	 @return 返回数组中的最小值
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
	 這是交换數組中两个数的方法
	 @param arr 接收一個int类型数组，最大值最小值的序号以及数组长度
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
	 這是打印數組的方法
	 @param arr 接收一個int类型数组，还有数组长度
	 */
	public static void print(int[]arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
