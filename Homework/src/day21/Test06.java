package day21;

import java.util.Scanner;

public class Test06 {

	/**
	 * 设计一个方法, 传入用户输入的一个小于10的正整数, 如果传入的整数不符合要求则返回-1. 将传入的整数的阶乘返回给调用者,
	 * 并在控制台输出.(如果返回-1则输出”对不起无法进行运算”)(14’) 比如: 用户输入5 那么调用方法后返回的是120. 则在控制台输出120.
	 * 用户输入12则返回-1, 则在控制台输出”对不起无法进行运算”
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个小于10的正整数:");
		Scanner sca=new Scanner(System.in);
		System.out.println(getNum(sca.nextInt()));
	}

	private static int getNum(int num) {
		// TODO Auto-generated method stub
		if(num>=10||num<=0){
			System.out.println("对不起无法进行运算");
			return -1;
		}else if(num==1){
			return 1;
		}else{
			return num*getNum(num-1);
		}
	}

}
