class root {
  public double solution(long n) {
      double answer = -1;
      double number = Math.sqrt(n);
      if (number % 1 == 0) {
          answer = Math.pow((int) number+1, 2);
      }
      return answer;
  }
}