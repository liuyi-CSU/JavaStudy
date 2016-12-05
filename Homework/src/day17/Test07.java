package day17;

import java.util.Scanner;

public class Test07 {

	/**
	 * 我们想做一排砖（长度自己定），我们有一些小砖（每块1英寸）和大砖（每块5英寸），
如果用我们选择的砖块的数量能够拼接成功，则返回true；否则返回false，
		提示:
		方法调用 期望值 
		makeBricks(3,1,8) true 
		makeBricks(3,1,9) false 
		makeBricks(3,2,10) true 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入小砖块的数量min:");
		int min=sca.nextInt();
		System.out.println("请输入大砖块的数量max:");
		int max=sca.nextInt();
		System.out.println("请输入长度len:");
		int len=sca.nextInt();
		
		boolean bl=makeBricks(max,min,len);
		System.out.println(bl);
	}

	private static boolean makeBricks(int max, int min, int len) {
		// TODO Auto-generated method stub
		int x_max=len/5;//最多需要大砖块的个数;
		int x_min=len%5;//最少需要小砖块的个数;
		if(max*5+min<len)return false;
		if(max*5+min==len)return true;
		if(max>=x_max){
			if(min<x_min){
				return false;
			}else{
				return true;
			}
		}else{//因为max*5+min>len,所以在max<x_max时,剩余长度都由小砖块补齐.
			return true;
		}
	}

}
