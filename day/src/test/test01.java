package test;

public class test01 {

	/**
	 * �������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3};
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length-1){
				sb.append(arr[i]+",");
			}else{
				sb.append(arr[i]);
			}
		}
		sb.append("]");
		System.out.println(sb);
	}

}
