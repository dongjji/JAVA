class ternary_to_decimal {
  public int solution(int n) {
      String ternary_num = decimal_to_ternary_reverse(n);
      int answer = ternary_to_decimal(ternary_num);
      return answer;
  }
  
  public String decimal_to_ternary_reverse(int num) {
      String answer = "";
      for (int i = 0; num >= 3; i++) {
          answer += num % 3;
          num = num / 3;
      }
      if (num != 0) {
          answer += num;
      }
      return answer;
  }
  public int ternary_to_decimal(String ternary_num) {
    return Integer.parseInt(ternary_num, 3);        
  }
  // public int ternary_to_decimal(String ternary_num) {
  //     int result = 0;
  //     for (int i = 0; i < ternary_num.length(); i++) {
  //         int cipher = ternary_num.length() - i - 1;
  //         int a = Integer.parseInt(ternary_num.substring(cipher, cipher+1));
  //         result += a * Math.pow(3, i);
  //     }
  //     return result;
  // }
}