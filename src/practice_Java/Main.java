package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
		// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 
		// 배열을 return 하도록 solution 함수를 완성해보세요.
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int num1 = 2;
		int num2 = 5;
		int[] solution_num = solution(numbers, num1, num2);

		for(int i = 0; i < solution_num.length; i++) {
			System.out.printf("%d\n", solution_num[i]);
		}
	}

	    public static int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int [num2+1 - num1];
	        
	        int count = 0;
	        for(int i = num1; i <= num2; i++) {
	        	answer[count] = numbers[i];
        		count ++;
	        }
	        
	        return answer;
	    }
}
