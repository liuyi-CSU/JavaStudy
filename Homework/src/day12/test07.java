package day12;
/**liuyi-CSU*/
public class test07 {

	/**
	 ͳ�ƴ���С�����ֵĴ���
	//�����
	//String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
	//����С��
	//String min = "heima";
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����
		String max = "woaimeijun,meijunbutongyubaima,wulunmeijunhaiima,zhaodzaoma";
		//����С��
		String min = "meijun";
		int count=0;
		int len=min.length();
		count = method(max, min, count, len);
		System.out.println("\"meijun\"�ַ����ڴ��г�����"+count+"��.");
	}

	private static int method(String max, String min, int count, int len) {
		while(max.contains(min)){
			count++;
			int index=max.indexOf(min);	
			max=max.substring(index+len);
		}
		return count;
	}

}
