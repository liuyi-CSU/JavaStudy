package TEST100;

public class Test22 {

	/**
	 * ������һ��������������equalIsNot;
	 * 
	 * ����һ���ַ���������ַ����г��ֵġ�is���͡�not��������ȣ��򷵻�true�����򷵻�false��
	 * 
	 * ��ʾ: 
	 * �������� 							����ֵ 
	 * equalIsNot("This is not") 		false 
	 * equalIsNot("This is notnot")		true 
	 * equalIsNot("noisxxnotyynotxisi") true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
	}

	private static boolean equalIsNot(String str) {
		// TODO Auto-generated method stub
		int isNum=getNum(str,"is");
		int notNum=getNum(str,"not");
		return isNum==notNum;
	}

	private static int getNum(String string,String str) {
		// TODO Auto-generated method stub
		int count=0;
		while(string.contains(str)){
			count++;
			string=string.substring(string.indexOf(str)+str.length());
		}
		return count;
	}

}
