package TEST100;

public class Test32 {

	/**
	 * ������һ��������������countHi;

		  �������ַ��������ж��ٸ�hi��
		Ҫ��ͳ�������������hi�ַ������ֵĴ���
		���磬�������ַ���Ϊ"hi,itheima"���������һ��"hi"���ؽ��Ϊ1
		
		��ʾ:
		�������� 					����ֵ 
		countHi("abc hi ho") 	1 
		countHi("ABChi hi") 	2 
		countHi("hihi") 		2 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));
	}

	private static int countHi(String string) {
		// TODO Auto-generated method stub
		int count=0;
		while(string.contains("hi")){
			count++;
			string=string.substring(string.indexOf("hi")+"hi".length());
		}
		return count;
	}

}
