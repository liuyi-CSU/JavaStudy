package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class Test01 {

	/**
	 * ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
	 * 
	 * ����:
	 * 1,����һ��ѧ����
	 * 		��Ա����:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܳɼ�
	 * 		��Ա����:�ղ�,�вι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	 * 			  toString����,�ڱ��������е�Student�����ӡ�������õ�ʱ�����ʾ����ֵ
	 * 2,����¼����ҪScanner,��������¼�����
	 * 3,����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,�����ֱܷȽ�
	 * 4,¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ͽ��д洢
	 * 5,��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӶ���Ԫ��ת����int��,
	 * 6,��ת����Ľ����װ��Student����,��Student��ӵ�TreeSet������
	 * 7,����TreeSet���ϴ�ӡÿһ��Student����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����:(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�)");
		Scanner sca=new Scanner(System.in);
		TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num=o2.getSum()-o1.getSum();
				return num==0?1:num;
			}
		});
		while(ts.size()<5){
			String str1=sca.nextLine();
			String[] str2=str1.split(",");
			ts.add(new Student(str2[0],Integer.parseInt(str2[1]),Integer.parseInt(str2[2]),Integer.parseInt(str2[3])));
		}
		System.out.println(ts);
	}

}
