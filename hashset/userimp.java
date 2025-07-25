package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class userimp {
     public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.print(set);
        sc.close();
    }
}
