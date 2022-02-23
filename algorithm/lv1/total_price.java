class total_price {
  public long solution(int price, int money, int count) {
      long totalCount = (count * (count + 1)) / 2;
      long answer = price*totalCount-money > 0 ? price*totalCount-money : 0;
      return answer;
  }
}