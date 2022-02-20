// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;

class Solution {
  public static void main(String[] args) {
    int left = 13;
    int right = 17;
    int answer = 0;
    for (int i = left; i <= right; i++) {
      int countOfAliquots = aliquots(i);
      answer += (countOfAliquots % 2 == 0) ? i : -i;
    }
    System.out.println(answer);
  }

  public static int aliquots(int num) {
    int count = 0;
    for (int i = 1; Math.pow(i, 2) <= num; i++) {
      if (Math.pow(i, 2) == num) {
        count += 1;
        break;
      }
      if (num % i == 0) {
        count += 2;
      }
    }
    return count;
  }
}