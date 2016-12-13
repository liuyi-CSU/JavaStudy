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
	 * ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * ����:
	 * 1,���������������������
	 * 2,����˫�м��϶���TreeMap
	 * 3,���������ַ��洢��˫�м�����,�洢��ʱ��Ҫ���ж�,��������������,�ͽ�����1�洢,������������,�ͽ��ü���ֵ��1�洢
	 * 4,�ر�������
	 * 5,�������������
	 * 6,�������Ͻ������е�����д��times.txt��
	 * 7,�ر������
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
