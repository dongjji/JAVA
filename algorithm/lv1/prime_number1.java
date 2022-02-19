package lv1;

class prime_number1 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int total = nums[i] + nums[j] + nums[k];
                    if (isPrime(total)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int num) {
        for (int i = 2; Math.pow(i,2) <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
