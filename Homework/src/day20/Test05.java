package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.TreeSet;

public class Test05 {

	/**
	 * ��֪�ļ�a.txt�ļ��е�����Ϊ��AAbcdea22dferwplkCC321ou1��,
	 * ���д�����ȡ���ļ����ݣ�Ҫ��ȥ���ظ���ĸ(���ִ�Сд��ĸ)��������Ȼ����˳��������b.txt�ļ��С�
	 * ��b.txt�ļ�����ӦΪ"abc......123..."������˳�����
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
