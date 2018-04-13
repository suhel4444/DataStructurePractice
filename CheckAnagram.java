public class CheckAnagram{
    public static boolean checkAnagram(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        int[] first_freq=calculateFrequency(first);
        int[] second_freq=calculateFrequency(second);
        for(int i=0; i<first_freq.length;i++){
            if(first_freq[i] != second_freq[i]){
                return false;
            }
        }
        return true;
    }
    public static int[] calculateFrequency(String str){
        int[] frequencies = new int[128];
        for(int i=0;i<str.length();i++){
            frequencies[str.charAt(i)]++;
        }
        return frequencies;
    }
     public static void main(String []args){
         String one = "abcdef";
         String two = "fedabc";
         System.out.println(checkAnagram(one,two));
}
}
