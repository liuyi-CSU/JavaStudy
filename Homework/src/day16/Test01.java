package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test01 {

	/**
	 * ����LinkedList����һ��ջ�ṹ ����ArrayList����һ��ջ�ṹ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack1 stack1 = new Stack1();
		stack1.in("����LinkedList����һ��ջ�ṹ");
		System.out.println(stack1.out());
		Stack2 stack2=new Stack2();
		stack2.in("����ArrayList����һ��ջ�ṹ");
		System.out.println(stack2.out());
	}

}

// ����LinkedList����һ��ջ�ṹ
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

//����ArrayList����һ��ջ�ṹ
class Stack2{
	private ArrayList list =new ArrayList();
	
	public void in(Object obj){
		list.add(obj);
	}
	public Object out(){
		return list.remove(list.size()-1);
	}
}
