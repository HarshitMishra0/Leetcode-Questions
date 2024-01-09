import java.util.ArrayList;
import java.util.Arrays;

public class L_75 {
    public void sortColors(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                arr.add(0);
            }
            
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                arr.add(1);
            }
            
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                arr.add(2);
            }
            
        }

        for(int i=0; i<nums.length; i++){
            nums[i]= arr.get(i);
        }

         System.out.println(Arrays.toString(nums));
    }
}
