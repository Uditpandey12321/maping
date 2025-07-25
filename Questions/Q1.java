package Questions;
import java.util.*;
/* 
Majority element

 Given an Integer array of size n, find all elements that will appear more than floor value of n/3 times
 nums [] ={1,3,2,5,1,3,1,5,1}
1
nums[] = {1,2}
1,2 
  */

public class Q1 {
    public static void majority(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1 );

            }
            else{
                map.put(nums[i],1 );
            }
            for(int key : map.keySet()){
                if (map.get(key)> n/3) {
                    System.out.println(key);
                }
            }
        }
    }
    public static void main(String[] args) {
      //int  nums [] ={1,3,2,5,1,3,1,5,1};
      int nums[]={1,2};
      majority(nums);
    }
}
