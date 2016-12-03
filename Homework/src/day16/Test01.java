package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test01 {

	/**
	 * 利用LinkedList构建一个栈结构 利用ArrayList构建一个栈结构
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack1 stack1 = new Stack1();
		stack1.in("利用LinkedList构建一个栈结构");
		System.out.println(stack1.out());
		Stack2 stack2=new Stack2();
		stack2.in("利用ArrayList构建一个栈结构");
		System.out.println(stack2.out());
	}

}

// 利用LinkedList构建一个栈结构
class Stack1 {
	private LinkedList list = new LinkedList();

	public void in(Object obj) {
		list.addLast(obj);
	}

	public Object out() {
		return list.removeLast();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}

//利用ArrayList构建一个栈结构
class Stack2{
	private ArrayList list =new ArrayList();
	
	public void in(Object obj){
		list.add(obj);
	}
	public Object out(){
		return list.remove(list.size()-1);
	}
}
