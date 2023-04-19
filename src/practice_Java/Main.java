package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
		// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

		int[] arr = {1, 1, 2, 2, 1, 3, 4, 1};
		int n = 1;
		
		System.out.println(solution(arr, n));
	}

	public static int solution(int[] arr, int n) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				count ++;
			}
		}
		;
		return count;
	}

}
