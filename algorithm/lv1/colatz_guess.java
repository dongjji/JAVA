class colatz_guess {
  public int solution(int num) {
      if (num == 1) return 0;
      int count = 0;
      long number = (long) num;
      while (count <= 500) {
          number = number % 2 == 0 ? number/2 : 3*number+1;
          count++;
          if (number == 1) break;
      }
      return count > 500 ? -1 : count;
  }
}