package day12;
/**liuyi-CSU*/
public class test03 {

	/**
	 *  1.����һ���ַ�������s, ��ֵΪ "itheima"
		2.�����ַ����еķ���,��ȡ�ַ����ĳ���,���ڿ���̨��������
		3.�����ַ����еķ���,��ȡ�ַ�����'h'���ֵ�λ��,���ڿ���̨��������
		4.�����ַ����еķ���,��ȡ�ַ�����"ma"���ֵ�λ��,���ڿ���̨��������
		5.�����ַ����еķ���,��ȡ�ַ�����'i'�����ֵ�λ��,���ڿ���̨��������
		6.�����ַ����еķ���,��ȡ�ַ����дӵڶ���λ�õ����λ�õ�����,���ڿ���̨��������
		7.�����ַ����еķ���,��ȡ�ַ����дӵڶ���λ�õ����ĸ�λ�õ�����,���ڿ���̨��������
		8.�����ַ����еķ���,���ַ����е�"hei"�滻��"bai",���ڿ���̨��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="itheima";
		int len=s.length();
		int index_h=s.indexOf('h');
		int index_ma=s.indexOf("ma");
		int index_i=s.lastIndexOf('i');
		String s1=s.substring(1);
		String s2=s.substring(1, 3);
		String s3=s.replace("hei", "bai");
		System.out.println("��ȡ�ַ����ĳ���:"+len+";�ַ�����'h'���ֵ�λ��:"+index_h+";�ַ�����\"ma\"���ֵ�λ��:"+index_ma+";'i'�����ֵ�λ��:"+index_i);
		System.out.println("�ַ����дӵڶ���λ�õ����λ�õ�����:"+s1+";�ַ����дӵڶ���λ�õ����ĸ�λ�õ�����:"+s2+";���ַ����е�\"hei\"�滻��\"bai\":"+s3);
	}

}
