class recommend_id {
    public String solution(String new_id) {
        String recId = new_id;
        recId = recId
            .toLowerCase() // 1
            .replaceAll("[^-_.a-z0-9]", "") // 2
            .replaceAll("[.]{2,}", ".") // 3
            .replaceAll("^[.]|[.]$", ""); // 4
        if (recId.length() == 0) { // 5
            recId = "a";
        }
        recId = recId.length() >= 16 ? recId.substring(0, 15) : recId; // 6
        recId = recId.replaceAll("[.]$", ""); // 6
        recId += recId.length() <= 2 ? recId.substring(recId.length()-1, recId.length()).repeat(3 - recId.length()) : "";
        return recId;
    }
}