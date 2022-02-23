import java.util.*;

class divisor {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num: arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        } else {
            Collections.sort(list);    
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}