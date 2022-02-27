class min_rectangle {
    public int solution(int[][] sizes) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < sizes.length; i++) {
            left = Math.max(left, Math.max(sizes[i][0], sizes[i][1]));
            right = Math.max(right, Math.min(sizes[i][0], sizes[i][1]));
        }
        return left * right;
    }
}