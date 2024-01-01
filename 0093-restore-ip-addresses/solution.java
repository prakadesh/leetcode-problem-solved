class Solution {
    private boolean isValid(String s) {
        if(s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }

    private void helper(String s, int idx, List<String> res, List<String> list) {
        if(list.size() == 4) {
            if(idx == s.length()) {
                res.add(String.join(".", list));
            }
            return;
        }


        for(int i = idx; i < s.length() && i < idx+3; i++) {
            String sub = s.substring(idx, i+1);
            if(isValid(sub)) {
                list.add(sub);
                helper(s, i+1, res, list);
                list.remove(list.size()-1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(s, 0, res, new ArrayList<>());
        return res;
    }


}
