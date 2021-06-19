package wiseitec;

import java.util.Arrays;
import java.util.Scanner;

public class cakeFunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ages 배열길이
		int [] ages = new int [n];
		for (int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}
		System.out.println(solution(ages));
	}

	
	
	public static int solution(int [] ages) {
		int[] candle = new int[10]; // 케이크 초 0 ~ 9 까지의 배열 
		int[] arr = new int[10]; // 필요한 초 카운드하기위한 배열

		for (int i = 0; i < candle.length; i++) {
			candle[i] = i;
		}

		for (int i = 0; i < ages.length; i++) { // 23, 61, 46   /   44, 33, 69, 62
			for (int j = 0; j < candle.length; j++) { // 0 ~ 9
				if (ages[i] % 10 == candle[j]) { // 먼저 일의자리 확인
					if (ages[i] % 10 == 6 || ages[i] % 10 == 9) { // 6 또는 9일때 arr[6] 과 arr[9]를 비교하여 작은데에 넣어줌 -> 최소세트
						if (arr[6] <= arr[9]) {
							arr[6]++;
						} else if (arr[6] > arr[9]) {
							arr[9]++;
						}
					} else {
						arr[j]++;
					}
				}
				if (ages[i] / 10 == candle[j]) { // 십의 자리 확인
					if (ages[i] / 10 == 6 || ages[i] / 10 == 9) {
						if (arr[6] <= arr[9]) {
							arr[6]++;
						} else if (arr[6] > arr[9]) {
							arr[9]++;
						}
					} else {
						arr[j]++;
					}
				}
			}
		}
		Arrays.sort(arr); // 오름차순 정렬
		return arr[arr.length - 1]; // 케이크 초의 최소세트 출력 (최댓값이긴 하지만)
	}
}
