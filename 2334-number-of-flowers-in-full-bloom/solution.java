class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
      TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int[] fl: flowers) {
            map.put(fl[0], map.getOrDefault(fl[0], 0) + 1);
            map.put(fl[1]+1, map.getOrDefault(fl[1]+1, 0) - 1);
        }
        for(int k : map.keySet()){
            if(map.lowerEntry(k)==null) continue;
            map.put(k, map.get(k)+map.lowerEntry(k).getValue());
        }
        int[] res = new int[people.length];
        for(int i=0;i<people.length;i++)
            res[i] = (map.floorEntry(people[i])==null)?0:map.floorEntry(people[i]).getValue();
        return res;
    }
}
