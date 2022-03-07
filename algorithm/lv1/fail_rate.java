import java.util.Comparator;
import java.util.Arrays;
import java.util.HashMap;

class fail_rate {
    public Integer[] solution(int N, int[] stages) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < stages.length; i++) {
            hm.put(stages[i], hm.getOrDefault(stages[i], 0) + 1);
        }
        
        double[] failRate = new double[N];
        for (int i = 0; i < failRate.length; i++) {
            int success = 0;

            for (int j = i+1; j <= N+1; j++) {
                success += hm.getOrDefault(j, 0);
            }
            failRate[i] = success == 0 ? 0 : (double) hm.getOrDefault(i+1, 0) / success;
        }
        Integer[] answer = new Integer[N];
        for (int i = 0; i < N; i++) {
            answer[i] = i+1;
        }
        System.out.println(Arrays.toString(failRate));
        Arrays.sort(answer, new Comparator<Integer>() {
            public int compare(Integer idx1, Integer idx2) {
                return Double.compare(failRate[idx2-1], failRate[idx1-1]);
            }
        });
        return answer;
    }
}