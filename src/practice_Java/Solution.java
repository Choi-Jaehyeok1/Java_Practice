package practice_Java;

public class Solution {
	public static void main(String[] args) {

		// 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
		// my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 
		// return 하도록 solution 함수를 완성해보세요.

		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String re_answer = solution(my_string, num1, num2);
		System.out.println(re_answer);
//		for(int i = 0; i<re_answer.length; i++) {
//			System.out.println(re_answer[i]);
//		}
		
	}

	public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String [] re_string = my_string.split("");
        String a = null;
        a = re_string[num1];
        re_string[num1] = re_string[num2];
        re_string[num2] = a;
        
        for(int i = 0; i<re_string.length; i++) {
        	answer += re_string[i];
        }
        
        return answer;
        
	}

}
