package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test02 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)定义List集合，存入多个字符串
	(2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
	(3)然后利用迭代器遍历集合元素并输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList();
		list.add("bbbbbbb231");
		list.add("ddddd2434");
		list.add("aaaaaaa");
		list.add("ggggggg");
		
		method2(list);
		
		method1(list);
	}

	private static void method1(List<String> list) {
		String regex="\\d";
		Pattern compile = Pattern.compile(regex);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			Matcher matcher = compile.matcher(string);
			if(matcher.find()){
				iterator.remove();
			}
		}
		Iterator<String> iterator2 = list.iterator();
		print(iterator2);
	}

	private static void method2(List<String> list) {
		Iterator<String> iterator = list.iterator();
		Pattern compile = Pattern.compile("\\d");
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			if (compile.matcher(str).find()) {
				iterator.remove();
			}
		}
		Iterator<String> iterator2 = list.iterator();
		print(iterator2);
	}
	

	private static void print(Iterator<String> iterator2) {
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

}


