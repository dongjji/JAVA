class reverse_natural_number {
    public int[] solution(long n) {
        String[] arr = Long.toString(n).split("");
        int[] answer = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            answer[arr.length-i-1] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}