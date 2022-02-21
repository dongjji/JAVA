import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class test {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<Integer>();
        int[] answerMember = {0, 0, 0};
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            int[] problem = {i % p1.length, i % p2.length, i % p3.length};
            if (p1[problem[0]] == answers[i]) {
                answerMember[0] += 1;
            }
            if (p2[problem[1]] == answers[i]) {
                answerMember[1] += 1;
            }
            if (p3[problem[2]] == answers[i]) {
                answerMember[2] += 1;
            }
        }
        int max = Arrays.stream(answerMember).max().getAsInt();
        for (int i = 0; i < answerMember.length; i++) {
            if (answerMember[i] == max) {
                result.add(i+1);
            }
        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}