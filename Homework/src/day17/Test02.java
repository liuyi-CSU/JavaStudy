package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test02 {

	/**
	 * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 * 
	 * 1,����Scanner����,����¼��
	 * 2,����TreeSet���϶���,TreeSet�����д���Ƚ���
	 * 3,����ѭ�����Ͻ�������,����quit�˳�,��Ϊ�˳���quit,���Լ���¼���ʱ��Ӧ�ö����ַ�������ʽ¼��
	 * 4,�ж���quit���˳�,���ǽ���ת��ΪInteger,����ӵ�������
	 * 5,����TreeSet���ϲ���ӡÿһ��Ԫ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����,\"quit\"��������");
		Scanner sca=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int num=o2-o1;
				return num==0?1:num;
			}
		});
		String str=sca.nextLine();
		while(!str.equals("quit")){
			ts.add(Integer.parseInt(str));
			str=sca.nextLine();
		}
		System.out.println(ts);
	}

}
