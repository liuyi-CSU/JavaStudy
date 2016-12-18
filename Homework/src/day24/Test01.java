package day24;

public class Test01 {

	/**
	 * 1. 
	 * 1) 模拟3个老师同时发80份笔记, 每个老师相当于一个线程, 分别给三个线程
	 * 命名为”张老师线程,林老师线程,李老师线程”,
	 * 要求在控制台输出"xxx老师"在发第"xxx"份笔记 
	 * 2) 如果要求最后一张试卷必须由”李老师线程”发出,请问应该怎么做?
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
				System.out.println(getName()+"老师在发第"+num+"份试卷");
				num--;
			}
		}
	}
}