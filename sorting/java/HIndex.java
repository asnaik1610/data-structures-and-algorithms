package sorting.java;

public class HIndex {
    public static int hIndex(int[] citations) {

        int N = citations.length;
        int[] count = new int[N + 1];

        for (int x : citations) {
            if (x >= N) { // h-index can never be > N
                count[N]++;
            } else {
                count[x]++; // frequency count
            }
        }

        int total = 0;
        for (int i = N; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }
        return 0;

        // 1st approach -> optimization problem | 1110/1115
        // Integer[] modifiedCitations =
        // Arrays.stream(citations).boxed().toArray(Integer[]::new);
        // Arrays.sort(modifiedCitations, Collections.reverseOrder());
        // int res = 0;
        // for (int i = 0; i < modifiedCitations.length; i++) {
        // if (modifiedCitations[i] >= (i + 1)) {
        // res = i + 1;
        // } else {
        // break; // no need to check further
        // }
        // }
        // return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 5, 3, 1 };
        int res = hIndex(arr);
        System.out.println(res);
    }
}
