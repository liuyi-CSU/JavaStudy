package day12;
/**liuyi-CSU*/
public class test09 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)ģ��Arrays.toString(int[] arr);�������Լ���װһ��public static String toString(int[] arr);
	(2)���int��������arrΪnull��toString���������ַ���"null"
	(3)���int��������arr����Ϊ0��toString���������ַ���"[]"
	(4)���int��������arr������Ϊ{1,2,3,4,5},toString���������ַ���"[1, 2, 3, 4, 5]"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		String s=toString(arr);
		System.out.println(s);
	}
	public static String toString(int[] arr){
		if(arr.equals(null)){
			return "null";
		}else if(arr.length==0){
			return "[]";
		}else{
			String s="[";
			for (int i = 0; i < arr.length; i++) {
				if(i<arr.length-2){
					s=s+arr[i]+",";
				}else if(i==arr.length-1){
					s=s+arr[i]+"]";
				}
			}
			return s;
		}
	}

}
