class Solution {
    public int findSpecialInteger(int[] arr) 
    {
        int length = arr.length;
        int max = length / 4;
        int cnt = 1;
        int cur = arr[0];
        for(int i = 1 ; i < length ; i++)
        {
            if(arr[i] == cur)
            {
                cnt++;
            }
            else
                cnt = 1;
            if(cnt > max)
                return arr[i];
            cur = arr[i];
        }
        return cur;
    }
}
