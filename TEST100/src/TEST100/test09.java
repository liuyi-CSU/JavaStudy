package TEST100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test09 {

	/**
	 * ����һ���ַ������������bob�ͷ���true ע�����bob�е��ַ�o,�������κ��ַ� 
	 * ����:bob����true, bpb����true
	 * 
	 * 
	 * ��ʾ: 
	 * �������� 				����ֵ 
	 * bobThere("abcbob") 	true 
	 * bobThere("b9b") 		true 
	 * bobThere("bac")		false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern compile = Pattern.compile("b.+b");
		Matcher matcher = compile.matcher("abcbob");
		System.out.println(matcher.find());
	}
}
/*
  	/ Ҫ��֤���ַ���
    String str = "service@xsoftlab.net";
    // ������֤����
    String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
    // ����������ʽ
    Pattern pattern = Pattern.compile(regEx);
    // ���Դ�Сд��д��
    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(str);
    // �ַ����Ƿ���������ʽ��ƥ��
    boolean rs = matcher.matches();
    System.out.println(rs);*/
