// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;

class Solution {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 5};
    HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
    hm.put(1, 0.3);
    hm.put(2, 0.1);
    hm.put(3, 0.4);
    hm.put(4, 0.9);
    hm.put(5, 0.8);

    Arrays.sort(arr, new Comparator<Integer>() {
      public int compare(Integer idx1, Integer idx2) {
          return Double.compare(hm.get(idx1), hm.get(idx2));
      }
    });

    System.out.println(Arrays.toString(arr));
  }
}