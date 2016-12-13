package day21;

import java.io.File;
import java.util.Scanner;

public class Test04 {

	/**
	 * �Ӽ��̽���һ��·��,ͳ�Ƹ�·���µ�.java�ļ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=getDir();
		int count=0;
		System.out.println("count="+sumFile(count,dir));
	}

	public static File getDir() {
		Scanner sc = new Scanner(System.in);				
		System.out.println("������һ���ļ���·��");
		while(true) {
			String line = sc.nextLine();					
			File dir = new File(line);						
			if(!dir.exists()) {
				System.out.println("��¼����ļ���·��������,������¼��");
			}else if(dir.isFile()) {
				System.out.println("��¼������ļ�·��,������¼���ļ���·��");
			}else {
				return dir;
			}
		}
	}
	public static int sumFile(int count,File dir) {
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".java")) {
				count++;
			}else if (subFile.isDirectory()){
				count+=sumFile(count,subFile);
			}
		}
		return count;
	}

}
