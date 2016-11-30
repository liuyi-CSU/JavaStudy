package day14;

import java.util.Arrays;

public class test01 {

	/**
	 * 需求：我有如下一个字符串:”91 27 46 38 50”，
	 * 请写代码实现最终输出结果是：”27 38 46 50 91”
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="91 27 46 38 50";
		String[] str1=str.split(" ");
		int[] arr=new int[str1.length];
		for (int i = 0; i < str1.length; i++) {
			arr[i]=Integer.parseInt(str1[i]);
		}
		Arrays.sort(arr);
//		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
//			sb.append(arr[i]);
			if(i<arr.length-1){
				System.out.print(arr[i]+" ");
			}else{
				System.out.print(arr[i]);
			}
		}
//		System.out.println(sb);
	}

}
