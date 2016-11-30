package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test04 {

	/**
	 * (1)通过键盘录入日期字符串，格式(2015-10-20) 
	 * (2)输出该日期是星期几及这一年的第几天
	 * (3)如输入：2015-10-20，输出"2015年-10月-20日是星期二，是2015年的第293 天"
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("请录入日期字符串:yyyy-MM-dd");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		String regex="\\d{4}-\\d{2}-\\d{2}";
//		String regex="[0-9]{4}-[0-9]{2}-[0-9]{2}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
//		System.out.println(str);
		while(!m.find()){
			System.out.println("请输入正确的日期格式:yyyy-MM-dd");
			str=sca.nextLine();
		}
		syso(str);
	}

	private static void syso(String str) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(str);
		
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		
		SimpleDateFormat sd=new SimpleDateFormat("yyyy年-MM月-dd日");
		String format = sd.format(date);
		
		System.out.println(format);
		int weekDay=instance.get(Calendar.DAY_OF_WEEK);
		String[] strWeekDay={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println(strWeekDay[weekDay-1]);
		System.out.println(instance.get(Calendar.DAY_OF_YEAR));
	}

}
