import java.util.*;

public class entryset {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("India", 120);
        map.put("USA", 100);
        map.put("CHINA", 150);
        for(Map.Entry<String,Integer> mp : map.entrySet()){
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
        map.remove("CHINA");
        System.out.println(map);
    }
}
