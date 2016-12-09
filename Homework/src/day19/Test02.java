package day19;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {

	/**
	 * 练习关于File类的方法
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		/**File的构造方法*/
//		//File(String pathname):根据一个路径得到File对象
//		File file=new File("E:\\file\\课堂资料\\课程\\BiJi.java");
//		System.out.println("File(String pathname): "+file.exists());
//		//File(String parent,String child):根据一个目录和一个子文件/目录得到File对象
//		String str1="E:\\file\\课堂资料\\课程";
//		String str2="BiJi.java";
//		File file2=new File(str1,str2);
//		System.out.println("File(String parent,String child): "+file2.exists());
//		//File(File parent,String child)
//		File file3=new File(str1);
//		File file4=new File(file3,str2);
//		System.out.println("File(File parent,String child): "+file4.exists());
//		
//		/**File的创建功能*/
//		//createNewFile():
//		File createNewFILE=new File(str1,"createNewFile.java");
//		createNewFILE.createNewFile();
//		String[] str=file3.list();
//		System.out.println(Arrays.asList(str));
//		//mkdirs():创建文件
//		File MkDirs=new File(str1,"mkdires");
//		MkDirs.mkdirs();
//		System.out.println("MkDirs.exists(): "+MkDirs.exists());
		
		/**重命名和删除功能*/
		//renameTo(File dest):重命名或者剪切(路径不同)
		File file1=new File("E:\\file\\课堂资料\\课程");
		File file5=new File(file1,"重命名file5.java");
		file5.createNewFile();
		File file4=new File("E:\\file\\课堂资料\\课程\\重名名file4.java");
		String[] str=file1.list();
		System.out.println(Arrays.asList(str));
		System.out.println(file5.renameTo(file4));
		System.out.println(Arrays.asList(str));
		System.out.println("file4.exists()  "+file4.exists());
		
	}

	@Override
	public String toString() {
		return "Test02 [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
