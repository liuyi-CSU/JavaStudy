package TEST100;

public class Test25 {

	/**
	 * ������һ��������������extraEnd;

  ����һ���ַ���������һ����ԭʼ�ַ��������2���ַ���3��������ɵ����ַ����� �ַ�����������Ϊ2��

		��ʾ:
		�������� 				����ֵ 
		extraEnd("Hello") 	"lololo" 
		extraEnd("ab") 		"ababab" 
		extraEnd("Hi") 		"HiHiHi" 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extraEnd("Hello"));
	}

	private static StringBuffer extraEnd(String string) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(string.length()<2){
			sb.append("�ַ�����������Ϊ2:");
		}else{
			for(int i=0;i<3;i++){
				sb.append(string.substring(string.length()-2));
			}
		}
		return sb;
	}

}
