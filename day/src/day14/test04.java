package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test04 {

	/**
	 * 提取字符串中的电话号码
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "我的手机是18511866260,我曾用过18987654321,还用过18812345678";
		String regex="1[45678]\\d{9}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
