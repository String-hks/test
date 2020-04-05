package com.woniuxy.hks;

public class Day5_Practice4 {
	public static void main(String[] args) {
//		使用do-while实现：输出摄氏温度与华氏温度的对照表，
//		要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
//		转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32；
		int i = 0;
		double s=0;
		int count=1; 
		System.out.println("摄氏温度" + "\t" + "华氏温度");
		do {
			//如果i能被20整除。
			if (i % 20 == 0) {
				s = i * 9 / 5.0 + 32;
				System.out.println(i + "\t" + "\t" + s);
				i=i+20;count++;
			} else
				i++;
		} while ((i < 250)&&(count<=10));
	}
}
