public class L_832 {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] arr = new int[image.length][image.length];
        int n = image[0].length;

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                arr[i][j]= image[i][n-j-1];             
            }
        }

        int[][] arr1 = new int[image.length][image.length];

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
               if(arr[i][j]==0){
                   arr1[i][j] = 1;
               }else if(arr[i][j]==1){
                   arr1[i][j] = 0;
               }

            }
        }
        return arr1;
        
    }
    
}
