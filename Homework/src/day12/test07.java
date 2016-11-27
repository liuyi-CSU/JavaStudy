package day12;
/**liuyi-CSU*/
public class test07 {

	/**
	 统计大串中小串出现的次数
	//定义大串
	//String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
	//定义小串
	//String min = "heima";
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义大串
		String max = "woaimeijun,meijunbutongyubaima,wulunmeijunhaiima,zhaodzaoma";
		//定义小串
		String min = "meijun";
		int count=0;
		int len=min.length();
		count = method(max, min, count, len);
		System.out.println("\"meijun\"字符串在大串中出现了"+count+"次.");
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
