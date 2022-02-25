class is_prime {
  public int solution(int n) {
      int answer = 0;
      int[] prime_array = new int[n+1];
      for (int i = 2; i <= n; i++) {
          if (isPrime(i)) {
              prime_array[i] = 1;
          }
      }
      
      for (int i = 2; i < prime_array.length; i++) {
          if (prime_array[i] == 1) {
              answer++;
          }
      }
      return answer;
  }
  
  public boolean isPrime(int n) {
      for (int i = 2; Math.pow(i, 2) <= n; i++) {
          if (n % i == 0) {
              return false;
          }
      }
      return true;
  }
}