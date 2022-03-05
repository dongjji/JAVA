class uclead {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
    
    public int gcd(int num1, int num2) {
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                return num2;
            } else {
                return gcd(num2, num1 % num2);
            }
        } else {
            if (num2 % num1 == 0) {
                return num1;
            } else {
                return gcd(num1, num2 % num1);
            }
        }
    }
    
    public int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }
}

// refactoring

class refactoring_uclead {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m, answer[0]);
        return answer;
    }
    
    public int gcd(int num1, int num2) {
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                return num2;
            } else {
                return gcd(num2, num1 % num2);
            }
        } else {
            if (num2 % num1 == 0) {
                return num1;
            } else {
                return gcd(num1, num2 % num1);
            }
        }
    }

    public int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }
    
    public int lcm(int num1, int num2, int gcd_val) {
        return num1 * num2 / gcd_val;
    }
}