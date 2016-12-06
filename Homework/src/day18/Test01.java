package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test01 {

	/**
	 * 分析以下需求，并用代码实现:
	 * (1)利用键盘录入，输入一个字符串
	 * (2)统计该字符串中各个字符的数量
	 * (3)如： 用户输入字符串
	 * "If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
	 * 程序输出结果
	 * ：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串");
		Scanner sca = new Scanner(System.in);
		String str=sca.nextLine();
		HashMap<Character,Integer> hm= new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		System.out.println(print(hm));
	}

	private static <K, V> String print(HashMap<K, V> hm) {
		// TODO Auto-generated method stub
		Iterator<Entry<K,V>> i = hm.entrySet().iterator();
        if (! i.hasNext())
            return "";

        StringBuilder sb = new StringBuilder();
        for (;;) {
            Entry<K,V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            sb.append(key   == hm ? "(this Map)" : key);
            sb.append('(');
            sb.append(value == hm ? "(this Map)" : value);
            sb.append(')');
            if (! i.hasNext())
                return sb.toString();
        }
	}

}
