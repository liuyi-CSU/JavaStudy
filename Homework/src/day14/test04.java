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
//		String regex="[0-9]{4}-[0-1][0-9]-[0-3][0-9]";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		while(!m.find()){
			System.out.println("请输入正确的日期格式:yyyy-MM-dd");
			str=sca.nextLine();
		}
		syso(str);
	}

	private static void syso(String str) throws ParseException {
		//SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类。它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(str);//解析字符串的文本，生成 Date
		
		Calendar instance = Calendar.getInstance();//getInstance():使用默认时区和语言环境获得一个日历
		instance.setTime(date);//setTime():使用给定的 Date 设置此 Calendar 的时间
		
//		SimpleDateFormat sd=new SimpleDateFormat("yyyy年-MM月-dd日");
//		String format = sd.format(date);
//		System.out.println(format);
		
		int weekDay=instance.get(Calendar.DAY_OF_WEEK);//DAY_OF_WEEK从1开始
		String[] strWeekDay={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println(strWeekDay[weekDay-1]);//星期几,需要减一,因为人家认为周日才是第一天
		System.out.println(instance.get(Calendar.DAY_OF_YEAR));
	}

}
