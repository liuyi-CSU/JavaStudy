package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test01 {

	/**
	 * ͼƬ����\
	 * 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("����ʦ.jpg");
		FileOutputStream fos=new FileOutputStream("����ʦ����.jpg");
		int b;
		while((b=fis.read())!=-1){
			fos.write(b^1223);//�������ͬһ������õ����Լ�
		}
		fis.close();
		fos.close();
	}
//����������һ"����ʦ����.jpg"�ļ�,�����޷���
//�ٰ�"����ʦ����.jpg"��Ϊ������,�Ϳ�����.
}
