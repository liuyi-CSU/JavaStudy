package TEST100;

public class Test55_startOz {

	/**
	 * ������һ��������������startOz;
	  ����һ���ַ���������һ����ǰ2���ַ���ɵ��ַ����������������'o'��
	�������һ���ַ����������'z'��������ڶ����ַ������ԡ�ozymandias��������oz����
	��ʾ:
	��������					����ֵ
	startOz("ozymandias")	"oz"
	startOz("bzoo")			"z"
	startOz("oxx")			"o"

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
	}
	public static String startOz(String str){
		if(str.length()>2){
			if(str.substring(0, 2).contains("z")&&str.substring(0, 2).contains("o")){
				return str.substring(0, 2);
			}else if(str.substring(0, 2).contains("z")){
				return str.substring(1, 2);
			}else if(str.substring(0, 2).contains("o")){
				return str.substring(0, 1);
			}else{
				return "";
			}
		}else{
			return str;
		}
			
	}

}
