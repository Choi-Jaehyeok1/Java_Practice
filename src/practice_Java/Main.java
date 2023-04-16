package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 배열 numbers가 매개변수로 주어집니다. 
		// numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

		// numbers_len은 배열 numbers의 길이입니다.
		
		
		
		int [] num = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		
		
		System.out.println(solution(num, num.length));
	}

	public static double solution(int num[], int numbers_len) {
	    double answer = 0;
	    double sum = 0;
	    
	    for(int i = 0; i < numbers_len ; i++) {
	    	sum = sum + num[i];
	    }
	    answer = sum / numbers_len ;
	    
	    return answer; 
	}

}
