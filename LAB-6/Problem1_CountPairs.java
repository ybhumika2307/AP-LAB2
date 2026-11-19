/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

public class Problem1_CountPairs {

    public static int countPairsWithDifference(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int count = 0;

        for (int x : arr) {
            if (set.contains(x + k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = countPairsWithDifference(arr, k);

        System.out.println(result);

        sc.close();
    }
}
