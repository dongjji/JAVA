import java.util.*;

class budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (total + d[i] <= budget) {
                total += d[i];
                answer += 1;
            }
        }
        return answer;
    }
}