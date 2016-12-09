package day20;

import java.io.FileOutputStream;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Test06 {

	/**
	 * �洢20��1-50(��50)�����ż��Ԫ��,���ֿ��ظ�,�����ɺ�Ӵ�С����.
	 * ��ʹ��IO���������е�Ԫ�ذ�ָ����ʽ�������ǰ��Ŀ��num.txt��,����: 48,48,44,40,38,34,30,26,26......
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num=o2.compareTo(o1);
				return num==0?1:num;
			}
		});
		
		Random r=new Random();
		while(ts.size()<20){
			int num=r.nextInt(50)+1;
			ts.add(String.valueOf(num));
		}
		
		FileOutputStream fos=new FileOutputStream("num.txt");
		
		for (String str : ts) {
//			System.out.println(str);
			fos.write((str+",").getBytes());
		}
		fos.close();
	}

}
