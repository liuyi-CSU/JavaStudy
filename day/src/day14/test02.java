package day14;

import java.util.Arrays;

public class test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="66 33 55 22 88";
		int[] arr = incision(s);//�и�
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();//��StringBuilder�����������,����String��,��ΪString�ǲ��ɱ��
		sb = joint(arr, sb);//ƴ��
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
