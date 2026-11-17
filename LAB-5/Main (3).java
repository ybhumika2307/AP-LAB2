/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        long N = sc.nextLong();

        HashMap<Long, List<String>> map = new HashMap<>();

        for (long a = 1; a * a * a <= N; a++) {
            for (long b = a; a * a * a + b * b * b <= N; b++) {

                long sum = a * a * a + b * b * b;

                map.putIfAbsent(sum, new ArrayList<>());

                map.get(sum).add("(" + a + "," + b + ")");
            }
        }

        List<Long> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (long sum : keys) {
            if (map.get(sum).size() >= 2) {

                System.out.print(sum + " = ");

                for (String pair : map.get(sum)) {
                    System.out.print(pair + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
