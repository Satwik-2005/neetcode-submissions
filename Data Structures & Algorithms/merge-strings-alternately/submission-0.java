class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        
        int n = word1.length();
        int m = word2.length();

        int i = 0;
        int j = 0;

        while(i < n  &&  j < m) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));

            i += 1;
            j += 1;
        }

        while(i < n) {
            sb.append(word1.charAt(i));
            i += 1;
        }

        while(j < m) {
            sb.append(word2.charAt(j));
            j += 1;
        }

        return sb.toString();
    }
}