package Review;
/**�����������󣬲��ô���ʵ�֣�
	(1)���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.001��
	(2)���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�*/
public class ArrayReview {
	public static void main(String[] args){
		double Thick=0.001;
		int n=0;
		while(Thick<8848){
			Thick=Thick*2;
			n++;
		}
		System.out.println("�۵�"+n+"�Σ������۳����������ĸ߶�");
	}
}
