package Challenge;
import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		// 자연수로 이루어진 배열이 2개 주어진다. 첫 번째 배열에서 순서를 변경하여 두 번째 배열을 만들 수 있는 경우 T를 출력하고 아닌 경우는
		// F를 출력하시오.
		// 즉, 내용물이 같으면 된다!

		// 입력처리
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 첫번째 배열의 크기
		boolean isSame = true; // 같은지 비교하기위한 boolean 변수선언

		int[] arr1 = new int[n]; // 배열선언
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) { // 먼저 1번 배열 생성
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) { // 그다음 2번 배열 생성
			arr2[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// 로직구현
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				isSame = true;
			} else {
				isSame = false;
				break;
			}
		}

		if (isSame) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}
}
