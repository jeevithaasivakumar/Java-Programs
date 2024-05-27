//  Find the longest continuous substring where all characters are unique.
public class lengthof_longest_substring_without_repeating_cchar {
    public static void main(String[] args) {
        String str = "abccabcdeba";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < str.length(); j++) {
                if (visited[str.charAt(j)] == true)
                    break;
                else {
                    count = Math.max(count, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        System.out.println(count);
    }
}
// a b c c a b c d e b a
// f
// i, j
