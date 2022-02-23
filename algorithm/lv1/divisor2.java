class divisor2 {
  public int solution(int n) {
      int answer = 0;
       if (n % 2 == 1) {
           answer = 2;
       } else {
           for (int i = 3; i <= n-1; i += 2) {
               if (n % i == 1) {
                   answer = i;
                   break;
               }
           }
       }
      return answer;
  }
}