package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021007 陳麒安
*/
import java.util.Scanner;
public class ex01_105021007 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);	
		System.out.print("華氏  =")	;	
		float 華氏=scn.nextFloat( );
		double 攝氏 =(華氏-32)*5/9;
		System.out.print("攝氏="+攝氏+"度");
	}

}
