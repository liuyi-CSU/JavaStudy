package day21;

public class Test03 {

	/**
	 *当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,模拟试用版软件,
  试用10次机会,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
	 * 分析:
	 * 1,创建带缓冲的输入流对象,因为要使用readLine方法,可以保证数据的原样性
	 * 2,将读到的字符串转换为int数
	 * 3,对int数进行判断,如果大于0,就将其--写回去,如果不大于0,就提示请购买正版
	 * 4,在if判断中要将--的结果打印,并将结果通过输出流写到文件上
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
