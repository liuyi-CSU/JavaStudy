package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test04 {

	/**
	 * map�����������ݣ�{���� = 2.0, �ƹ� = 2.5 �������� = 5.0, ���� = 3.0 , ���� = 3.5} 
	 * a.ʵ��һ��ѯ�ʼ۸�ķ�������ȡ�û��ڿ���̨��������߲����ƣ�Ȼ���ڸ�map�����в�ѯ��Ӧ�ļ۸��У���������Ӧ�ļ۸����
	 * û������ʾ�û����Ѿ����ꡱ 
	 * b. ���ƹϵļ۸��ϵ� 1 Ԫ��������ֱ�Ӹ�ֵ3.5�� 
	 * c. �������߲˵ļ۸����3���߲����ƴ�ӡ������̨
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("����", 2.0);
		hm.put("�ƹ�", 2.5);
		hm.put("������", 5.0);
		hm.put("����", 5.0);
		hm.put("����", 5.0);
		System.out.println("�ϰ�Ҫʲô��?");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		if(hm.containsKey(str)){
			System.out.println(hm.get(str));
		}else{
			System.out.println("�Ѿ�����");
		}
		System.out.println("���лƹϵļ۸��ϵ���!");
		hm.put("�ƹ�", hm.get("�ƹ�")+1.0);
		System.out.println("�ƹϼ۸�"+hm.get("�ƹ�"));
		Set<String> keySet=hm.keySet();
		Iterator<String> it = keySet.iterator();
		System.out.println("�����߲˼۸����3Ԫ,������");
		while (it.hasNext()) {
			String str1 = (String) it.next();
			if(hm.get(str1)>3.0){
				System.out.println(str1+"Ҫ"+hm.get(str1)+"Ԫ");
			}
		}
	}

}
