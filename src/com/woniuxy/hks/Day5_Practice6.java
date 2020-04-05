package com.woniuxy.hks;

import java.util.Scanner;

public class Day5_Practice6 {
	public static void main(String[] args) {
		//输入年份和月份和日期，判断是今年的第几天
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年份");
		int year = sc.nextInt();
		System.out.println("输入月份");
		int month = sc.nextInt();
		System.out.println("输入日期");
		int today = sc.nextInt();
		int i = 0;
		int day = 0;
		int days = 0;
		while ((month >= 1) && (month <= 12)) {
			if (i == (month-1)) {
				days=days+today;
				break;
			}
			i++;
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					day = 29;
				} else {
					day = 28;
				}
				break;
			default:
				day = 30;
				break;
			}
			days = days + day;
		}
		System.out.println("今天是今年的第" + days+"天。");
		sc.close();
	}
}
