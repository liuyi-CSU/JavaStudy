package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Test01 {

	/**
	 * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	 * 
	 * 1,创建带缓冲区的输入流对象
	 * 2,创建双列集合对象,目的是把字符当作键,把字符出现的次数当作值
	 * 3,通过读取不断向集合中存储,存储的时候要判断,如果不包含这个键就将键和值为1存储,如果包含就将键和值加1存储
	 * 4,关闭输入流
	 * 5,创建输出流对象
	 * 6,将结果写出
	 * 7,关闭输出流
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm=new HashMap<>();
		BufferedReader br=new BufferedReader(new FileReader("revzzz.txt"));
//		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("revzzz.txt"));
		int b;
	while((b=br.read())!=-1){
		char ch=(char)b;
			if(!hm.containsKey(ch)){
				hm.put(ch, 1);
			}else{
				hm.put(ch, hm.get(ch)+1);
			}
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("times.txt"));
		for (Character string : hm.keySet()) {
			bw.write(string+"="+hm.get(string));
		}
		bw.close();
	}

}
