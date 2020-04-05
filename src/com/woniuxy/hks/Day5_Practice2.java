package com.woniuxy.hks;
public class Day5_Practice2 {
	public static void main(String[] args) {
		// 累乘法1*2+...*10
		int i=1,sum=1;
		while(i<=10) {
			sum=sum*i;
			i++;
		}
		System.out.println("乘积结果为："+sum);
	}
}
