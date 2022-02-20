import java.util.*;

class marathon_lv1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> athletes = new HashMap<>();
        for (String p: participant) {
            athletes.put(p, athletes.getOrDefault(p, 0) + 1);
        }
        for (String p: completion) {
            athletes.put(p, athletes.get(p)-1);
        }
        for (String p: athletes.keySet()) {
            if (athletes.get(p) == 1) {
                return p;
            }
        }
        return answer;
    }
}