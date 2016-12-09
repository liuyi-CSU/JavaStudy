package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Test04 {

	/**
	 * .�����������󣬲��ô���ʵ�֣� 
	 * (1)�������������ַ�����"1.2,3.4,5.6,7.8,5.56,44.55"�밴��Ҫ�����������������
	 * (2)�Զ�����Ϊ�ָ���������֪���ַ����ֳ�һ��String���͵����飬�����е�ÿһ��Ԫ��������"1.2","3.4"�������ַ���
	 * (3)�������е�ÿһ��Ԫ����
	 * "."��Ϊ�ָ�������"."��ߵ�Ԫ����Ϊkey���ұߵ�Ԫ����Ϊvalue����װ��Map�У�Map�е�key��value����Object����
	 * (ע��, ������5.6��5.56��������, �����зֳ��������������ͬ��key, ֵ��Ϊ5,
	 * ˼��һ��,����Ӧ����ô�����ܽ�������key������???) 
	 * (4)��map�е�key��װ��Set�У�����Set�е�Ԫ�����
	 * (5)��map�е�value��װ��Collection�У���Collection�е�Ԫ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1.2,3.4,5.6,7.8,5.56,44.55";
		String[] str1=str.split(",");
		HashMap hm = toHashMap(str1);
		System.out.println(hm);
	}

	private static HashMap toHashMap(String[] str1) {
		HashMap hm=new HashMap();
		TreeSet ts=new TreeSet();
		Collection c=new ArrayList();
		System.out.println(Arrays.asList(str1));
		for (String string : str1) {
			
			String[] str2=string.split("\\.");
			Object key=str2[0];
			Object value=str2[1];
			if(!hm.containsKey(key)){
				hm.put(key, value);
				ts.add(key);
				c.add(value);
			}else{
				hm.put("����"+key, value);
				ts.add("����"+key);
				c.add(value);
			}
		}
		System.out.println("Set: "+ts);
		System.out.println("Collection: "+c);
		return hm;
	}

}
