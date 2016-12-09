package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.TreeSet;

public class Test05 {

	/**
	 * 已知文件a.txt文件中的内容为“AAbcdea22dferwplkCC321ou1”,
	 * 请编写程序读取该文件内容，要求去掉重复字母(区分大小写字母)并按照自然排序顺序后输出到b.txt文件中。
	 * 即b.txt文件内容应为"abc......123..."这样的顺序输出
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		FileInputStream fis=new FileInputStream("a.txt");
		FileOutputStream fos=new FileOutputStream("b.txt");
		int b;
		while((b=fis.read())!=-1){
			ts.add(""+(char)b);
		}
		System.out.println(ts);
		for (String string : ts) {
			fos.write((string+",").getBytes());
			System.out.println(string);
		}
		fis.close();
		fos.close();
	}

}
