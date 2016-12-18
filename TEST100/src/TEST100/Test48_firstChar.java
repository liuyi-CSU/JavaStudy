package TEST100;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test48_firstChar {

	/**
	 * ������һ��������������firstChar; ����һ���ǿ��ַ������飬Ϊÿ����ͬ�ĵ�һ���ַ�����һ��Map ��
	 * ��Ϊ�ַ������׸��ַ���ֵΪ���иü��׸��ַ��������ַ�������׷�ӣ����磺["salt","tea","soda","toast"]�ַ�������
	 * ���ؽ����{��t��:"teatoast","s":"saltsoda"}�����ǲ�ͬ�ַ������׸��ַ���ֵ�ǰ������������е�˳��׷����һ�� 
	 * ��ʾ:
	 * �������� 										����ֵ
	 * firstChar(["salt","tea","soda","toast"])		{"t":"teatoast","s":"saltsoda"}
	 * firstChar(["aa","bb","cc","aAA","cCC","d"])	{"d":"d","b":"bb","c":"cccCC","a":"aaaAA"} firstChar([]) {}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"salt","tea","soda","toast"};
		HashMap<String,String> hm=firstChar(str);
		System.out.println(hm);
	}

	private static HashMap firstChar(String[] str) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if(!hm.containsKey(str[i].charAt(0)+"")){
				hm.put(str[i].charAt(0)+"", str[i]);
			}else{
				hm.put(str[i].charAt(0)+"", hm.get(str[i].charAt(0)+"")+str[i]);
			}
		}
		return hm;
	}

}
