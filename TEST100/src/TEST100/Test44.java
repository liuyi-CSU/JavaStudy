package TEST100;

public class Test44 {

	/**
	 *������һ��������������sumDigits;

		  ����һ���ַ����������ַ����а����ĵ������ֵ�֮�ͣ���������������򷵻�0��
		����������ַ���ֻ����һ�����֣���ҪInteger.parseInt(string)����ת��Ϊint����
		
		��ʾ:
		�������� 					����ֵ 
		sumDigits("aa1bc2d3") 	6 
		sumDigits("aa11b33") 	8 
		sumDigits("Chocolate") 	0 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits("aa1bc2d3"));
		System.out.println(sumDigits("aa11b33"));
		System.out.println(sumDigits("Chocolate"));
	}

	private static int sumDigits(String string) {
		// TODO Auto-generated method stub
		char[] ch=string.toCharArray();
		int num=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9'){
				num+=Integer.parseInt(ch[i]+"");
			}
		}
		return num;
	}

}
