package TEST100;

public class Test16 {

	/**
	 * ������һ��������������repeatFront;
	 * 
	 * ����һ���ַ�������������, ��ȡ�ַ�����ǰnλ, ƴ����ǰn-1λ, ��ƴ��n-2λ,��n-3�Դ�����... n�ķ�ΧӦ����0���ַ�������֮��.
	 * ���磺("xyz", 3) -> "xyzxyx"
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 							����ֵ 
	 * repeatFront("Chocolate",4) 		"ChocChoChC"
	 * repeatFront("Chocolate",3) 		"ChoChC" 
	 * repeatFront("Ice Cream",2) 		"IcI"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Chocolate";
		int num=4;
		System.out.println(repeatFront(str,num));
	}
	public static StringBuffer repeatFront(String str,int num){
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
//		sb.append(str);
		for (int i = num; i>=0 ; i--) {
			sb.append(str.substring(0, i));
		}
		return sb;
	}
}
