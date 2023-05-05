package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// 문자열 my_string이 매개변수로 주어질 때,
		// my_string 안에 있는 숫자만 골라 오름차순
		// 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

		String my_string = "hi12392";
		int[] return_answer = solution(my_string);
		
		for(int i = 0 ; i < return_answer.length; i++) {
			System.out.println(return_answer[i]);
		}
	}

	public static int[] solution(String my_string) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < my_string.length(); i++) {
			if (0 <= (int) (my_string.charAt(i) - '0') && (int) (my_string.charAt(i) - '0') <= 9) {
				list.add((int) (my_string.charAt(i) - '0'));
			}
		}
		
		int [] answer = new int [list.size()]; 
		for(int i = 0; i< list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		Arrays.toString(answer);

		return answer;
	}

}
