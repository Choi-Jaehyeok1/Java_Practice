package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 문자열 my_string이 매개변수로 주어집니다. 
		// my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

		String my_string = "aAb1B2cC34oOp";
		int return_answer = solution(my_string);
		System.out.println(return_answer);
//		for(int i = 0; i < return_answer.length; i++) {
//			System.out.println(return_answer[i]);
//		}
	}

	public static int solution(String my_string) {
        int answer = 0;
        String[] change = my_string.replaceAll("[^\\d]", "").split("");
        for(int i = 0; i < change.length; i++) {
        	answer = answer + Integer.parseInt(change[i]);
        }
        
        return answer;
	}

}
