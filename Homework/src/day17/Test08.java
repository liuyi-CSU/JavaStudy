package day17;

import java.util.Scanner;

public class Test08 {

	/**
	 * 定义一个方法makeChocolate, 我们要做一包规定质量的巧克力,有每个一公斤和每个五公斤的巧克力棒.
	 * 方法中有三个参数,第一个是小巧克力棒的个数,第二个是大巧克力棒的个数,第三个是规定的质量.
	 * 假设我们总在使用小巧克力棒之前使用大巧克力棒,返回需要使用多少个小巧克力棒才能完成规定的质量,如果不能则返回-1.
	 * 提示: 
	 * 方法调用 					期望值
	 * makeChocolate(4,5,9) 	4 
	 * makeChocolate(4,1,10) 	-1
	 * makeChocolate(4,1,7) 	2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入小巧克力的数量min:");
		int min=sca.nextInt();
		System.out.println("请输入大巧克力的数量max:");
		int max=sca.nextInt();
		System.out.println("请输入规定的质量len:");
		int len=sca.nextInt();
		
		int bl=makeBricks(max,min,len);
		System.out.println(bl);
	}
//总在使用小巧克力棒之前使用大巧克力棒,返回需要使用多少个小巧克力棒才能完成规定的质量,如果不能则返回-1.
	private static int makeBricks(int max, int min, int len) {
		// TODO Auto-generated method stub
		int x_max=len/5;//最多需要的大巧克力棒
		if((max>x_max?x_max:max)*5+min>=len){
			return len-x_max*5;
		}else{
			return -1;
		}
		
	}

}
