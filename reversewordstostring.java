public class reversewordstostring{
    public static void main(String[] args) {
        String input = "hello jeevi hai   how ";
        // String reversed;
        String[] words = input.split("\\s");
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i > 0){
                reversed.append(" ");
            }
        }
        System.out.print(reversed.toString());
    }
}