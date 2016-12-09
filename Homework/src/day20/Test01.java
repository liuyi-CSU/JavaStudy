package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test01 {

	/**
	 * 图片加密\
	 * 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("苍老师.jpg");
		FileOutputStream fos=new FileOutputStream("苍老师加密.jpg");
		int b;
		while((b=fis.read())!=-1){
			fos.write(b^1223);//两次异或同一个数会得到它自己
		}
		fis.close();
		fos.close();
	}
//会重新生成一"苍老师加密.jpg"文件,但是无法打开
//再把"苍老师加密.jpg"作为输入流,就可以了.
}
