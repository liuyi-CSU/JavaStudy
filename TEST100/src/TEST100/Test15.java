package TEST100;

import java.awt.image.BufferStrategy;

public class Test15 {

	/**
	 * 
	 * ������һ��������������doubleChar;
	 * 
	 * �����а�����1���������Ǹ������ַ����� Ҫ������������ÿ���ַ�����һ�� ���磬�������ַ���Ϊ"abc"�����ؽ��Ϊ"aabbcc"
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ 
	 * doubleChar("The") 		"TThhee" 
	 * doubleChar("AAbb") 		"AAAAbbbb"
	 * doubleChar("Hi-There") 	"HHii--TThheerree"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi-There";
		System.out.println(doubleChar(str));
	}
	public static StringBuffer doubleChar(String str){
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (char c : ch) {
			sb.append(c);
			sb.append(c);
		}
		return sb;
	}
}
