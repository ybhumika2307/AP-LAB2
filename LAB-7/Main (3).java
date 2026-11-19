/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter smaller string: ");
        String s = sc.next();

        System.out.print("Enter bigger string: ");
        String b = sc.next();

        List<Integer> result =
            Problem2_FindPermutations.findPermutations(s, b);

        System.out.println("Starting indices of permutations:");

        for (int index : result) {
            System.out.println("Permutation found at index: " + index);
        }

        sc.close();
    }
}