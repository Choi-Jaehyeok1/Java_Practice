package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 문자열 str1, str2가 매개변수로 주어집니다. 
		// str1 안에 str2가 있다면 1을 없다면 2를 
		// return하도록 solution 함수를 완성해주세요.

		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		int return_answer = solution(str1, str2);
		System.out.println(return_answer);
//		for(int i = 0; i < return_answer.length; i++) {
//			System.out.println(return_answer[i]);
//		}
	}

	public static int solution(String str1, String str2) {
        int answer = 0;
        
        if(str1.contains(str2)) {
        	answer = 1;
        } else {
        	answer =2;
        }
        
        return answer;
	}

}
