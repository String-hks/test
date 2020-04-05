package com.woniuxy.hks;
public class Day5_Practice3 {
	public static void main(String[] args) {
		//计算100以内的偶数之和
		int i=1,sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum+=i;
				i++;
			}else {
				i++;
			}
		}
		System.out.println("乘积结果为："+sum);
	}
}
