package Review;
import java.util.Scanner;
/*������С��Ϸ, ��Ҫʹ�� Math.random()�����ķ���ֵ��0~0.9999999999 ֮���double��������.
 Ҫ��: ͨ��Math.random()�����������һ��1��100֮�������, Ȼ�����û�����һ����, ����¶���, �ͽ���. ���û�¶�, �ͼ�����.
 ��ʾ:
	1.ͨ��Math.random()�����������һ��1��100֮�������(��ѭ��������)
		��ʾ: ����1~100֮��������: (int)(Math.random()*100)+1
	2.��������¼�����(��ѭ��������)
	3.������ѭ��
	4.����ѭ���ڽ���¼�������
	5.�������������ȷ, �ͽ���ѭ��(break), ����͸�����ʾ, ����������

����: ������ɵ�����Ϊ63. 
      * ������¼��50ʱ, ��ʾ: С��. ������ѭ��
	  * ������¼��75ʱ, ��ʾ: ����. ������ѭ��
	  * ������¼��70ʱ, ��ʾ: ����. ������ѭ��
	  * ������¼��63ʱ, ��ʾ: ��ϲ���н���! ������ѭ��*/
public class MathRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Target=(int)(Math.random()*100)+1;
		System.out.println("���һ������:");
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		while(n!=Target){
			if(n>Target){
				System.out.println("����");
			}else{
				System.out.println("С��");
			}
			n=sca.nextInt();
		}
		System.out.println("�����:"+n);
	}

}
