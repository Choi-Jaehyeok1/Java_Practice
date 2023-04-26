package practice_Java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 정수 n이 매개변수로 주어질 때, 
		// n 이하의 홀수가 오름차순으로 담긴 배열을 
		// return하도록 solution 함수를 완성해주세요.

		int n = 15;
		int[] return_answer = solution(n);
//		System.out.println(return_answer);
		for(int i = 0; i < return_answer.length; i++) {
			System.out.println(return_answer[i]);
		}
	}

	public static int[] solution(int n) {
		int a;
		if(n % 2 == 0) {
			a = n/2;
		} else {
			a = n/2 + 1;
		}
		
        int[] answer = new int [a];
        int count = 0;
        for(int i = 1; i <= n; i++) {
        	if(i%2 != 0) {
        		answer[count] = i;
        		count++;
        	}
        }
        Arrays.sort(answer);
        
        return answer;
	}

}
