package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 
		// 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
		
		int age = 40;
		
		System.out.println(solution(age));
	}
public static int solution(int age) {
		
		int year = 2022;
	
	    return year - age + 1; // 1살을 더 더해주는 것은 우리 나이 기준이 태어난 시점에서 1살이기 때문
	}
	
}
