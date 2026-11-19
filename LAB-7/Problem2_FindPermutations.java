import java.util.*;

public class Problem2_FindPermutations {

    public static List<Integer> findPermutations(String s, String b) {

        List<Integer> indices = new ArrayList<>();

        int n = s.length();
        int m = b.length();

        if (n > m) {
            return indices;
        }

        int[] patternFreq = new int[256];
        int[] windowFreq = new int[256];

        for (int i = 0; i < n; i++) {
            patternFreq[s.charAt(i)]++;
            windowFreq[b.charAt(i)]++;
        }

        if (Arrays.equals(patternFreq, windowFreq)) {
            indices.add(0);
        }

        for (int i = n; i < m; i++) {

            windowFreq[b.charAt(i)]++;
            windowFreq[b.charAt(i - n)]--;

            if (Arrays.equals(patternFreq, windowFreq)) {
                indices.add(i - n + 1);
            }
        }

        return indices;
    }
}