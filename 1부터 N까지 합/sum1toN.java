package BymeChallenge;

import java.util.Scanner;

public class sum1toN {
	public static void main(String[] args) {
		// 1부터 N까지에서 N입력
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 몇까지 더할래?");
		int endNum = sc.nextInt();
		
		// for문으로 총합구하기
		int total = 0;
		for (int i = 1; i < endNum + 1; i++) {
			total += i; // total = total + i
		}
		System.out.println(total);
	}
}
