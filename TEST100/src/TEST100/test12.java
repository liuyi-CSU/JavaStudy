package TEST100;

public class test12 {

	/**
	 * ������һ��������������countYZ;
	 * 
	 * ����һ���ַ������ҳ������ԡ�y�����ߡ�z����β�ĵ��ʵĸ�����Ҳ����˵��
	 * ���ڡ�y�����ߡ�z��������ַ�����Ӣ�ĵĵ��ʡ�
	 * ��y���ڡ�heavy���к͡�z���ڡ�fez���м���������y���ڡ�yellow���в��������������ִ�Сд��
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ 
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
			String[] str1=str.split("[^a-zA-Z]");//�и�
			for (int i = 0; i < str1.length; i++) {
				if(str1[i].endsWith("y")||str1[i].endsWith("z")||str1[i].endsWith("Y")||str1[i].endsWith("Z")){
					count++;
				}
			}
		}
		return count;
	}

}
