class caesar_cipher {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            answer += changeWord(arr[i], n);
        }
        return answer;
    }
    
    public String changeWord(char s, int n) {
        int ascii_to_int = (int) s;
        if (ascii_to_int == 32) {
            return " ";
        }
        if (ascii_to_int >= 97 && ascii_to_int <= 122) {
            if (ascii_to_int + n > 122) {
                ascii_to_int -= 26;
            }
        } else if (ascii_to_int >= 65 && ascii_to_int <= 90) {
            if (ascii_to_int + n > 90) {
                ascii_to_int -= 26;
            }
        }
        ascii_to_int += n;
        
        char int_to_char = (char) ascii_to_int;
        return Character.toString(int_to_char);
    }
}