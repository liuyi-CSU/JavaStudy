package TEST100;

public class Test29 {

	/**
	 * ������һ��������������lastTwo;

	 	����һ�����ⳤ�ȵ��ַ���������һ���µ��ַ�������������2���ַ�,�����������ԡ�coding��������codign����
		
		��ʾ:
		�������� ����ֵ 
		lastTwo("coding") "codign" 
		lastTwo("cat") "cta" 
		lastTwo("ab") "ba" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastTwo("coding"));
		System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ab"));
	}
	public static String lastTwo(String str){
		StringBuffer sb=new StringBuffer();
		if(str.length()<2){
			return str;
		}else{
			sb.append(str.substring(0, str.length()-2)).append(str.charAt(str.length()-1)).append(str.charAt(str.length()-2));
			return sb.toString();
		}
	}

}
