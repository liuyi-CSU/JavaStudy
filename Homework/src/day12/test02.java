package day12;
/**liuyi-CSU*/
public class test02 {

	/**
	 * ����һ��������:
��д������:
	1.����һ���ַ�������s1, ��ֵΪ "itheima"
	2.�����ַ����еķ����ж�s1���Ƿ����"ma",���ڿ���̨����ý��
	3.�����ַ����еķ����ж�s1�Ƿ���"hei"��ͷ,���ڿ���̨����ý��
	4.�����ַ����еķ����ж�s1�Ƿ���".txt"��β,���ڿ���̨����ý��
	5.�����ַ����еķ����ж�s1�����Ƿ�Ϊ��,���ڿ���̨��������
	5.�����ַ����еķ����ж�s1�����Ƿ���"��������"��ͬ,���ڿ���̨��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="itheima";
		boolean b1=s1.contains("ma");
		System.out.println(b1);
		boolean b2=s1.startsWith("hei");
		System.out.println(b2);
		boolean b3=s1.endsWith(".txt");
		System.out.println(b3);
		boolean b4=s1.isEmpty();
		System.out.println(b4);
		boolean b5=s1.equals("��������");
		System.out.println(b5);
	}

}
