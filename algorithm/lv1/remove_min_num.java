class remove_min_num {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) {
          int[] fail = {-1};
          return fail;
      }
      int[] answer = new int[arr.length-1];
      int min = Integer.MAX_VALUE;
      int min_index = 0;
      for (int i = 0; i < arr.length; i++) {
          if (min > arr[i]) {
              min = arr[i];
              min_index = i;
          }
      }
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
          if (i == min_index) continue;
          answer[count] = arr[i];
          count++;
      }
      return answer;
  }
}