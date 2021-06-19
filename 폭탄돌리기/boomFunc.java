package wiseitec;

import java.util.Arrays;

public class boomFunc {
	public static void main(String[] args) {
		System.out.println(solution(3, 3, 2));
	}

	public static int solution(int n, int m, int k) {
		int [] people = new int [n+1];
		people[1] = 1;
		
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
		return sum-1;
	}
}
