class aliquots_add {
  public int solution(int n) {
      int answer = 0;
      for (int i = 1; Math.pow(i, 2) <= n; i++) {
          if (Math.pow(i,2) == n) {
              answer += i;
              break;
          }
          if (n % i == 0) {
              answer += n/i + i;
          }
      }
      return answer;
  }
}