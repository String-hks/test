package com.woniuxy.hks;

import java.util.Scanner;

public class Day5_Practice8 {
	public static void main(String[] args) {
		//猜一猜
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个价格");
		int price;
		int random = (int) (Math.random() * 200);
//		System.out.println(random);
		do {
			price=sc.nextInt();
			if (price>random) 
				System.out.println("高了");
			if(price<random)
				System.out.println("低了");
		}while(price!=random);
		System.out.println("对了");
		sc.close();
	}
}
