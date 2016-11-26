package Review;
/**分析以下需求，并用代码实现：
	(1)珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.001米
	(2)请问，我折叠多少次，可以折成珠穆朗玛峰的高度。*/
public class ArrayReview {
	public static void main(String[] args){
		double Thick=0.001;
		int n=0;
		while(Thick<8848){
			Thick=Thick*2;
			n++;
		}
		System.out.println("折叠"+n+"次，可以折成珠穆朗玛峰的高度");
	}
}
