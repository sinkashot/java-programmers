package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class biggerNumber {
    public static void main(String[] args) {
        // int[] numbers = {10, 2, 6};
        // int[] numbers = {0, 0, 0};
        int[] numbers = {100, 1, 52};

        System.out.println(solution(numbers));
    }   

    public static String solution(int[] numbers) {
        String answer = "";        
        
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        System.out.println(Arrays.toString(result));

        Arrays.sort(result, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            };
        });

        answer = result[0].equals("0") ? result[0] : String.join("",result);

        return answer;
    }
}
