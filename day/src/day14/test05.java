package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test05 {

	/**
	 * ��ָ����ʽ�������ʱ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��������
		Date d=new Date();
		//������ʽ����
		SimpleDateFormat stf=new SimpleDateFormat("yyyy��MM��dd��:HH:mm:ss");
		//��ʽ��
		String str=stf.format(d);
		System.out.println(str);
	}

}
