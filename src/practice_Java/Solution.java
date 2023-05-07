package practice_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {

		// 정수 배열 numbers가 매개변수로 주어집니다. 
		// numbers의 원소 중 두 개를 곱해 만들 수 있는 
		// 최댓값을 return하도록 solution 함수를 완성해주세요.

		int[] numbers = {1,2,-3,4,-5};
		int re_answer = solution(numbers);
		System.out.println(re_answer);
	}

	public static int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i = 0; i< numbers.length; i++) {
        	for(int j = i+1; j< numbers.length; j ++) {
        		num.add(numbers[i]*numbers[j]);
        	}
        }
        answer = Collections.max(num);
        
        return answer;
        
        
        

	}

}
