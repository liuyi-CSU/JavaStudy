package Review;

public class day11Test05 {

	/**
		1)定义一个抽象类Payment, 该类有一个抽象方法pay,接收double类型数据,返回值为double类型
		2) 定义两个类AliPay与Cash, 分别继承Payment, AliPay对接受金额随机打5到8折,Cash则需要全额支付
		3) 定义一个Person类,拥有静态方法buy,
							通过键盘录入的方式, 
		   接收一个 String 类型数据(代表付款方式)与一个 double 类型数据(代表钱),判断支付方式.
		   若传入AliPay,则使用支付宝支付,输入Cash, 则使用现金支付,并将金额返回.
		4) 在测试类中测试.
		
		以下为示例:
			请输入付款方式:
			AliPay
			请输入付款金额:
			35
			输出:
				欢迎使用支付宝付款
				恭喜您打6折
				最后付款金额:21.0
			
			请输入付款方式:
			Cash
			请输入付款金额:
			35
			输出:
				欢迎使用现金付款
				最后付款金额:35.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Payment{
	public abstract double pay(double n);
}

class AliPay extends Payment{
	public double pay(double n){
		double rate=0.0;
		while(true){
			rate=(int)Math.random();
			if(rate>=5&&rate<=8){
				return n*rate;
			}
		}
	}
}

class Cash extends Payment{
	public double pay(double n){
		return n;
	}
}


