package day24;

import java.util.Random;

public class Test02 {

	/**
	 * 模拟抢红包过程,生成50个红包(金额是随机的,范围在1-10元之间)
	   创建5个线程代表5个人,然后让这5个人去抢这50个红包,每次抢红包需要300ms的时间,
	   在控制台打印出(xxx抢了xxx元)(不限定每人抢的次数并且抢到红包后还可以接着抢,每次生成一个红包).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person("人物A").start();
		new Person("人物B").start();
		new Person("人物C").start();
		new Person("人物B").start();
		new Person("人物D").start();
	}

}

class Person extends Thread{
	private static int num=1;
	public Person(String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		Random rd=new Random();
		while(true){
		synchronized (Person.class) {
			if(num==51){
				break;
			}
				System.out.println(getName()+"抢了第"+num+"个红包,"+(rd.nextInt(10)+1)+"元");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				num++;
			}
		}
	}
}