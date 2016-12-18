package TEST100;

public class Test57_start1 {

	/**
	 * 类中有一个方法，方法名start1;
		  有两个任意长度的整型数组， 返回有多少个数组有1作为他们的第一个元素。
		提示:
		方法调用					期望值
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
