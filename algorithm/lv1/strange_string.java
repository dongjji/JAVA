class strange_string {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String literal = s.substring(i, i+1);
            if (literal.equals(" ")) {
                count = 0;
                answer += " ";
            } else {
                answer += count % 2 == 0 ? literal.toUpperCase() : literal.toLowerCase();
                count++;
            }
        }
        return answer;
    }
}