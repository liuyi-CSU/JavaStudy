package day13;

import java.util.Scanner;

public class test03 {

	/**
	 * ����һ����ʵ��MyStringUtils�ӿڲ�������Ҫ��ʵ���������󷽷�
		a)�ַ�����ת����: ��������ַ������з�ת�󷵻�(����StringBuffer��reverse����) 
		b)�ַ�����������: ��������ַ��������ֹ��˷���(���紫��abd78df, ����abddf)
		���ڲ������н��в���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ���");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		clazz str1=new clazz(); 
		System.out.println(str1.reverse(str));
		System.out.println(str1.reverse2(str));
	}

}

interface MyStringUtils{
	public abstract String reverse(String str);
	public abstract String reverse2(String str);
}

class clazz implements MyStringUtils{
	/**��ת����*/
	public String reverse(String str){
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String str1=String.valueOf(ch);
		return str1;
	}
	/**ɾ������*/
	public String reverse2(String str){
		char ch[]=str.toCharArray();
		int count=0;//��¼���ֳ��ֵĴ���
		for (int i = 0; i < ch.length-count; i++) {
			if(ch[i]>='0'&&ch[i]<='9'){
				for(int j=i;j<ch.length-1;j++){
					ch[j]=ch[j+1];
				}
				count++;
				i--;
			}
		}
		String str1=String.valueOf(ch, 0, ch.length-count);
		return str1;
		
	}
}
