package TEST100;

public class Test35 {

	/**
	 * ������һ��������������sameEnds;

	  ����һ�ַ�������ȡ�����ַ�����ͷ�ͽ�β��ͬ�������Ҳ����ص��������ء�
	���磺("javaXYZjava") -> "java",���򷵻ؿա�
	
	
	��ʾ:
	�������� ����ֵ 
	sameEnds("abXYab") "ab" 
	sameEnds("xx") "x" 
	sameEnds("xxx") "x" 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sameEnds("abXYab"));
		System.out.println(sameEnds("xx"));
		System.out.println(sameEnds("xxx"));
	}

	private static String sameEnds(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		int i=1;
		while(str.substring(0, i).length()<=str.length()/2){
			if(str.endsWith(str.substring(0, i))){
				sb.append(str.substring(0, i));
				i++;
			}else{
				i++;
			}
		}
		return sb.toString();
	}

}
