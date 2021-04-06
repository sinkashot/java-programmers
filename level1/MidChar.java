package programmers.level1;

public class MidChar {
    public static void main(String[] args) {
        String s = "abcdefg";
        // String s = "qwer";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        int sLength = s.length();

        if (sLength % 2 == 0) {
            //짝수
            answer += s.charAt((sLength/2)-1);
            answer += s.charAt(sLength/2);
        } else {
            //홀수
            answer += s.charAt(sLength/2);
        }

        return answer;
    }
}
