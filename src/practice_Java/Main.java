package practice_Java;

public class Main {
	public static void main(String[] args) {

		//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 
		//마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
		
		int common[] = {1,2,3,4};
		
		
		
		solution(common, common.length);
		
	}
	// common_len은 배열 common의 길이입니다.
	public static int solution(int common[], int i) {
		
	    int answer = 0;
	    
	    int d;
	    
	    if(common[1]-common[0] == common[2]-common[1]) {
	    	d = common[1] = common[0];
	    	answer = common[i-1]+d;
	    } else {
	    	d = common[1]/common[0];
	    	answer = common[i-1]*d;
	    }
	    
	    return answer;
	}
}
