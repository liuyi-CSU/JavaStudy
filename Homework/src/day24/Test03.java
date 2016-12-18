package day24;

import java.util.Random;

public class Test03 {

	/**
	 * 某包子店铺生意火爆,现开5个窗口模拟售卖100个包子,每次每个窗口随机卖出1-5个包子,
   		卖完最后一个包子后提示”包子已售完”(必须全部卖出),程序结束.
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
				System.out.println(getName()+"还剩"+num+"个包子");
				if(num==0){
					System.out.println("包子已卖完");
					break;
				}
			}
		}
	}
}