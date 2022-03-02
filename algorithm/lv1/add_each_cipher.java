public class add_each_cipher {
    public int solution(int n) {
        String[] s = Integer.toString(n).split("");
        int answer = 0;
        for (int i = 0; i < s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}