package day17;

import java.util.HashSet;

public class Test05 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)��ӡһ���ַ�����ȫ�ַ���������ԭʼ�ַ�����û���ظ��ַ�
	(2)����:ԭʼ�ַ�����"def"�� ��ӡ�õ�����������������
		"d" "e" "f" "de" "df" "ed" "ef" "fd" "fe" "def" "dfe" "edf" "efd" "fde" "fed"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"d","e","f"};
//		String[] str2={"d","e","f"};
//		String[] str3={"d","e","f"};
		HashSet<String> hs = method1(str);
		System.out.println(hs);
	}

	private static HashSet<String> method1(String[] str) {
		HashSet<String> hs=new HashSet<>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
			for (int j = 0; j < str.length; j++) {
				if(str[i]!=str[j])
				hs.add(str[i]+str[j]);
				for (int j2 = 0; j2 < str.length; j2++) {
					if(str[i]!=str[j]&&str[i]!=str[j2]&&str[j]!=str[j2])
					hs.add(str[i]+str[j]+str[j2]);
				}
			}
		}
		return hs;
	}

}
