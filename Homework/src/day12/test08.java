package day12;
/**liuyi-CSU*/
public class test08 {

	/**
	 �����������󣬲��ô���ʵ�֣�
	(1)���������ַ�������{"010","3223","666","7890987","123123"}
	(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ�
	   �ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ���������
	(3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵ�
	
	��ʾ��ѭ����ȡ�ַ�����ÿһ���ַ������αȽϵ�һ�������һ�����ڶ����͵����ڶ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"010","3223","666","7890987","123123"};
		method1(str);
	}
	/**�����ַ�������*/
	private static void method1(String[] str) {
		for (int i = 0; i < str.length; i++) {
			char[] ch=str[i].toCharArray();
			boolean flag=true;
			flag = traversal(ch, flag);
			print(str, i, flag);
		}
	}
	/**���*/
	private static void print(String[] str, int i, boolean flag) {
		if(flag){
			System.out.println(str[i]+"�ǶԳƵ�");
		}else{
			System.out.println(str[i]+"���ǶԳƵ�");
		}
	}
	/**�ж�*/
	private static boolean traversal(char[] ch, boolean flag) {
		for (int j = 0; j < ch.length/2; j++) {
			if(ch[j]!=ch[ch.length-1-j]){
				flag=false;
				break;
			}
		}
		return flag;
	}

}
