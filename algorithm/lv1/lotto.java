class lotto {
  public int[] solution(int[] lottos, int[] win_nums) {
      int[] answer = {0, 0};
      int[] result = {0, 0};
      int randomCount = 0;
      for (int i = 0; i < lottos.length; i++) {
          if (lottos[i] == 0) {
              randomCount += 1;
              continue;
          }
          for (int j = 0; j < win_nums.length; j++) {
              if (lottos[i] == win_nums[j]) {
                  result[0] += 1;
              }
          }
      }
      // result: [최악, 최고]
      // answer: [최고일때 등수, 최소일때 등수]
      result[1] = result[0] + randomCount;
      answer[0] = this.lottoRank(result[1]);
      answer[1] = this.lottoRank(result[0]);
      return answer;
  }
  
  public int lottoRank(int hitCounts) {
      return hitCounts <= 1 ? 6 : 7 - hitCounts;
  }
}