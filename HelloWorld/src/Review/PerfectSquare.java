package Review;

public class PerfectSquare {

	/**
	����һ������(10�����ڵ�������)��������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(!isSquare(i+100)||!isSquare(i+268)){
			i++;
		}
		System.out.println("�Ĕ���:"+i);
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
