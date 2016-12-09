package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test02 {

	/**
	 * 在控制台录入文件的路径,将文件拷贝到当前项目下 分析: 
	 * 1,定义方法对键盘录入的路径进行判断,如果是文件就返回 
	 * 2,在主方法中接收该文件
	 * 3,读和写该文件
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("请输入文件路径:");
		
		
		File file1=getFile();
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream("空空老师.jpg");
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
				System.out.println("请输入正确的文件路径");
				str1=sca.nextLine();
			}else if(str.isDirectory()){
				System.out.println("您输入的文件夹路径,请输入正确的文件路径");
				str1=sca.nextLine();
			}else{
				return str;
			}
		}
	}
	
}
