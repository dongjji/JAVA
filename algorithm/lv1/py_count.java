class py_count {
  boolean solution(String s) {
      int p = 0, y = 0;
      char lowerP = "p".charAt(0);
      char upperP = "P".charAt(0);
      char lowerY = "y".charAt(0);
      char upperY = "Y".charAt(0);
      
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if ((c == lowerP) || (c == upperP)) {
              p++;
          } else if ((c == lowerY) || (c == upperY)) {
              y++;
          }
      }
      return p == y;
  }
}

class py_count_refactor {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
