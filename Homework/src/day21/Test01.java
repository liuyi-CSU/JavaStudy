package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Test01 {

	/**
	 * ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * 1,������������������������
	 * 2,����˫�м��϶���,Ŀ���ǰ��ַ�������,���ַ����ֵĴ�������ֵ
	 * 3,ͨ����ȡ�����򼯺��д洢,�洢��ʱ��Ҫ�ж�,���������������ͽ�����ֵΪ1�洢,��������ͽ�����ֵ��1�洢
	 * 4,�ر�������
	 * 5,�������������
	 * 6,�����д��
	 * 7,�ر������
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
