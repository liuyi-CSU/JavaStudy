package Review;

public class day11Test05 {

	/**
		1)����һ��������Payment, ������һ�����󷽷�pay,����double��������,����ֵΪdouble����
		2) ����������AliPay��Cash, �ֱ�̳�Payment, AliPay�Խ��ܽ�������5��8��,Cash����Ҫȫ��֧��
		3) ����һ��Person��,ӵ�о�̬����buy,
							ͨ������¼��ķ�ʽ, 
		   ����һ�� String ��������(�����ʽ)��һ�� double ��������(����Ǯ),�ж�֧����ʽ.
		   ������AliPay,��ʹ��֧����֧��,����Cash, ��ʹ���ֽ�֧��,��������.
		4) �ڲ������в���.
		
		����Ϊʾ��:
			�����븶�ʽ:
			AliPay
			�����븶����:
			35
			���:
				��ӭʹ��֧��������
				��ϲ����6��
				��󸶿���:21.0
			
			�����븶�ʽ:
			Cash
			�����븶����:
			35
			���:
				��ӭʹ���ֽ𸶿�
				��󸶿���:35.0
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


