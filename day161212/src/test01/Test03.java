package test01;

import java.util.HashMap;
import java.util.Scanner;

import com.bean.Robot;

public class Test03 {

	/**
	 * 
	 	ģ��һ�����������˶Ի����龰(12��) 
	 	����һ����������(Robot), ������״̬(String��,Ĭ���ǹر�)��
	 	����(HashMap<String,String>)��������. 
	 * a. ��ӻ���(�����µĻ����ֱ���ӵ�Map��) 
	 * b. �����û��ڿ���̨�����ָ��, ��ӡ����Ӧ�Ļ���. ����û������ָ��û�ж�Ӧ��Ӧ��, ����ʾ���Բ���, �Ҳ�֪����ô�ش�, �뻻���������ҡ�
	 * ֱ���û�˵�ݰ�, ����Ӧ��ݰݺ�ſ���ֹͣ����¼��(����¼��ǰ��Ҫ��鵱ǰ�����˵�״̬, ���Ϊ�ر�, �򽫻�����״̬��Ϊ��,
	 * ���ܲ���״̬��ֱ���޸ĵ�ǰ״̬)
	 * c. �����Ϻͻ��������еĶԻ����ݴ��뵽��ǰ��Ŀinfo.txt�� д���ʽ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<>();
		hm.put("���", "���");
		hm.put("������������", "�������������������");
		hm.put("����û", "��û����");
		Robot robot=new Robot("close",hm);
		if("close".equals(robot.getState())){
			robot.setState("open");
		}
		System.out.println("����Ի�");
		Scanner sca=new Scanner(System.in);
		while(true){
			String string=sca.nextLine();
			if("�ݰ�".equals(string)){
				System.out.println(hm.get("�ݰ�"));
			}
			if(hm.containsKey(string)){
				
			}
		}
	}
}
