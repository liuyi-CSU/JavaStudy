package day16;

import java.util.ArrayList;

public class Test05 {

	/**
	 * ��100����Χ��һ��Ȧ����1��ʼ����������14������˾�Ҫ�˳���
	 * Ȼ�����������¿�ʼ����1��������14�˳����ʣ����ʣ�µ���100���е�
	 * �ڼ����ˣ�
		��ʾ:ʹ��ArrayList
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			method(100);
	}

	private static void method(int num) {
		int n= 0;
		int index=0;
		ArrayList list=new ArrayList();
		for (int i = 0; i <num; i++) {
			list.add(i+1);
		}
		while(list.size()!=1){
			if((n+1)%14==0){
				list.remove(index);
				index--;
			}
			n++;
			index++;
			if(index==list.size()){
				index=0;
				continue;
			}  
		}
		System.out.println(list);
	}

}
