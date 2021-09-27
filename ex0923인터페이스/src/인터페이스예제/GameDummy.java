package 인터페이스예제;

import java.util.Random;

public class GameDummy implements IGame {
	// 알고리즘 담당자
	
	// 숫자의 단위는 한 자리 숫자, 음수x
	private Random ran;
	private int num;
	private int num2;

	@Override
	public void makeRandom() {
		// 난수 생성하는 기능
		ran = new Random();
		num = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		// 난수 + 난수2 =
		// String result = num + "+"+ num2 +"=";
		return num + "+" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int answer) {

		if (answer == num + num2) {
		// 매개변수로 받아온 숫자와 실제 난수 + 난수2 일치
		// 정답체크하는 기능
		// return num + num2 == answer ;
		// 비교연산자는 결과값으로 boolean 되돌려준다
			return true;
		} else {
			return false;
		}
	}

}
