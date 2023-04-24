package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 배열 numbers가 매개변수로 주어집니다.
		// numbers의 원소 중 두 개를 곱해 만들 수 있는
		// 최댓값을 return하도록 solution 함수를 완성해주세요.

		int[] numbers = { 1, 2, 3, 5, 5 };
		int return_number = solution(numbers);
		System.out.println(return_number);

	}

	public static int solution(int[] numbers) {

		int first = 0;
		int second = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > first) {
				first = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > second && numbers[i] != first) {
				second = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (first == numbers[i]) {
				count++;
			}
		}

		if (count > 1) {
			second = first;
		}

		return first * second;

	}

}
