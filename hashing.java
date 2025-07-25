import java.util.*;
public class hashing {

    public static void main(String[] args) {
        HashMap<String, Integer> hash=new HashMap<>();
        // insertion
        hash.put("India", 120);
        hash.put("USA", 100);
        hash.put("CHINA", 150);
        System.out.println(hash);
        hash.put("CHINA", 155);
        System.out.println(hash);
        // search operations
        if (hash.containsKey("India")) {
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
        System.out.println(hash.get("India"));
        System.out.println();
    }
}