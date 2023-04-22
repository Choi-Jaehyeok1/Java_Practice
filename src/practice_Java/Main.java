package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수가 담긴 리스트 num_list가 주어질 때, 
		// num_list의 원소 중 짝수와 홀수의 개수를 담은 
		// 배열을 return 하도록 solution 함수를 완성해보세요.

		int[] num_list = {1,2,3,4,5,6,7,8,15};
		int[] return_count_num = solution(num_list);
		System.out.println(return_count_num);
		
	}

	public static int[] solution(int[] num_list) {
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < num_list.length; i++) {
        	if(num_list[i] % 2 == 0) {
        		count1++;
        	} else {
        		count2++;
        	}
        }
        
        int[] answer = {count1, count2};

        	
        return answer;
    }
}
