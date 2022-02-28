import java.util.Arrays;
import java.util.Collections;

class string_sort {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return String.join("", arr);
    }
}