package Reredo;

import java.io.FileInputStream;
import java.util.Scanner;

public class question3 {
	public static void main(String[] args) throws Exception {
		// 입력처리
		System.setIn(new FileInputStream("src/input3.txt"));
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt(); // 2 행
		int column = sc.nextInt(); // 3 열

		// 2차원 배열 (배열 만드는 for문)
		int[][] arr = new int[rows+1][column+1]; // 배열 크기 선언 (1을 붙여라. Why? 우리는 (0,0)이 아니라 보기쉽게 (1,1)부터 만들었으니까)
		// 배열에 값 넣어야 한다.
		// (1, 1) = 2, (1, 2)=4, (1, 3) = 8 / (2, 1) = 10, (2, 2) = 12, (2, 3) = 14
		for (int i = 1; i <= rows; i++) { // 행
			for (int j = 1; j <= column; j++) { // 열
				arr[i][j] = sc.nextInt(); // 숫자를 받아와서 배열 완성
			}
		}

		// 문제푸는 for문
		int testCase = sc.nextInt(); // 3 문제갯수
		for (int i = 0; i < testCase; i++) {
			int x1 = sc.nextInt(); // 1
			int y1 = sc.nextInt(); // 1
			int rowSum = 0; // 행의 합 구하는 변수
			int columnSum = 0; // 열의 합 구하는 변수

			// 2차원배열일때 arr.length = 행의 길이 , arr[0].length = 열의길이
			// (1,1) 일때 행의 합 (1,1) + (2,1)
			// (1,2) 일때 행의 합 (1,2) + (2,2)
			// (2,2) 일때 행의 합 (2,2) + (1,2)
			for (int j = 0; j < arr.length; j++) {
				rowSum = rowSum + arr[j][y1];
			}
			
			// (1,1) 일때 열의 합 (1,1) + (1,2) + (1,3)
			// (1,2) 일때 열의 합 (1,2) + (1,1) + (1,3)
			// (2,2) 일때 열의 합 (2,2) + (2,3) + (2,1)
			for (int j = 0; j < arr[0].length; j++) {
				columnSum = columnSum + arr[x1][j];
			}
			System.out.println(rowSum + " " + columnSum);
		}
	}
}