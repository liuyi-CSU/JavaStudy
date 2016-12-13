package TEST100;

public class Test17 {

	/**
	 * 类中有一个方法，方法名seeColor;
	 * 
	 * 给定一个字符串，如果字符串以“red”或“blue”开头，则返回该颜色字符串，否则返回空字符串
	 * 
	 * 
	 * 提示: 
	 * 方法调用 					期望值 
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
