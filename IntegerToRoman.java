public class HelloWorld{
    public static String integerToRoman(int value){
        String[] numerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i=0;
        while(value>0){
            if(value-values[i]>=0){
                result.append(numerals[i]);
                value=value-values[i];
            }
            else{
            i++;    
            }
        }
        
        return result.toString();
    }
     public static void main(String []args){
        System.out.println(HelloWorld.integerToRoman(24));
     }
}
