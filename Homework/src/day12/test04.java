package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test04 {

	/**
	 *  ����ģ���¼,�����λ���,����ʾ���м��Ρ� (�û��������붼��admin)
		ʹ�� for ѭ���� while ѭ����ʵ��һ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("�������˺ź�����:");
		int n=3;
		n = byWhile(sca, n);
		//n = byFor(sca, n);
	}

	private static int byFor(Scanner sca, int n) {
		for(;n>0;n--){
			String str1=sca.nextLine();
			String str2=sca.nextLine();
			if("admin".equals(str1)&&"admin".equals(str2)){
				System.out.println("��¼�ɹ�!");
				break;
			}else{
				if((n-1)==0){
					System.out.println("�Բ���,�ѳ����������,����iphone��������12����!");
					break;
				}
				System.out.println("�˺Ż��������,����"+(n-1)+"�λ���");
			}
		}
		return n;
	}

	private static int byWhile(Scanner sca, int n) {
		while(n>0){
			String str1=sca.nextLine();
			String str2=sca.nextLine();
			if("admin".equals(str1)&&"admin".equals(str2)){
				System.out.println("��¼�ɹ�!");
				break;
			}else{
				if((n-1)==0){
					System.out.println("�Բ���,�ѳ����������,����iphone��������12����!");
					break;
				}
				System.out.println("�˺Ż��������,����"+(n-1)+"�λ���");
			}
			n--;
		}
		
		return n;
	}

}
