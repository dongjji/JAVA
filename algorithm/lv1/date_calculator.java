class date_calculator {
  public String solution(int a, int b) {
      int days = -1;
      int[] month_to_day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      String[] dates = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      for (int i = 0; i < a; i++) {
          days += month_to_day[i];
      }
      days += b;
      return dates[days%7];
  }
}