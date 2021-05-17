package Challenge;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class MatchParentheses {
   public static void main(String[] args) throws Exception {
      // 입력처리
      System.setIn(new FileInputStream("src/sample_input.txt"));
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      int firstNum; // 몇 번째 괄호인지 입력을 위한 변수선언
      int count = 0; // 괄호 짝 계산을 위한 변수선언
      int answer = 0; // 답 출력을 위한 변수선언

      // 배열만들기
      for (int i = 0; i < testCase; i++) {
         firstNum = sc.nextInt(); // 3
         char[] arr = sc.next().toCharArray();

         // 로직구현
         if (arr[firstNum - 1] == '(') { // 처음에 (면 뒤에만 보면 됨
            for (int j = firstNum - 1; j < arr.length; j++) {
               if (arr[j] == '(') {
                  count += 1;
               } else if (arr[j] == ')') {
                  count -= 1;
                  if (count == 0) {
                     answer = j + 1;
                     break;
                  }
               } else {
                  answer = 0;
               }
            }
         } else if (arr[firstNum - 1] == ')') { // 처음에 )면 앞에만 보면 됨
            for (int j = firstNum - 1; j >= 0; j--) {
               if (arr[j] == '(') {
                  count -= 1;
                  if (count == 0) {
                     answer = j + 1;
                     break;
                  }
               } else if (arr[j] == ')') {
                  count += 1;
               } else {
                  answer = 0;
               }
            }
         }
         System.out.println("#" + (i + 1) + " " + answer);
         count = 0;
         answer = 0;
      }
   }
}