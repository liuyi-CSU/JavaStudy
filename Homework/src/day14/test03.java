package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test03 {

	/**
	 * �������һ���ַ���String s = "�ҵ��ֻ���18511866260,�����ù�18987654321, ���ù�18812345678",
	 * ����: ��һ���ַ����е��ֻ������ȡ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "�ҵ��ֻ���18511866260,�����ù�18987654321, ���ù�18812345678";
		String regex="1[34578]\\d{9}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
