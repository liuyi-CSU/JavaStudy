package TEST100;

public class Test28 {

	/**
	 *  ������һ��������������catDog;

		�������ַ��������ж��ٸ�cat��dog���ֵĴ����Ƿ���ͬ��
		���cat��dog���ֵĴ�����ͬ�ͷ���true
		
		��ʾ:
		�������� 					����ֵ 
		catDog("catdog") 		true 
		catDog("catcat") 		false 
		catDog("1cat1cadodog") 	true 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(catDog("1cat1cadodog"));
	}
	public static boolean catDog(String str){
		return (getNum(str,"cat")==getNum(str,"dog"));
	}
	private static Object getNum(String string, String str) {
		// TODO Auto-generated method stub
		int index=0;
		int count=0;
		while(string.contains(str)){
				index=string.indexOf(str);
				count++;
				string=string.substring(index+str.length());
		}
		return count;
	}
}
