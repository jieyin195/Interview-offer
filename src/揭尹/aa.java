package 揭尹;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Jline on 2019/3/8.
 */
public class aa{
    public static void main( String[] args ) {
        int[] nums = {0,0,0,0};

        for(List<Integer> list: threeSum(nums)){
                System.out.println(list);
            }
    }
            public static List<List<Integer>> threeSum(int[] nums) {
//                Arrays.sort(nums);
//                List<List<Integer>> Biglist = new ArrayList<List<Integer>>();
//                int n = nums.length;
//                for(int i = 0 ; i < n-2 ;i ++){
//                    if(i>0 && nums[i]==nums[i-1])
//                        continue;
//                    int sum = 0 - nums[i];
//                    for(int j =i+1; j< n-1 ; j++){
//                        for(int z = j+1 ; z<n ; z++){
//                           if(nums[j]+nums[z]==sum){
//                               Biglist.add(Arrays.asList(nums[i],nums[j],nums[z]));
//                               if(nums[j]!=nums[z]){
//                                   while(i<n-1&&nums[i]==nums[i+1])
//                                       i++;
//                                   while(j<n-1&&nums[j]==nums[j+1])
//                                       j++;
//                                   while(z<n-1&&nums[z]==nums[z+1])
//                                       z++;
//                               }else{
//                                   while(z<n-1&&nums[z]==nums[z+1])
//                                       z++;
//                                   j=z;
//                                   break;
//                               }
//                           }
//                        }
//                    }
//                }
//                return Biglist;
            Arrays.sort(nums);
            List<List<Integer>> ls = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案

                    int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
                    while (l < r) {
                        if (nums[l] + nums[r] == sum) {
                            ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                            while (l < r && nums[l] == nums[l + 1]) l++;
                            while (l < r && nums[r] == nums[r - 1]) r--;
                            l++;
                            r--;
                        } else if (nums[l] + nums[r] < sum) {
                            while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
                            l++;
                        } else {
                            while (l < r && nums[r] == nums[r - 1]) r--;
                            r--;
                        }
                    }
                }
            }
            return ls;
        }
}
