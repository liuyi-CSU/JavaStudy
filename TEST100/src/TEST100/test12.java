package TEST100;

public class test12 {

	/**
	 * 类中有一个方法，方法名countYZ;
	 * 
	 * 给定一个字符串，找出里面以“y”或者“z”结尾的单词的个数，也就是说，
	 * 跟在“y”或者“z”后面的字符不是英文的单词。
	 * “y”在“heavy”中和“z”在“fez”中计数，而“y”在“yellow”中不计数，（不区分大小写）
	 * 
	 * 提示: 
	 * 方法调用 					期望值 
	 * countYZ("fez day") 		2 
	 * countYZ("day fez") 		2
	 * countYZ("day fyyyz") 	2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="day fez";
		System.out.println(countYZ(str));
	}
	public static int countYZ(String str){
		int count=0;
		if(str.length()==0){
			count=0;
		}else if(str.length()==1){
			if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("z")){
				return count=1;
			}
		}else{
			String[] str1=str.split("[^a-zA-Z]");//切割
			for (int i = 0; i < str1.length; i++) {
				if(str1[i].endsWith("y")||str1[i].endsWith("z")||str1[i].endsWith("Y")||str1[i].endsWith("Z")){
					count++;
				}
			}
		}
		return count;
	}

}
