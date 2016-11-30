package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test06 {

	/**
	 * @throws ParseException 
	 * 判断输入年份是否为闰年
	 * @throws  
	 */
	public static void main(String[] args) throws ParseException   {
		// TODO Auto-generated method stub
		System.out.println("请输入年份:");
		Scanner sca=new Scanner(System.in);
		String str=sca.nextLine();
		int year=Integer.parseInt(str);
		boolean b=getYear(year);
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH)==29;
	}

}
