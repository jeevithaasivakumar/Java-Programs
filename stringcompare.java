// There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

// Example

// StringList=[‘ab’,’ab’,’abc’]

// Queriers=[‘ab’,’abc’,’bc’]

// There are 2 instances of ‘ab’, 1 of ‘abc’ and 0 of ‘bc’'. For each query, add an element to the return array, results=[2,1,0]


public class stringcompare {
    public static int[]matchingStrings(String[] strings, String[] queries){
        int[] ans= new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count =0 ;
            for(int j=0; j<strings.length; j++){
                if(queries[i].equals(strings[j])){
                    count++;
                }
            }
            ans[i]= count;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] strings = { "apple", "banana", "orange", "banana", "apple" };
        String[] queries = { "apple", "banana", "cherry" };

        int[] results = matchingStrings(strings, queries);
        
        System.out.println("Matching String Counts:");
        for (int i = 0; i < queries.length; i++) {
            System.out.println(queries[i] + ": " + results[i]);
        }
    }
}
