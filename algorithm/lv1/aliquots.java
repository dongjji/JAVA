public class aliquots {
  public int solution(int left, int right) {
      int answer = 0;
      for (int i = left; i <= right; i++) {
        int countOfAliquots = countAliquots(i);
        answer += (countOfAliquots % 2 == 0) ? i : -i;
      }
      return answer;
  }
  
  public static int countAliquots(int num) {
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
