package test01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test02 {

	/**
	 * 2.	���1~100֮�����������, ÿ5��һ����, д��num.txt��.(10��)
			��ʾ: �������1��, ��ֻ�ܱ�1���䱾����������Ľ�������. ����2,3,5,7,11��
	 * @throws Exception 
	 * @throws Exception 

	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=2;i<=100;i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		StringBuffer sb=new StringBuffer();
		for(int j=0;j<list.size();j++){
			if((j+1)/5==0){
				sb.append("\r\t");
			}else{
				sb.append(list.get(j));
			}
		}
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("num.txt"));
		bw.write(sb.toString());
		bw.close();
	}
	public static boolean isPrime(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
