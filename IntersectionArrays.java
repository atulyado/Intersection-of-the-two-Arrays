import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums1){
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<Integer>();
        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] finalResult = new int[result.size()];
            int i =0;
            for(int num : result){
                finalResult[i++] = num;
            }
        return finalResult;
    }
}