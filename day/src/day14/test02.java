package day14;

import java.util.Arrays;

public class test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="66 33 55 22 88";
		int[] arr = incision(s);//切割
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();//用StringBuilder不会产生垃圾,而用String会,因为String是不可变得
		sb = joint(arr, sb);//拼接
		System.out.println(sb);
	}

	private static int[] incision(String s) {
		String[] str=s.split(" ");
		int[] arr=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		return arr;
	}

	private static StringBuilder joint(int[] arr, StringBuilder sb) {
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length-1){
				sb=sb.append(arr[i]+" ");
			}else{
				sb=sb.append(arr[i]);
			}
		}
		return sb;
	}

}
