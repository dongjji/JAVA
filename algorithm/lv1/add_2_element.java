import java.util.*;

public class add_2_element
{
    public int[] solution(int[] numbers) {
        int[] result = new int[201];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                result[numbers[i] + numbers[j]] = 1;
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}