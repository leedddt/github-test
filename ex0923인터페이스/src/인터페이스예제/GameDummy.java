package �������̽�����;

import java.util.Random;

public class GameDummy implements IGame {
	// �˰��� �����
	
	// ������ ������ �� �ڸ� ����, ����x
	private Random ran;
	private int num;
	private int num2;

	@Override
	public void makeRandom() {
		// ���� �����ϴ� ���
		ran = new Random();
		num = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		// ���� + ����2 =
		// String result = num + "+"+ num2 +"=";
		return num + "+" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int answer) {

		if (answer == num + num2) {
		// �Ű������� �޾ƿ� ���ڿ� ���� ���� + ����2 ��ġ
		// ����üũ�ϴ� ���
		// return num + num2 == answer ;
		// �񱳿����ڴ� ��������� boolean �ǵ����ش�
			return true;
		} else {
			return false;
		}
	}

}
