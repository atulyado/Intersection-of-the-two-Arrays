import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();//set is use for unqiue number 
        for(int num : nums1){
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<Integer>();//here we check if num2 have num1 and store it in result for unique elements
        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] finalResult = new int[result.size()];//this one covert the result set to an array
            int i =0;
            for(int num : result){
                finalResult[i++] = num;
            }
        return finalResult;
    }
}
