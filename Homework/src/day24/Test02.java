package day24;

import java.util.Random;

public class Test02 {

	/**
	 * ģ�����������,����50�����(����������,��Χ��1-10Ԫ֮��)
	   ����5���̴߳���5����,Ȼ������5����ȥ����50�����,ÿ���������Ҫ300ms��ʱ��,
	   �ڿ���̨��ӡ��(xxx����xxxԪ)(���޶�ÿ�����Ĵ���������������󻹿��Խ�����,ÿ������һ�����).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person("����A").start();
		new Person("����B").start();
		new Person("����C").start();
		new Person("����B").start();
		new Person("����D").start();
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
				System.out.println(getName()+"���˵�"+num+"�����,"+(rd.nextInt(10)+1)+"Ԫ");
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