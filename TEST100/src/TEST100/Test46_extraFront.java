package TEST100;

public class Test46_extraFront {

	/**
	 *  ������һ��������������extraFront;

		  ����һ���ַ���������һ����ԭʼ�ַ�����ǰ2���ַ���3��������ɵ����ַ����� 
		�ַ����������κγ��ȡ� ���������2���ַ�������:"A"���ء�AAA����
		
		��ʾ:
		�������� 					����ֵ 
		extraFront("Hello") 	"HeHeHe" 
		extraFront("ab") 		"ababab" 
		extraFront("H") 		"HHH" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extraFront("Hello"));
		System.out.println(extraFront("ab"));
		System.out.println(extraFront("H"));
	}

	private static String extraFront(String string) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		if(string.length()<2){
			sb.append(string).append(string).append(string);
		}else{
			sb.append(string.substring(0, 2)).append(string.substring(0, 2)).append(string.substring(0, 2));
		}
		return sb.toString();
	}

}
