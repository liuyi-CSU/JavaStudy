package TEST100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test09 {

	/**
	 * 给你一个字符串，如果包含bob就返回true 注意如果bob中的字符o,可以是任何字符 
	 * 例如:bob返回true, bpb返回true
	 * 
	 * 
	 * 提示: 
	 * 方法调用 				期望值 
	 * bobThere("abcbob") 	true 
	 * bobThere("b9b") 		true 
	 * bobThere("bac")		false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern compile = Pattern.compile("b.+b");
		Matcher matcher = compile.matcher("abcbob");
		System.out.println(matcher.find());
	}
}
/*
  	/ 要验证的字符串
    String str = "service@xsoftlab.net";
    // 邮箱验证规则
    String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
    // 编译正则表达式
    Pattern pattern = Pattern.compile(regEx);
    // 忽略大小写的写法
    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(str);
    // 字符串是否与正则表达式相匹配
    boolean rs = matcher.matches();
    System.out.println(rs);*/
