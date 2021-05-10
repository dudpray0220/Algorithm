package Challenge;

public class hanoiTower {
	public static void move(int from, int to) {
		// hanoi 메소드를 이용했을때 뭐라도 나와야 되잖냐
		System.out.println(from + "에서" + to + "로 이동");
	}

	public static void hanoi(int n, int from, int by, int to) { // n개의 탑을, 1째 단부터 -> 2째 단을 통해 -> 3째 단까지 이동
		if (n == 1) {
			move(from, to); // 1개는 어디 안거치고 그냥 이동가능
		} else {
			// 맨밑단 1개와, 나머지 블록으로 총 2개로 나눠서 생각
			hanoi(n - 1, from, to, by); // 맨 밑단 그 위 블록 이동
			move(from, to); 			// 맨 밑단 블록 이동
			hanoi(n - 1, by, from, to); // 첫 번째로 이동한 블록을 맨 밑단 위에 놓기
		}
	}

	public static void main(String[] args) {
		hanoi(4, 1, 2, 3);
	}
}
