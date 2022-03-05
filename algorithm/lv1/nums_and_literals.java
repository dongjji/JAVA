class nums_and_literals {
    public int solution(String s) {
        int answer = 0;
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] literals = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < literals.length; i++) {
            s = s.replace(literals[i], nums[i]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}