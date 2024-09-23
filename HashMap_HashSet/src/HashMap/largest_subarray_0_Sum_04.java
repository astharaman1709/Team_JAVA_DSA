package HashMap;

import java.util.HashMap;

public class largest_subarray_0_Sum_04 {  //O(n)
    int zeroSumLargestSubarray(int[]arr,int n){
        HashMap<Integer,Integer>map=new HashMap<>();

        //prefixsum,index
        int maxLen = 0,prefSum = 0;
        map.put(0,-1);
        for(int i = 0; i < arr.length; i++){
            prefSum += arr[i];
            if (map.containsKey(prefSum)){
                maxLen = Math.max(maxLen,  i - map.get(prefSum));
            }else{
                map.put(prefSum,i);
            }
        }
        return maxLen;
    }
}
