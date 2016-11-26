package Review;
import java.util.Scanner;
/*猜数字小游戏, 需要使用 Math.random()方法的返回值是0~0.9999999999 之间的double类型数据.
 要求: 通过Math.random()方法随机生成一个1到100之间的整数, 然后由用户输入一个数, 如果猜对了, 就结束. 如果没猜对, 就继续猜.
 提示:
	1.通过Math.random()方法随机生成一个1到100之间的整数(在循环外设置)
		提示: 生成1~100之间的随机数: (int)(Math.random()*100)+1
	2.创建键盘录入对象(在循环外设置)
	3.定义死循环
	4.在死循环内接收录入的数据
	5.如果数据输入正确, 就结束循环(break), 否则就给出提示, 并继续输入

例如: 随机生成的数字为63. 
      * 当键盘录入50时, 提示: 小了. 并继续循环
	  * 当键盘录入75时, 提示: 大了. 并继续循环
	  * 当键盘录入70时, 提示: 大了. 并继续循环
	  * 当键盘录入63时, 提示: 恭喜您中奖了! 并结束循环*/
public class MathRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Target=(int)(Math.random()*100)+1;
		System.out.println("请猜一个数字:");
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		while(n!=Target){
			if(n>Target){
				System.out.println("大了");
			}else{
				System.out.println("小了");
			}
			n=sca.nextInt();
		}
		System.out.println("答对了:"+n);
	}

}
