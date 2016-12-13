package TEST100;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test27 {

	/**
	 * ������һ��������������countTriple;

	 	����Ԫ�顱��ָһ���������ֵ����ε��ַ������ظ����ַ�������Ԫ��ĸ�����
		����Ԫ�顱�ǿ����ص��ģ���AAAA������������Ԫ��
		
		��ʾ:
		�������� 						����ֵ 
		countTriple("abcXXXabc") 	1 
		countTriple("xxxabyyyycd") 	3 
		countTriple("a") 			0 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countTriple("xxxabyyyycd"));
	}

	private static int countTriple(String str) {
		// TODO Auto-generated method stub
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else{
				hm.put(c, hm.get(c)+1);
			}
		}
		//count = method1(count, hm);
		count = method2(count,hm);
		return count;
	}

	private static int method2(int count, HashMap<Character, Integer> hm) {
		// TODO Auto-generated method stub
		for(Character key:hm.keySet()){
			if(hm.get(key)>=3){
				count++;
			}
		}
		return count;
	}

	private static int method1(int count, HashMap<Character, Integer> hm) {
		for(Entry<Character,Integer>en:hm.entrySet()){
			Character key=en.getKey();
			Integer value=en.getValue();
			if(value>=3){
				count++;
			}
		}
		return count;
	}

}
