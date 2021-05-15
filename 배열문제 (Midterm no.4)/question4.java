package Reredo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input4.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열길이
		int m = sc.nextInt(); // 최대더하기 횟수
		int k = sc.nextInt(); // 한 숫자 최대 연속 더하기 횟수

		// 배열만들기
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 로직구현 5+5+4+5+5
		int first = arr[n - 1];
		int second = arr[n - 2];
		int sum = 0;
		int countK = k;

		for (int i = 0; i < m; i++) {
			if (countK == 0) {
				sum += second;
				countK = k;
			} else {
				sum += first;
				countK -= 1;
			}
		}
		System.out.println(sum);
	}
}
