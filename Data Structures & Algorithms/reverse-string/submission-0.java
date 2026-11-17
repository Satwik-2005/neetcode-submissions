class Solution {

    private void swap(char[] str, int a, int b) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

    public void reverseString(char[] str) {
        int n = str.length;

        int i = 0;
        int j = n - 1;

        while(i < j) {
            swap(str, i, j);
            
            i += 1;
            j -= 1;
        }
    }
}