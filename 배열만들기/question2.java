package Reredo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input2.txt")); // 메모장파일 받아오기
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); // 문제에서 뭐 주어지면 그냥 무지성 변수입력 = 배열의 갯수

		// 배열만들기
		sc.nextLine(); // 엔터값 주기

		for (int i = 0; i < testCase; i++) { // 배열을 5개 만든다. i = 0, 1, 2, 3, 4
			String[] arr = sc.nextLine().split(" "); // 문자배열
			// 오름차순을 해야한다. 오름차순은 숫자여야 한다. 근데 지금 배열은 숫자냐? 지금은 String. 
			// 즉, 오름차순을 하려면 String배열을 -> int배열로 바꿔야 한다.
			int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); // 그냥 복붙. 문자배열 -> 숫자배열
			Arrays.sort(nums); // 오름차순
			//System.out.println(Arrays.toString(nums)); // 즉, 배열형식으로 출력을 하면 ㅈ된다.
			// 정답 : 배열의 값만 나오도록 한다. (띄어쓰기 없이)
			// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -> 12345678910
			// nums[0]=1, nums[1]=2
			// 배열의 길이 = 10
			
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[j]); // 이대로 print를 하면 일자로 쫙 나옴
			}
			System.out.println(); // 그냥 한 줄 띄기
		}
	}
}