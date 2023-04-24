package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 머쓱이네 옷가게는 10만 원 이상 사면 5%, 
		// 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
		// 구매한 옷의 가격 price가 주어질 때, 
		// 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

		int price = 1000000;
		int discount = solution(price);
		System.out.println(discount);
	}


	public static int solution(int price) {
        int answer = 0;
        
        if(100000 <= price  && price < 300000) {
        	answer = (int) (price * 0.95);
        } else if(300000 <= price  && price < 500000) {
        	answer = (int) (price * 0.90);
        } else if(500000 <= price) {
        	answer = (int) (price * 0.80);
        } else {
        	answer = price;
        }
        
        return answer;
    }

}
