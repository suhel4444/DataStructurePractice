public class findMaxOccNumber{

     public static void main(String []args){
        int[] test ={1,1,1,4,4,5,5,2,2,1};
        System.out.println(findMaxOcc(test));
     }
     
     
     static int findMaxOcc(int[] arr) {
       if(arr == null || arr.length==0){
           throw new IllegalArgumentException("Invalid Input");
       }
       int maxCount=1;
       int maxOcc=arr[0];
       
       for(int i=1,count=1; i<arr.length;i++){
           while(i < arr.length && arr[i-1]== arr[i]){
               count++;
               i++;
           }
           if(count>maxCount){
               maxCount=count;
               maxOcc=arr[i-1];
           }
           count =1;
       }
       return maxOcc;
    }
}
