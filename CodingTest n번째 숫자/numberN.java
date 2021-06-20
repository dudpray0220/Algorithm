package wiseitec;

import java.util.*;

public class numberN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n번째 숫자
		String numbers = ""; // 빈 문자열 생성

		for (int i = 1; i <= n; i++) { // 문자열에 숫자 문자로 붙여서 쫙 넣어주기
			numbers += i;
		}
		char[] numbersChar = numbers.toCharArray(); // 문자열 numbers를 char배열로 쪼개줌. toCharArray를 쓰면 알아서 하나하나 쪼개서 넣어준다.

		System.out.println(Arrays.toString(numbersChar));
		System.out.println(numbersChar[n - 1]); // 배열의 인덱스이므로 n-1로 n번째 출력
	}
}
