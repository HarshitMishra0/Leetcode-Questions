import java.util.ArrayList;
import java.util.List;

public class L_1431 {
     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int[] newCandies = new int[candies.length];

        int max = 0;

        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }            
        }

        for(int i=0; i<candies.length; i++){
            newCandies[i] = candies[i] + extraCandies;            
        }

        ArrayList<Boolean> result = new ArrayList<Boolean>();

        for(int i=0; i<candies.length; i++){
            if(newCandies[i]>=max){
                result.add(true);
            } else{
                result.add(false);
            }
                
        }

        return result;
        
    }
}
