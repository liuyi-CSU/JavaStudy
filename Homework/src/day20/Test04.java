package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	/**
	 * JDK6��JDK7�ı�׼�쳣�������
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		1.6�汾
		method1();
		try(FileInputStream fis=new FileInputStream("����ʦ.jpg");
		FileOutputStream fos=new FileOutputStream("��Ҫ�Ĳ���ʦ.jpg");){
			int b;
			while((b=fis.read())!=-1){
				fos.write(b);
			}
		}
	}

	private static void method1() throws FileNotFoundException, IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("����ʦ.jpg");
			fos=new FileOutputStream("��Ҫ����ʦ.jpg");
			int n;
			while((n=fis.read())!=-1){
				fos.write(n);
			}
		}finally{
			try{
				fis.close();
			}finally{
				fos.close();
			}
		}
	}

}
