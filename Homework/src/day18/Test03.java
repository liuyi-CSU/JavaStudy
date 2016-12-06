package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {

	/**
	 * ����һ��Map���ϣ�����������Ԫ��
	{�㽶 = 5.6 ��ӣ�� = 25 ������ = 5.6 �� ƻ�� = 2.3}
	a. ������map���ϣ�����ͳ���ж�����ˮ����key�������ַ�ʽ���б��� 
	b. �����㽶���ļ۸��޸�Ϊ10.9 
	c. ɾ��������������
	d. ���޸ĺ��map������key��value�����������̨ 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("�㽶", 5.6);
		hm.put("ӣ��", 25.0);
		hm.put("����", 5.6);
		hm.put("ƻ��", 2.3);
		hm.put("�㽶", 10.9);
		hm.remove("����");
		int count1=traverse1(hm);
		System.out.println("********************");
		int count2=traverse2(hm);
	}

	private static int traverse2(HashMap<String, Double> hm) {
		// TODO Auto-generated method stub
		Set<String> keySet=hm.keySet();
		Iterator<String> it = keySet.iterator();
		int count=0;
		for (String string : hm.keySet()) {
			System.out.println(string+"="+hm.get(string));
			count++;
		}
		System.out.println("count="+count);
		return count;
	}

	private static int traverse1(HashMap<String, Double> hm) {
		// TODO Auto-generated method stub
		Set<Map.Entry<String, Double>>entrySet=hm.entrySet();
		Iterator<Entry<String, Double>> it = entrySet.iterator();
		int count=0;
		while(it.hasNext()){
			Entry<String, Double> en=it.next();
			String key=en.getKey();
			Double value=en.getValue();
			count++;
			System.out.println(key+"="+value);
		}
		System.out.println("count="+count);
		return count;
	}

}
