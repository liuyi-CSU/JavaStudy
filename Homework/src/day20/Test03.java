package day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test03 {

	/**
	 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
	 * 分析:
	 * 1,创建键盘录入对象
	 * 2,创建输出流对象,关联text.txt文件
	 * 3,定义无限循环
	 * 4,遇到quit退出循环
	 * 5,如果不quit,就将内容写出
	 * 6,关闭流
	 * @throws Exception 

	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("请键入输入内容");
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
