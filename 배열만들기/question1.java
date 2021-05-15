package Reredo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class question1 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input1.txt"));
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); // 3
		int count;

		// 배열만들기 1번째 방법 nextLine()
		sc.nextLine(); // 엔터값 nextLine()은 다음열을 가져오는데 타입은 String
//		for (int i = 0; i < testCase; i++) { // 0, 1, 2 총 3개 배열완성
//			count = 0; // 갯수를 다시 세라. (안하면 1, 3, 4) (하면 1, 2, 1)
//			String[] arr = sc.nextLine().split(""); // [C, *, D, A] arr[0] = C, arr[1] = *, arr[2] = D, arr[3] = A
//			// arr.length = 4
//			
//			for (int j =0; j < arr.length; j++) {
//				if (arr[j].equals("A")) { // 문자(String) 비교이므로 equals
//					count ++; // count = count + 1 -> count = 1
//				}
//			}
//			System.out.println(count);
//		}
		
		// 배열만들기 2번째 방법 String.toCharArray (교수님방법)
		for (int i = 0; i < testCase; i++) { // 0, 1, 2 총 3개 배열완성
			count = 0;
			char[] arr = sc.nextLine().toCharArray(); // 문자열.toCharArray(); 그냥 만사 OK. char는 int도 String도 아니다.
			System.out.println(Arrays.toString(arr));
			
			for (int j = 0; j < arr.length; j++) { 
				if (arr[j] == 'A') { //  "A"는 문자로 비교시 .equals( )를 써야하지만, 'A'는 아스키코드문자이므로 == 로 비교가능!
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}
