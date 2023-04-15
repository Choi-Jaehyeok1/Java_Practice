package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 
		// return하도록 soltuion 함수를 완성해주세요.
		
		int a = 1;
		int b = 2;
		
		solution(a, b);
		
		System.out.println(solution(a, b));
	}
public static int solution(int num1, int num2) {

	    return num1 - num2;
	}
	
}
