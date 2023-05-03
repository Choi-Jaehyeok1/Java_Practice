package practice_Java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 가위는 2 바위는 0 보는 5로 표현합니다.
		// 가위 바위 보를 내는 순서대로 나타낸 문자열
		// rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를
		// 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

		String rsp = "502";
		String return_answer = solution(rsp);
		System.out.println(return_answer);
	}

	public static String solution(String rsp) {
		String answer = "";
		for(int i = 0; i<rsp.length(); i++) {
			if(rsp.split("")[i].equals("0")) {
				answer += "5";
			} else if(rsp.split("")[i].equals("5")) {
				answer += "2";
			} else {
				answer += "0";
			}
		}

		return answer;
	}

}
