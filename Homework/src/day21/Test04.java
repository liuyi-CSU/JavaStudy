package day21;

import java.io.File;
import java.util.Scanner;

public class Test04 {

	/**
	 * 从键盘接收一个路径,统计该路径下的.java文件.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=getDir();
		int count=0;
		System.out.println("count="+sumFile(count,dir));
	}

	public static File getDir() {
		Scanner sc = new Scanner(System.in);				
		System.out.println("请输入一个文件夹路径");
		while(true) {
			String line = sc.nextLine();					
			File dir = new File(line);						
			if(!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在,请重新录入");
			}else if(dir.isFile()) {
				System.out.println("您录入的是文件路径,请重新录入文件夹路径");
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
