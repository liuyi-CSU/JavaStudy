package day13;

public class test04 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)打印由7，8，9三个数组组成的三位数，要求该三位数中任意两位数字不能相同
	(2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987
	提示: 考虑使用for循环的嵌套
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={7,8,9};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(i==j)continue;
				for (int j2 = 0; j2 < num.length; j2++) {
					if(i==j2||j==j2)continue;
					System.out.print(num[i]);
					System.out.print(num[j]);
					System.out.print(num[j2]+" ");
				}
			}
			
		}
	}

}
