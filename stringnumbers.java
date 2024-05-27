public class stringnumbers {
    public static void main(String[] args) {
        String s = "k25kdl flkf15d fdf36f df";
        String temp = "";
        String str[] = s.split(" ");
        for(String s1:str){
            for(int i=0; i< s1.length(); i++){
                if(i ==0 || i==s1.length()-1)
                {
                    temp += String.valueOf(s1.charAt(i)).toUpperCase();
                }
                else
                {
                    temp+=s1.charAt(i);
                }
            }
        }
        System.out.println(temp);
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
            sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Sum of all digits: "+sum);
    }
}
