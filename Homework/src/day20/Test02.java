package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test02 {

	/**
	 * �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ�� ����: 
	 * 1,���巽���Լ���¼���·�������ж�,������ļ��ͷ��� 
	 * 2,���������н��ո��ļ�
	 * 3,����д���ļ�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�������ļ�·��:");
		
		
		File file1=getFile();
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream("�տ���ʦ.jpg");
		int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

	private static File getFile() {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		String str1=sca.nextLine();
		File str=new File(str1);
		while(true){
			if(!str.exists()){
				System.out.println("��������ȷ���ļ�·��");
				str1=sca.nextLine();
			}else if(str.isDirectory()){
				System.out.println("��������ļ���·��,��������ȷ���ļ�·��");
				str1=sca.nextLine();
			}else{
				return str;
			}
		}
	}
	
}
