public class L_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                
                if(nums[i]>nums[j]){
                   count = count +1;
                    
                }
                
            }
            arr[i] = count;
        }

        return arr;
    }
}
