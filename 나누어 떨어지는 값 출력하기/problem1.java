package Challenge;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class problem1 {
	public static void main(String[] args) {
		// 주어진 배열의 각 원소를 divisor로 나누어 떨어지는 값을 오름차순으로 출력하는 프로그램을 작성하시오. divisor로 나누어 떨어지는
		// 원소가 하나도 없다면 -1을 출력하시오 (배열과 divisor는 모두 자연수)
		// 입력처리 (형식 D(자연수), 배열)
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); // divisor 입력
		int n = sc.nextInt(); // 배열의 길이
		int[] arr = new int[n]; // 배열 선언

		Set<Integer> answer = new TreeSet<Integer>(); // 나누어 떨어지는 값을 넣어줄 TreeSet 선언

		// 로직구현
		for (int i = 0; i < arr.length; i++) { // 배열에 값 넣어주기
			arr[i] = sc.nextInt();

			if (arr[i] % D == 0) { // 나누어 떨어지면 TreeSet에 추가한다.
				answer.add(arr[i]);
			} else {
				continue;
			}
		}

		// 출력 로직구현
		if (answer.size() == 0) {
			System.out.println(-1);
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>(answer); // Set -> ArrayList
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					System.out.println(list.get(i));
				} else {
					System.out.print(list.get(i) + ", ");
				}
			}
		}
	}
}
