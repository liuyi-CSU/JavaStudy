package day21;

import java.io.File;
import java.util.Scanner;

public class Test05 {

	/**
	 * �Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ļ�·��:");
		Scanner sca = new Scanner(System.in);
		String str=sca.nextLine();
		File file=new File(str);
		int num1=0;
		int num=findSize(num1,file);
		System.out.println("num:"+num);
	}

	private static int findSize(int num,File file) {
		// TODO Auto-generated method stub
		
		if(!file.exists()){
			System.out.println("�ļ�·������");
			return -1;
		}
		else if(file.isFile()){
			return 1;
		}else{
			File[] file2=file.listFiles();
			for (File file3 : file2) {
				num+=findSize(num,file3);
			}
			
		}
		return num;
	}

}
