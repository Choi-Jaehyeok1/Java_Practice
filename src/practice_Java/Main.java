package practice_Java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
		// 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
		// 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
		// 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를
		// return하도록 solution 함수를 완성해주세요.

		int[]sides = {1,2,3};
		int return_answer = solution(sides);
		System.out.println(return_answer);

	}

	public static int solution(int[] sides) {
		int answer = 0;
		int maxside = 0;
		
		for(int i = 0; i < sides.length; i++) {
			for(int j = i+1; j<sides.length; j++) {
				if(sides[j] > sides[i]) {
					maxside = sides[j];
					sides[j] = sides[i];
					sides[i] = maxside;
				}
			}
		}
		
		if(sides[0] < sides[1] + sides[2]) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		return answer;

	}

}
