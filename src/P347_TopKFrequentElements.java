package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr= new int[nums.length];
        int j=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer i: map.keySet()){
            if(map.get(i)>=k){
                arr[j++]=i;
            }
        }
        return Arrays.copyOf(arr,j);
    }


    public static void main(String[] args) {
        P347_TopKFrequentElements p = new P347_TopKFrequentElements();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] arr= p.topKFrequent(nums, 2);
        System.out.println(Arrays.toString(arr));
    }
}
