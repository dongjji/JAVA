import java.util.*;

class string_array_sort {
    public ArrayList<String> solution(String[] strings, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        Arrays.sort(strings);
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0; i < strings.length; i++) {
            String criteria = strings[i].substring(n, n+1);
            if (!hm.containsKey(criteria)) {
                ArrayList<String> arr = new ArrayList<String>();
                hm.put(criteria, arr);
            }
        }
        
        for (int i = 0; i < strings.length; i++) {
            String criteria = strings[i].substring(n, n+1);
            hm.get(criteria).add(strings[i]);
        }
        
        String[] sortedKeys = new String[hm.size()];
        List<String> keyList = new ArrayList<String>(hm.keySet());
        for (int i = 0; i < keyList.size(); i++) {
            sortedKeys[i] = keyList.get(i);
        }
        Arrays.sort(sortedKeys);
        for (String key: sortedKeys) {
            for (String str: hm.get(key)) {
                answer.add(str);
            }
        }
        return answer;
    }
}

// refactoring

class string_array_sort2 {
  public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<String>(){
          @Override
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n)) return 1;
              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
              else if(s1.charAt(n) < s2.charAt(n)) return -1;
              else return 0;
          }
      });
      return strings;
  }
}