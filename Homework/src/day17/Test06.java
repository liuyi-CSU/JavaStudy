package day17;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test06 {

	/**
	 * ����¼��һ���ַ���, ��¼��һ���ַ�, �����ַ��ҵ��ַ��������е�����ֵ, ��������ַ����ַ����г��ֵ��ܴ���. ������ַ����ַ����в�����,
	 * ��ô�ͼ���¼��. ���¼����ζ�û�ҵ�, ���������һ���ַ��������е��ַ�, ��������������е�����ֵ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������һ���ַ���:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		System.out.println("��¼��һ���ַ�");
		String ch=sca.nextLine();
		Random rd=new Random();
		int n=1;
		while(!str.contains(ch)){
			System.out.println("������"+(5-n)+"�λ���");
			System.out.println("����¼��һ���ַ�:");
			ch=sca.nextLine();
			if(n==4){
				ch=str.substring(rd.nextInt(str.length()), str.length());//�����ȡ�ַ����е�һ���ַ�
				break;
			}
			n++;
		}
		//�����ַ��ҵ��ַ��������е�����ֵ, ��������ַ����ַ����г��ֵ��ܴ���
		ArrayList<Integer> arr=new ArrayList<>();
		int index=str.indexOf(ch);
		arr.add(index);
		int count=1;
		while((str.indexOf(ch, ++index))!=-1){
			index=str.indexOf(ch, index);
			arr.add(index);
//			System.out.println("index="+index);//������
			count++;
		}
		System.out.println("�ַ����ֵ��ܵĴ���:"+count+"; ���е�����ֵ:"+arr);
	}

}
