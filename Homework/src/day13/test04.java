package day13;

public class test04 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)��ӡ��7��8��9����������ɵ���λ����Ҫ�����λ����������λ���ֲ�����ͬ
	(2)��ӡ��ʽ������λ�����Կո�ָ�����789 798 879 897 978 987
	��ʾ: ����ʹ��forѭ����Ƕ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={7,8,9};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(i==j)continue;
				for (int j2 = 0; j2 < num.length; j2++) {
					if(i==j2||j==j2)continue;
					System.out.print(num[i]);
					System.out.print(num[j]);
					System.out.print(num[j2]+" ");
				}
			}
			
		}
	}

}
