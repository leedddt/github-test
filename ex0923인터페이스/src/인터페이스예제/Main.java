package 인터페이스예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입출력 담당
		// 정답횟수 체크, 5문제를 제시할 수 있게끔 로직!

		 GameDummy p1 = new GameDummy(); // ---> 임시 테스트용도!
		//PlusGame p1 = new PlusGame();

		int count = 0; // 정답의 개수를 체크하는 역할!

		// 1. 총 5문제를 제시
		for (int i = 0; i < 5; i++) {
			// 2. 난수 생성하는 기능
			p1.makeRandom();

			// 3. 문제 출력
			for (int j = 0; j < 3; j++) {
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. 한 문제당 정답을 맞출 수 있는 기회는 3번
				if (p1.checkAnswer(answer)) {
					// 정답을 맞췄다!
					count++;
					break;
				} else {
					// 정답을 맞추지 못했다!
					System.out.println("오답입니다~^_^");
				}

			}
			// 5. 맞은 정답의 횟수를 출력
			System.out.println("정답의 개수는 " + count + "개 입니다");

		}
	}

}
