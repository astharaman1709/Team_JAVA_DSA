package HashMap;

import java.util.HashMap;

public class Two_Sum_03 { //O(n2)
    public int[] twoSum(int[]arr, int target){
        int n = arr.length;
        int[]ans={-1};

        //value,Index
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i<n; i++){
//            for (int j=i+1;j<n;j++){//O(n2)
//                if (arr[j]==target-1){
//                    ans = new int[]{i,j};
//                    return ans;
//                }
//            }
            int partner = target - arr[i];//O(nlogn)
            if(map.containsKey(partner)){
                ans = new int[]{i,map.get(partner)};
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}
