class string_basic {
  public boolean solution(String s) {
      if (s.length() != 4 && s.length() != 6) {
          return false;
      }
      try {
          int answer = (int) Integer.parseInt(s);
          return true;
      } catch (NumberFormatException e) {
          return false;
      }
  }
}