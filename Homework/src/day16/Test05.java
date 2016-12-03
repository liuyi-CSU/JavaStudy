package day16;

import java.util.ArrayList;

public class Test05 {

	/**
	 * 有100个人围成一个圈，从1开始报数，报到14的这个人就要退出。
	 * 然后其他人重新开始，从1报数，到14退出。问：最后剩下的是100人中的
	 * 第几个人？
		提示:使用ArrayList
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			method(100);
	}

	private static void method(int num) {
		int n= 0;
		int index=0;
		ArrayList list=new ArrayList();
		for (int i = 0; i <num; i++) {
			list.add(i+1);
		}
		while(list.size()!=1){
			if((n+1)%14==0){
				list.remove(index);
				index--;
			}
			n++;
			index++;
			if(index==list.size()){
				index=0;
				continue;
			}  
		}
		System.out.println(list);
	}

}
