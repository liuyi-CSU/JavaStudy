package day12;
/**liuyi-CSU*/
import java.util.Scanner;

public class test04 {

	/**
	 *  需求：模拟登录,给三次机会,并提示还有几次。 (用户名和密码都是admin)
		使用 for 循环与 while 循环都实现一次
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入账号和密码:");
		int n=3;
		n = byWhile(sca, n);
		//n = byFor(sca, n);
	}

	private static int byFor(Scanner sca, int n) {
		for(;n>0;n--){
			String str1=sca.nextLine();
			String str2=sca.nextLine();
			if("admin".equals(str1)&&"admin".equals(str2)){
				System.out.println("登录成功!");
				break;
			}else{
				if((n-1)==0){
					System.out.println("对不起,已超过错误次数,您的iphone将被锁定12分钟!");
					break;
				}
				System.out.println("账号或密码错误,还有"+(n-1)+"次机会");
			}
		}
		return n;
	}

	private static int byWhile(Scanner sca, int n) {
		while(n>0){
			String str1=sca.nextLine();
			String str2=sca.nextLine();
			if("admin".equals(str1)&&"admin".equals(str2)){
				System.out.println("登录成功!");
				break;
			}else{
				if((n-1)==0){
					System.out.println("对不起,已超过错误次数,您的iphone将被锁定12分钟!");
					break;
				}
				System.out.println("账号或密码错误,还有"+(n-1)+"次机会");
			}
			n--;
		}
		
		return n;
	}

}
