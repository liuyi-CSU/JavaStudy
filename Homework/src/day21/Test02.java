package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.TreeMap;

public class Test02 {

	/**
	 * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	 * 
	 * 分析:
	 * 1,创建带缓冲的输入流对象
	 * 2,创建双列集合对象TreeMap
	 * 3,将读到的字符存储在双列集合中,存储的时候要做判断,如果不包含这个键,就将键和1存储,如果包含这个键,就将该键和值加1存储
	 * 4,关闭输入流
	 * 5,创建输出流对象
	 * 6,遍历集合将集合中的内容写到times.txt中
	 * 7,关闭输出流
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("revzzz.txt"));
		TreeMap<String,Integer> tm=new TreeMap<>();
		int b;
		while((b=br.read())!=-1){
			String ch=String.valueOf(b);
			if(tm.containsKey(ch)){
				tm.put(ch, tm.get(ch)+1);
			}else{
				tm.put(ch, 1);
			}
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("times2.txt"));
		for (String string : tm.keySet()) {
			bw.write(string + "=" + tm.get(string));
		}
		bw.close();
	}

}
