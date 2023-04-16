package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 n이 주어질 때, n이하의 짝수를 모두 
		// 더한 값을 return 하도록 solution 함수를 작성해주세요.

		int num = 10;

		System.out.println(solution(num));
	}

	public static int solution(int num) {
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				sum = sum +i;
			}
		}
		return sum;
	}

}
