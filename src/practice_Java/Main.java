package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 
		// 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println(solution(num1, num2));
	}
public static int solution(int num1, int num2) {
	
    int answer = (num1*1000 / num2);
    return answer;	// num1에 1000을 곱해줌에 따라 나중에 곱하는 값과 정수 값이 다르다.
	}
	
}
