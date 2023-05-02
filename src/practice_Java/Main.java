package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
		// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 
		// t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
		

		
		int n = 100;
		int t = 3;
		int return_answer = solution(n,  t);
		System.out.println(return_answer);
	}

	public static int solution(int n, int t) {
        int answer = 0;
        int n2 = 1;
        for(int i = 1; i <= t; i++) {
        	n2 = n2*2;
        }
        answer = n * n2;
        
        return answer;
	}

}
