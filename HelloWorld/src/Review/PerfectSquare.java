package Review;

public class PerfectSquare {

	/**
	存在一个整数(10万以内的正整数)，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(!isSquare(i+100)||!isSquare(i+268)){
			i++;
		}
		System.out.println("改數是:"+i);
	}
	public static boolean isSquare(int n){
		boolean flag=false;
		for(int i=0;i<n/2;i++){
			if((int)(Math.sqrt(n))==Math.sqrt(n)){
				flag=true;
				break;
			}
		}
		return flag;
	}

}
