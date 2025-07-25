package hashset;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // System.out.println(set);
        // // search
        // if (set.contains(1)) {
        //     System.out.println("Contains 1");
        // }
        // if (!set.contains(6)) {
        //     System.out.println("Not contain");
        // }
        // // size
        // System.out.println("Size of set is "+ set.size());

        // iterator in set

        Iterator it = set.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // for(int val : set){
        //     System.out.println(val);
        // }
    }
}
