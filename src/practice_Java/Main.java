package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 num1과 num2가 매개변수로 주어집니다. 
		// 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println(solution(num1, num2));
	}
public static int solution(int num1, int num2) {
		
		if(num1 == num2) {
			return 1;
		} else {
			return -1;
		}
	
	}
	
}
