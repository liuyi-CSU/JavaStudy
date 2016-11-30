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
	 * (1)ͨ������¼�������ַ�������ʽ(2015-10-20) 
	 * (2)��������������ڼ�����һ��ĵڼ���
	 * (3)�����룺2015-10-20�����"2015��-10��-20�������ڶ�����2015��ĵ�293 ��"
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("��¼�������ַ���:yyyy-MM-dd");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		String regex="\\d{4}-\\d{2}-\\d{2}";
//		String regex="[0-9]{4}-[0-9]{2}-[0-9]{2}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
//		System.out.println(str);
		while(!m.find()){
			System.out.println("��������ȷ�����ڸ�ʽ:yyyy-MM-dd");
			str=sca.nextLine();
		}
		syso(str);
	}

	private static void syso(String str) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(str);
		
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		
		SimpleDateFormat sd=new SimpleDateFormat("yyyy��-MM��-dd��");
		String format = sd.format(date);
		
		System.out.println(format);
		int weekDay=instance.get(Calendar.DAY_OF_WEEK);
		String[] strWeekDay={"������","����һ","���ڶ�","������","������","������","������"};
		System.out.println(strWeekDay[weekDay-1]);
		System.out.println(instance.get(Calendar.DAY_OF_YEAR));
	}

}
