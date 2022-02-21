import java.util.*;

class gym_clothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i = 1; i <= n; i++) {
            hm.put(i, 1);
        }
        
        for (int p: lost) {
            hm.put(p, hm.get(p) - 1);
        }
        
        for (int p: reserve) {
            hm.put(p, hm.get(p) + 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (hm.get(i) == 2) {
                if (i > 1 && hm.get(i-1) == 0) {
                    hm.put(i-1, hm.get(i-1) + 1);
                    hm.put(i, hm.get(i) - 1);
                } else if (i < n && hm.get(i+1) == 0) {
                    hm.put(i+1, hm.get(i+1) + 1);
                    hm.put(i, hm.get(i) - 1);
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (hm.get(i) >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}