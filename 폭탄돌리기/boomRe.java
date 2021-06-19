package wiseitec;

import java.util.Arrays;

public class boomRe {
	public static void main(String[] args) {
		// 폭탄이 던져진 횟수를 구하라
		int n = 3; // 사람 수
		int m = 3; // 3번 받으면 폭탄 터짐
		int k = 2; // 왼, 오른쪽 2번째 있는 사람에게 패스

		int[] people = new int[n + 1]; // 폭탄을 받은 횟수의 배열 (n+1로 만들어야 계산하기 좋게 1부터 생각가능)
		people[1] = 1; // 처음엔 1번사람이 폭탄을 갖고 있다. (고정)
		System.out.println(Arrays.toString(people));

		int i = 1;
		while (true) {
			if (people[i] % 2 == 1) { // 홀수일 때
				if (i == 1) { // 1번 사람일때
					i += k; // 3
					people[i]++;
					if (people[i] == m) {
						break;
					}
				} else { // 1번 제외한 사람
					i -= 1;
					people[i]++;
					if (people[i] == m) {
						break;
					}
				}
			} else if (people[i] % 2 == 0) { // 짝수일 때
				if (i == n) { // 마지막 사람일때
					i -= k;
					people[i]++;
					if (people[i] == m) {
						break;
					}
				} else { // 마지막 제외한 사람
					i += 1;
					people[i]++;
					if (people[i] == m) {
						break;
					}
				}
			}
		}
		int sum = 0;
		for (int j = 1; i < people.length; i++) {
			sum += people[i];
		}
		System.out.println(sum-1); // 던져진 횟수를 구하므로 
	}
}
