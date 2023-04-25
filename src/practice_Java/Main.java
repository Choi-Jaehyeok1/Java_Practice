package practice_Java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
		// my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 
		// return 하도록 solution 함수를 완성해보세요.


		String my_string = "love";
		int n = 3;
		String return_answer = solution(my_string, n);
		System.out.println(return_answer);
		
	}


	public static String solution(String my_string, int n) {
        String answer = "";
        String[] array_my_string = my_string.split("");
     
		for(int i = 0; i < array_my_string.length; i++) {
			for(int j = 0; j < n; j++) {
				answer = answer + array_my_string[i];
			}
		}
        
        return answer;
    }

}
