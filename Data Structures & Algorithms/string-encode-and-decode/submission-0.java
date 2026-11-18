public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append length, a delimiter, and the actual string
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // 1. Find the position of the '#' delimiter
            int delimiterIndex = s.indexOf('#', i);
            
            // 2. Parse the length of the next string
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            
            // 3. Extract the exact substring using that length
            int start = delimiterIndex + 1;
            int end = start + length;
            result.add(s.substring(start, end));
            
            // 4. Move pointer to the start of the next encoded chunk
            i = end;
        }

        return result;
    }
}
