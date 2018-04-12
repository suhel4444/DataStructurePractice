public class FindKthLargestElement{
    
    public static int findKthLargest(int[] nums, int k){
        if(nums.length == 0 ) return Integer.MAX_VALUE;
        return findKthLargest(nums,0,nums.length-1,nums.length-k);
        
    }
    
    public static int findKthLargest(int[] nums, int start,int end, int k){
        if(start>end) return Integer.MAX_VALUE;
        int pivot=nums[end];
        int left=start;
        for(int i=start;i<end;i++){
            if(nums[i]<=pivot){
                swap(nums,left++,i);
            }
        }
        swap(nums,left,end);
        if(left == k){
            return nums[k];
        }
        else if(left < k){
            return findKthLargest(nums,left+1,end,k);
        }
        else{
            return findKthLargest(nums,start,left-1,k);
        }
    }
    
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
     public static void main(String []args){
        int arr[] ={3,7,6,10,9,2};
        System.out.println(findKthLargest(arr,4));
     }
}
