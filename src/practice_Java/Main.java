package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 num1, num2가 매개변수로 주어질 때, 
		// num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
		int a = 1;
		int b = 2;
		
		solution(a, b);
		
		System.out.println(solution(a, b));
	}
public static int solution(int num1, int num2) {

	    return num1 / num2;
	}
	
}
