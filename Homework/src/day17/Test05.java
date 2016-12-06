package day17;

import java.util.HashSet;

public class Test05 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)打印一个字符串的全字符组合情况，原始字符串中没有重复字符
	(2)例如:原始字符串是"def"， 打印得到下列所有组合情况：
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
