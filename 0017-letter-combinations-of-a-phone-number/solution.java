class Solution {
    static String[] a = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;

        List<String> nums = new ArrayList<>();
        for(int i=0; i<digits.length(); i++)
            nums.add(a[digits.charAt(i) - '0']);

        add(ans, nums);
        return ans;
    }

    private void add(List<String> ans, List<String> nums) {
        if(nums.size() == 1) {
            for (char k : nums.get(0).toCharArray())
                ans.add(new StringBuilder().append(k).toString());
        } else if(nums.size() == 2) {
                for(char a : nums.get(0).toCharArray()) {
                    for(char b : nums.get(1).toCharArray()) {
                        ans.add(new StringBuilder().append(a).append(b).toString());
                    }
                }
        } else if(nums.size() == 3) {
                for(char a : nums.get(0).toCharArray()) {
                    for(char b : nums.get(1).toCharArray()) {
                        for(char c : nums.get(2).toCharArray()) {
                            ans.add(new StringBuilder().append(a).append(b).append(c).toString());
                        }
                    }
                }
        } else {
                for(char a : nums.get(0).toCharArray()) {
                    for(char b : nums.get(1).toCharArray()) {
                        for(char c : nums.get(2).toCharArray()) {
                            for(char d : nums.get(3).toCharArray()) {
                                ans.add(new StringBuilder().append(a).append(b).append(c).append(d).toString());
                            }
                        }
                    }
                }
        }
    }
}
