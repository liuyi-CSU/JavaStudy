package test01;

import java.util.HashMap;
import java.util.Scanner;

import com.bean.Robot;

public class Test03 {

	/**
	 * 
	 	模拟一个机器人与人对话的情景(12’) 
	 	创建一个机器人类(Robot), 该类有状态(String型,默认是关闭)和
	 	话术(HashMap<String,String>)两个属性. 
	 * a. 添加话术(将以下的话术分别添加到Map中) 
	 * b. 根据用户在控制台输入的指令, 打印出对应的话术. 如果用户输入的指令没有对应的应答, 则提示”对不起, 我不知道怎么回答, 请换个问题问我”
	 * 直到用户说拜拜, 并且应答拜拜后才可以停止键盘录入(键盘录入前需要检查当前机器人的状态, 如果为关闭, 则将机器人状态改为打开,
	 * 不能不做状态就直接修改当前状态)
	 * c. 将以上和机器人所有的对话内容存入到当前项目info.txt中 写入格式如下
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<>();
		hm.put("你好", "你好");
		hm.put("今天天气怎样", "今天深圳天气晴空万里");
		hm.put("吃了没", "还没吃呢");
		Robot robot=new Robot("close",hm);
		if("close".equals(robot.getState())){
			robot.setState("open");
		}
		System.out.println("输入对话");
		Scanner sca=new Scanner(System.in);
		while(true){
			String string=sca.nextLine();
			if("拜拜".equals(string)){
				System.out.println(hm.get("拜拜"));
			}
			if(hm.containsKey(string)){
				
			}
		}
	}
}
