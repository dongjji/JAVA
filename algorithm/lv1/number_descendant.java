import java.util.Arrays;
import java.util.Collections;

class number_descendant {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.valueOf(String.join("", arr));
    }
} 