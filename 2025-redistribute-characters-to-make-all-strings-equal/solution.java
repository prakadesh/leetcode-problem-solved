class Solution {
    public boolean makeEqual(String[] words) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        int wordCount = words.length;
        for (int count : charCount.values()) {
            if (count % wordCount != 0) {
                return false;
            }
        }
        return true;
    }
}
