class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        Node[] t = new Node[n];
        int ret = 0;
        for(int i=0;i<n;i++)
        {
            t[i] = new Node();
            for(int j=0;j<i;j++)
            {
                Long diff = (long)nums[i]-(long)nums[j];
                if(t[j].m3.containsKey(diff) || t[j].mno3.containsKey(diff))
                {
                    t[i].m3.put(diff, t[i].m3.getOrDefault(diff, 0)+
                                        t[j].m3.getOrDefault(diff, 0)+
                                        t[j].mno3.getOrDefault(diff, 0));
                    

                    t[i].mno3.put(diff, t[i].mno3.getOrDefault(diff, 0)+1);
                }
                else
                {
                    t[i].mno3.put(diff, t[i].mno3.getOrDefault(diff, 0)+1);
                }
            }
            for(Long k:t[i].m3.keySet())
                ret += t[i].m3.get(k);
        }
        return ret;
    }
}

class Node
{

    public Map<Long, Integer> m3;
    public Map<Long, Integer> mno3;
    public Node()
    {
        m3 = new HashMap<>();
        mno3 = new HashMap<>();
    }
}
