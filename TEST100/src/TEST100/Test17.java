package TEST100;

public class Test17 {

	/**
	 * ������һ��������������seeColor;
	 * 
	 * ����һ���ַ���������ַ����ԡ�red����blue����ͷ���򷵻ظ���ɫ�ַ��������򷵻ؿ��ַ���
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 					����ֵ 
	 * seeColor("redxx") 		"red" 
	 * seeColor("xxred") 		""
	 * seeColor("blueTimes")	"blue"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(seeColor("blueTimes"));
	}
	public static String seeColor(String str){
		if(str.startsWith("red")){
			return "red";
		}else if(str.startsWith("blue")){
			return "blue";
		}else{
			return "";
		}
	}

}
