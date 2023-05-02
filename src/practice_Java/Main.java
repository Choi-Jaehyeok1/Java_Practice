package practice_Java;

public class Main {
	public static void main(String[] args) {

		// 문자열 my_string이 매개변수로 주어질 때, 
		// 대문자는 소문자로 소문자는 대문자로 변환한 
		// 문자열을 return하도록 solution 함수를 완성해주세요.
		

		
		String my_string = "CCCcccdddDDD";
        
		String return_answer = solution( my_string);
		System.out.println(return_answer);
	}

	public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++) {
            String ABC= "";
        	if(Character.isUpperCase(my_string.charAt(i))) {
        		ABC = "" + my_string.charAt(i);
        		answer += ABC.toLowerCase();
        	} else {
        		ABC = "" + my_string.charAt(i);
        		answer += ABC.toUpperCase();
        	}
        }
        
        return answer;
	}

}
