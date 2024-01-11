public class L_1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];

        for(int i=0; i<nums.length/2; i++){
            arr1[i] = nums[i]; 
        }
        for(int i=0; i<nums.length/2; i++){
            arr2[i] = nums[n+i]; 
        }

        int arr3[] = new int[nums.length];

        for(int i=0; i<arr3.length; i=i+2){
            arr3[i] = arr1[i/2] ;
            arr3[i+1] = arr2[i/2];
        }

        return arr3;
    }
    
}
