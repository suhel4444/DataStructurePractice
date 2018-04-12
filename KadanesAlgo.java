public class KadanesAlgo{
    public static int maxSumSubArray(int[] input){
        int max_so_far=0;
        int current_max=0;
        for(int i=0;i<input.length;i++){
            current_max+=input[i];
            if(current_max<0){
                current_max=0;
            }
            max_so_far=Math.max(max_so_far,current_max);
        }
        return max_so_far;
    }
     public static void main(String []args){
        System.out.println("Hello World");
        int [] arr = {1,2,3,-3,20};
        System.out.println(maxSumSubArray(arr));
     }
}
