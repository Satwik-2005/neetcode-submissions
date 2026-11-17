class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = str.length();
        System.out.println(str);

        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;

            i += 1;
            j -= 1;
        }

        return true;
    }
}
