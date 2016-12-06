package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test02 {

	/**
	 * �����������󣬲��ô���ʵ�֣� 
	 * (1)ͳ��ÿ�����ʳ��ֵĴ��� 
	 * (2)�������ַ���
	 * "If you want to change your fate I think you must come to the dark horse to learn java"
	 * (�ÿո���) 
	 * (3)��ӡ��ʽ�� to=3 think=1 you=2'
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="If you want to change your fate I think you must come to the dark horse to learn java";
		String[] str=str1.split(" +");
		HashMap<String,Integer> hm=new HashMap<>();
		for (String string : str) {
			if(hm.containsKey(string)){
				hm.put(string, hm.get(string)+1);
			}else{
				hm.put(string, 1);
			}
		}
		System.out.println(print(hm));
	}
	
	private static <K, V> String print(HashMap<K, V> hm) {
		// TODO Auto-generated method stub
		Iterator<Entry<K,V>> i = hm.entrySet().iterator();
        if (! i.hasNext())
            return "";

        StringBuilder sb = new StringBuilder();
        for (;;) {
            Entry<K,V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            sb.append(key   == hm ? "(this Map)" : key);
            sb.append('=');
            sb.append(value == hm ? "(this Map)" : value);
            sb.append('\n');
            if (! i.hasNext())
                return sb.toString();
        }
	}

}
