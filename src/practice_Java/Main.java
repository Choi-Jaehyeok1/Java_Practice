package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 
		// return하도록 solution 함수를 완성해주세요

		int n = 1234;
		int return_answer = solution(n);
		System.out.println(return_answer);
//		for(int i = 0; i < return_answer.length; i++) {
//			System.out.println(return_answer[i]);
//		}
	}

	public static int solution(int n) {
        int answer = 0;
        String n2 = Integer.toString(n);
        int[] n3 = new int [n2.length()];
        for(int i = 0; i < n2.length(); i++) {
        	n3[i] = n2.charAt(i) - '0';
        }
        
        for(int i = 0; i< n3.length; i++) {
        	answer = answer + n3[i];
        }
        return answer;
	}

}
