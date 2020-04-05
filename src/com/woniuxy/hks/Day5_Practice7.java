package com.woniuxy.hks;
public class Day5_Practice7 {
	public static void main(String[] args) {
		//1~10之间的整数相加，得到累加值大于20的当前数
		int i=0;int sum=0;
		while(sum<=20) {
			sum=sum+i;
			i++;if(i>10)break;
		}System.out.println("当前值为："+sum);
	}
}
