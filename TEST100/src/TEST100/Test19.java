package TEST100;

public class Test19 {

	/**
	 * ������һ��������������deFront;
	 * 
	 * ����һ���ַ���������һ��û��ǰ2���ַ��İ汾�� �����һ���ַ���'a'��������һ���ַ� ����ڶ����ַ���'b'��
	 * �����ڶ����ַ����ַ������������ⳤ�ȡ�
	 * 
	 * 
	 * ��ʾ: 
	 * ��������				 ����ֵ 
	 * deFront("Hello") 	"llo" 
	 * deFront("java") 		"va" 
	 * deFront("away")		"aay"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deFront("away"));
	}
	public static StringBuffer deFront(String str){
		StringBuffer sb=new StringBuffer();
		if(str.length()<2){
			return sb.append("");
		}else if(str.startsWith("a")&&str.charAt(1)=='b'){
			sb.append(str);
		}else if(str.startsWith("a")){
			sb.append("a").append(str.substring(2, str.length()));
		}else if(str.charAt(1)=='b'){
			sb.append("b").append(str.subSequence(2, str.length()));
		}else{
			sb.append(str.substring(2, str.length()));
		}
		return sb;
	}
}
