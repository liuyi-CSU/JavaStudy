package day19;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {

	/**
	 * ��ϰ����File��ķ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		/**File�Ĺ��췽��*/
//		//File(String pathname):����һ��·���õ�File����
//		File file=new File("E:\\file\\��������\\�γ�\\BiJi.java");
//		System.out.println("File(String pathname): "+file.exists());
//		//File(String parent,String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
//		String str1="E:\\file\\��������\\�γ�";
//		String str2="BiJi.java";
//		File file2=new File(str1,str2);
//		System.out.println("File(String parent,String child): "+file2.exists());
//		//File(File parent,String child)
//		File file3=new File(str1);
//		File file4=new File(file3,str2);
//		System.out.println("File(File parent,String child): "+file4.exists());
//		
//		/**File�Ĵ�������*/
//		//createNewFile():
//		File createNewFILE=new File(str1,"createNewFile.java");
//		createNewFILE.createNewFile();
//		String[] str=file3.list();
//		System.out.println(Arrays.asList(str));
//		//mkdirs():�����ļ�
//		File MkDirs=new File(str1,"mkdires");
//		MkDirs.mkdirs();
//		System.out.println("MkDirs.exists(): "+MkDirs.exists());
		
		/**��������ɾ������*/
		//renameTo(File dest):���������߼���(·����ͬ)
		File file1=new File("E:\\file\\��������\\�γ�");
		File file5=new File(file1,"������file5.java");
		file5.createNewFile();
		File file4=new File("E:\\file\\��������\\�γ�\\������file4.java");
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
