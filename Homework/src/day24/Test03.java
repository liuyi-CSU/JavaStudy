package day24;

import java.util.Random;

public class Test03 {

	/**
	 * ĳ���ӵ��������,�ֿ�5������ģ������100������,ÿ��ÿ�������������1-5������,
   		�������һ�����Ӻ���ʾ�����������ꡱ(����ȫ������),�������.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new salaryBaoZi("1").start();
		new salaryBaoZi("2").start();
		new salaryBaoZi("3").start();
		new salaryBaoZi("4").start();
		new salaryBaoZi("5").start();
	}

}

class salaryBaoZi extends Thread{
	private static int num=100;
	public salaryBaoZi(String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num>0){
			synchronized (salaryBaoZi.class) {
				if(num==0){
					break;
				}
				Random rd=new Random();
				int n=rd.nextInt(5)+1;
				n=n<num?n:num;
				num=num-n;
				System.out.println(getName()+"��ʣ"+num+"������");
				if(num==0){
					System.out.println("����������");
					break;
				}
			}
		}
	}
}