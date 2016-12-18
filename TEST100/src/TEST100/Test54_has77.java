package TEST100;

public class Test54_has77 {

	/**
	 * 类中有一个方法，方法名has77;
		  给定一个整型数组，如果数组包含两个彼此相邻的7，或者有两个7由一个元素分隔，如{7，1，7}，则返回true。
		提示:
		方法调用						期望值
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
			if(((i+1<arr.length)&&(arr[i]==7&&arr[i+1]==7))||((i+2<arr.length)&&(arr[i]==7&&arr[i+2]==7)))//防止索引溢出
//			if((arr[i]==7&&arr[i+1]==7)||(arr[i]==7&&arr[i+2]==7))    									  //有溢出可能
			{
				return true;
			}
		}
		return false;
	}

}
