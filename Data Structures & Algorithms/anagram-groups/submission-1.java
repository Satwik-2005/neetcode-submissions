class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            int[] count = new int[26];

            for(char c : word.toCharArray())
                count[c - 'a']++;

            StringBuilder sb = new StringBuilder();
            
            for(int c : count)
                sb.append(c).append('#');

            map.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}