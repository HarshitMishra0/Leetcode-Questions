import java.util.ArrayList;
import java.util.List;

public class L_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int count = 0;

        for(int i=0; i<num.length; i++){
            count = count*10 + num[i];
        }

        int update = count + k;
        int rev = 0;
        int len = 0;
        while(update>0){
            int temp = update%10;
            rev = rev*10 + temp;
            update = update/10;
            len++;
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i= 0; i<len; i++){
            int temp = rev%10;
            arr.add(temp);
            rev = rev/10;
        }

        return arr;
        
    }
}
