package day24;

public class Test01 {

	/**
	 * 1. 
	 * 1) ģ��3����ʦͬʱ��80�ݱʼ�, ÿ����ʦ�൱��һ���߳�, �ֱ�������߳�
	 * ����Ϊ������ʦ�߳�,����ʦ�߳�,����ʦ�̡߳�,
	 * Ҫ���ڿ���̨���"xxx��ʦ"�ڷ���"xxx"�ݱʼ� 
	 * 2) ���Ҫ�����һ���Ծ�����ɡ�����ʦ�̡߳�����,����Ӧ����ô��?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new teacherThread("1").start();
		new teacherThread("2").start();
		new teacherThread("3").start();
	}

}

class teacherThread extends Thread{
	private static int num=80;
	public teacherThread(String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (teacherThread.class) {
				
				if(num==0)break;
				System.out.println(getName()+"��ʦ�ڷ���"+num+"���Ծ�");
				num--;
			}
		}
	}
}