package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	/**
	 * JDK6与JDK7的标准异常处理代码
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		1.6版本
		method1();
		try(FileInputStream fis=new FileInputStream("苍老师.jpg");
		FileOutputStream fos=new FileOutputStream("你要的苍老师.jpg");){
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
			fis=new FileInputStream("苍老师.jpg");
			fos=new FileOutputStream("你要的老师.jpg");
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
