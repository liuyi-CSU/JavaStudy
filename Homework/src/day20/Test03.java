package day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test03 {

	/**
	 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�
	 * ����:
	 * 1,��������¼�����
	 * 2,�������������,����text.txt�ļ�
	 * 3,��������ѭ��
	 * 4,����quit�˳�ѭ��
	 * 5,�����quit,�ͽ�����д��
	 * 6,�ر���
	 * @throws Exception 

	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�������������");
		 Scanner sca=new Scanner(System.in);
		 String str=sca.nextLine();
		 FileOutputStream fos=new FileOutputStream("text.txt");
		 while(str!="quit"){
			 fos.write(str.getBytes());
			 fos.write("\r\n".getBytes());
		 }
		 fos.close();
	}

}
