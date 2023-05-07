package practice_Java;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {

		// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
		// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 
		// return하도록 solution 함수를 완성해주세요.
		
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		ArrayList<Integer> re_answer = solution(n, numlist);
		System.out.println(re_answer);
	}

	public static ArrayList<Integer> solution(int n, int[] numlist) {
		
		ArrayList<Integer>answer = new ArrayList<Integer>();
		
        for(int i = 0 ; i < numlist.length; i++) {
        	if( numlist[i] % n == 0) {
        		answer.add(numlist[i]);
        	}
        }
        
        return answer;
        
	}

}
