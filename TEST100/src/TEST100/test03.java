package TEST100;

public class test03 {

	/**
	 * ����һ���ַ���������һ���ַ�������2����ǰ2���ַ���ɡ� ����ַ�������С��2��ʹ�á�@����ʾȱ�ٵ��ַ���
	 * ��ʾ: 
	 * 	�������� 				����ֵ
	 *  atFirst("hello") 	"he" 
	 *  atFirst("hi") 		"hi" 
	 *  atFirst("h") 		"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="h";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		int len=str.length();
		String str2=atFirst(str1,len);
		System.out.println(str2);
		
	}
	public static String atFirst(StringBuilder str,int len){
		if(len<2){
			if(len==0){
				return str.append("@@").toString();
			}else{
				return str.append("@").toString();
		
			}
		}else{
			return str.substring(0, 2);
		}
	}

}
