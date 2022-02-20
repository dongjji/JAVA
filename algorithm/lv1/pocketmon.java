import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class pocketmon {
    public int solution(int[] nums) {
        System.out.println("Algorithm Start");
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int max = nums.length/2;
        for (int num: nums) {
          hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        Set<Integer> pocketmons = hm.keySet();
        max = max > pocketmons.size() ? pocketmons.size() : max;
        return max;
    }
}