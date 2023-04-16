package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 각에서 0도 초과 90도 미만은 예각, 90도는 직각,
		// 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
		// 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때
		// 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.

		int degrees = 60;

		System.out.println(solution(degrees));
	}

	public static int solution(int degrees) {

		if(0 < degrees && degrees < 90) {
			return 1;
		} else if(degrees == 90) {
			return 2;
		} else if(90 < degrees && degrees < 180) {
			return 3;
		} else if(degrees == 180) {
			return 4;
		} else {
			return 0;
		}
	}

}
