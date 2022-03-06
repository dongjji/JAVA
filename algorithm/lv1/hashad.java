class hashad {
  public boolean solution(int x) {
      return x % sumSplit(x) == 0 ? true : false;
  }
  
  public int sumSplit(int num) {
      int result = 0;
      for (String s: Integer.toString(num).split("")) {
          result += Integer.parseInt(s);
      }
      return result;
  }
}