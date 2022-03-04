import java.util.ArrayList;

class keypad_kakao {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        ArrayList<int[]> phone = new ArrayList<int[]>();
        int[] zero = {3, 1};
        phone.add(zero);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i == 3 && j == 1) continue;
                int[] arr = {i, j};
                phone.add(arr);
            }
        }
        int left = 10;
        int right = 11;
        
        for (int num: numbers) {
            if (num == 1 || num == 4 || num == 7) {
                left = num;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                right = num;
                answer += "R";
            } else {
                int leftDistance = distance(phone.get(left), phone.get(num));
                int rightDistance = distance(phone.get(right), phone.get(num));
                
                if (leftDistance == rightDistance) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left = num;
                    } else {
                        answer += "R";
                        right = num;
                    }
                    
                } else if (leftDistance > rightDistance) {
                    right = num;
                    answer += "R";
                } else if (leftDistance < rightDistance) {
                    left = num;
                    answer += "L";
                }
            }
        }
        
        return answer;
    }
    
    public Integer distance(int[] currentPoint, int[] nextPoint) {
        int x = Math.abs(currentPoint[0] - nextPoint[0]);
        int y = Math.abs(currentPoint[1] - nextPoint[1]);
        return x + y;
    }
}