package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test01 {

	/**
	 * 实现QQ号码校验
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="021213233";
		System.out.println(jiaoYan(str));
	}
	public static boolean jiaoYan(String str){
		//char[] ch=str.toCharArray();
		boolean flag=false;
		String regex="[^0]\\d{1,10}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(regex);
		if(m.find()){
			flag=true;
		}
		return flag;
	}

}
