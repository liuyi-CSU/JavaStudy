package day12;
/**liuyi-CSU*/
public class test08 {

	/**
	 分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
	   第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	
	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"010","3223","666","7890987","123123"};
		method1(str);
	}
	/**遍历字符串数组*/
	private static void method1(String[] str) {
		for (int i = 0; i < str.length; i++) {
			char[] ch=str[i].toCharArray();
			boolean flag=true;
			flag = traversal(ch, flag);
			print(str, i, flag);
		}
	}
	/**输出*/
	private static void print(String[] str, int i, boolean flag) {
		if(flag){
			System.out.println(str[i]+"是对称的");
		}else{
			System.out.println(str[i]+"不是对称的");
		}
	}
	/**判断*/
	private static boolean traversal(char[] ch, boolean flag) {
		for (int j = 0; j < ch.length/2; j++) {
			if(ch[j]!=ch[ch.length-1-j]){
				flag=false;
				break;
			}
		}
		return flag;
	}

}
