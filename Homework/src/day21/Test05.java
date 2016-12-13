package day21;

import java.io.File;
import java.util.Scanner;

public class Test05 {

	/**
	 * 从键盘接收一个文件夹路径,统计该文件夹大小
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入文件路径:");
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
			System.out.println("文件路径错误");
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
