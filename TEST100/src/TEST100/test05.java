package TEST100;

public class test05 {

	/**
	 * ����һ���ַ�������������, ���ַ��������n���ַ��ظ�n��,���س���. n�ķ�ΧӦ����0���ַ�������֮��.
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ
	 * repeatEnd("Hello",3) 	"llollollo" 
	 * repeatEnd("Hello",2) 	"lolo"
	 * repeatEnd("Hello",1) 	"o"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		int n=3;
		repeatEnd(str, n);
	}

	private static void repeatEnd(String str, int n) {
		if(str.length()<n||n<0){
			System.out.println("n�ķ�ΧӦ����0��"+str.length()+"֮��");
		}
		String str1=str.substring(str.length()-n, str.length());
		for(int i=0;i<str1.length();i++){
			System.out.print(str1);
		}
	}

}
