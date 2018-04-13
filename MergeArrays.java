public class MergeArrays{
    public static int[] mergeTwoSortedArrays(int[] a, int[] b, int aLength,int bLength){
        int aIndex = aLength-1;
        int bIndex = bLength-1;
        int mergeIndex =aLength + bLength -1;
        while(aIndex>=0 && bIndex>=0){
            if(a[aIndex] > b[bIndex]){
                a[mergeIndex]=a[aIndex];
                aIndex--;
            }
            else{
                a[mergeIndex]=b[bIndex];
                bIndex--;
            }
            mergeIndex--;
        }
        
        while(bIndex>=0){
            a[mergeIndex]=b[bIndex];
            bIndex--;
            mergeIndex--;
        }
        return a;
    }
     public static void main(String []args){
        int[] firstArray = {1,3,5,0,0,0};
        int[] secondArray = {2,4,6};
        int[] result = mergeTwoSortedArrays(firstArray,secondArray,3,3);
        for(int x:result){
            System.out.println(x);
        }
     }
}
