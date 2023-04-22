package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
		// 피자를 나눠먹을 사람의 수 n이 주어질 때,
		// 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한
		// 피자의 수를 return 하는 solution 함수를 완성해보세요.

		int people = 15;
		int return_pizza = solution(people);
		System.out.println(return_pizza);
		
	}

	public static int solution(int n) {
		int pizza = 7;
		
		double pizzas = (double)n/(double)pizza;
		
		return (int) Math.ceil(pizzas);
	}
}
