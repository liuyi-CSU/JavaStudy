package TEST100;

public abstract class test11 {

	/**
	 * ����ַ����еġ�g����������߻����ұ�������һ����g������g��������ַ�������happy�ģ�
	 * ����ַ��������еġ�g������happy���򷵻�true�����򷵻�false��
	 * 
	 * ��ʾ: 
	 *  �������� 				����ֵ
	 *  gHappy("xxggxx") 	true 
	 *  gHappy("xxgxx") 	false
	 *  gHappy("xxggyygxx") false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxggyyxgx";
		System.out.println(gHappy(str));
	}

	private static boolean gHappy(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]=='g'){
				if(ch[i+1]=='g'){
					i++;
				}else{
					return false;
				}
			}
		}
		return true;
	}

}
