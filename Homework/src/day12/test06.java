package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test06 {

	/**
	 * 6.��д����ѭ�������û��Ӽ����������ַ�����ֱ�����롰end��ʱѭ������������������������ַ��������ӡ
		��������: 
		abc
		def
		end
		���: fedcba
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ַ�����end����");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		str = method(sca, str);
	}

	private static String method(Scanner sca, String str) {
		while((!str.equals("end"))&&(!str.isEmpty())){
			char[] ch=str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[ch.length-1-i]);
			}
			str=sca.nextLine();
		}
		return str;
	}
}
