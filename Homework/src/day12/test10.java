package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test10 {

	/**
	 * ��дһ��ת���ַ��ķ���, ������̨������ַ�������÷�����, Ҫ��: 
	 a) �����ַ����еĴ�д��ĸ���Сд��ĸ, 
	 b) ��Сд��ĸת�ɴ�д��ĸ, �������滻��*, �����ַ�����. 
	 c) ͳ��ת���˶��ٴ�(��Сдת��+�����滻���ܺ�)�ڿ���̨���ת������ַ����Լ�ת���ܴ��� 
	 !!!ע��:����ʹ��toUpperCase()��toLowerCase(); (a��ASCIIֵΪ97, A��ASCIIֵΪ65)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����������ַ���:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		str.toUpperCase();
		char[] ch=str.toCharArray();
		int count=0;
		count = method(ch, count);
		print(ch);
		System.out.println();
		System.out.println("count="+count);
	}
	//��ӡ�ַ���
	private static void print(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	//ת��������
	private static int method(char[] ch, int count) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z'){
				count++;
				ch[i]=(char)((int)ch[i]-32);
			}else if(ch[i]>='A'&&ch[i]<='Z'){
				count++;
				ch[i]=(char)((int)ch[i]+32);
			}else if(ch[i]>='0'&&ch[i]<='9'){//ע��Ҫ�õ�����
				count++;
				ch[i]='*';
			}else{
				continue;
			}
			
		}
		return count;
	}

}
