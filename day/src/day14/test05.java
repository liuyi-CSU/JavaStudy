package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test05 {

	/**
	 * 按指定格式输出日期时间
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创造一个日期类
		Date d=new Date();
		//创建格式化类
		SimpleDateFormat stf=new SimpleDateFormat("yyyy年MM月dd日:HH:mm:ss");
		//格式化
		String str=stf.format(d);
		System.out.println(str);
	}

}
