import java.util.*;

public class same_number {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int before = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != before) {
                before = arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}