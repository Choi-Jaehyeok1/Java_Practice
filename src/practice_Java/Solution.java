package practice_Java;

public class Solution {
	public static void main(String[] args) {

		// 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
		// 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 
		// return하도록 solution 함수를 완성해주세요.


		
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		 int[] re_answer = solution(numbers, direction);
//		System.out.println(re_answer);
		
		for(int i = 0; i<re_answer.length; i++) {
			System.out.println(re_answer[i]);
		}
		
		
	}

	public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        if(direction.equals("right")) {
        	for(int i = 0 ; i < numbers.length-1; i++) {
        		answer[i+1] = numbers[i];
        	}
        	answer[0] = numbers[numbers.length-1];
        } else {
        	for(int i = 1 ; i < numbers.length; i++) {
        		answer[i-1] = numbers[i];
        	}
        	answer[numbers.length-1] = numbers[0];
        }
        
        return answer;
        
	}

}
