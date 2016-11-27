package day12;
/**liuyi-CSU*/
public class test03 {

	/**
	 *  1.定义一个字符串引用s, 赋值为 "itheima"
		2.调用字符串中的方法,获取字符串的长度,并在控制台中输出结果
		3.调用字符串中的方法,获取字符串中'h'出现的位置,并在控制台中输出结果
		4.调用字符串中的方法,获取字符串中"ma"出现的位置,并在控制台中输出结果
		5.调用字符串中的方法,获取字符串中'i'最后出现的位置,并在控制台中输出结果
		6.调用字符串中的方法,获取字符串中从第二个位置到最后位置的内容,并在控制台中输出结果
		7.调用字符串中的方法,获取字符串中从第二个位置到第四个位置的内容,并在控制台中输出结果
		8.调用字符串中的方法,把字符串中的"hei"替换成"bai",并在控制台中输出结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="itheima";
		int len=s.length();
		int index_h=s.indexOf('h');
		int index_ma=s.indexOf("ma");
		int index_i=s.lastIndexOf('i');
		String s1=s.substring(1);
		String s2=s.substring(1, 3);
		String s3=s.replace("hei", "bai");
		System.out.println("获取字符串的长度:"+len+";字符串中'h'出现的位置:"+index_h+";字符串中\"ma\"出现的位置:"+index_ma+";'i'最后出现的位置:"+index_i);
		System.out.println("字符串中从第二个位置到最后位置的内容:"+s1+";字符串中从第二个位置到第四个位置的内容:"+s2+";把字符串中的\"hei\"替换成\"bai\":"+s3);
	}

}
