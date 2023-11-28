class Solution {
    //To store both idx and value
    static class Pair implements Comparable<Pair>{
        int val, idx;
        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val; // for descending order.
        }
    }
    public int[] maxSlidingWindow(int[] A, int k) {
        int n = A.length, ans[] = new int[n-k+1], x = 0;
        PriorityQueue<Pair>pq = new PriorityQueue<>();//Stores idx & val as object

        for(int i=0; i<k; i++){
            pq.add(new Pair(A[i],i));
        }
        ans[x++] = pq.peek().val; // max val from first window
        
        for(int i=k; i<n; i++){
            while(!pq.isEmpty() && pq.peek().idx <= i-k){ // remove idx that are out of bound
                pq.remove();
            }
            pq.add(new Pair(A[i],i)); // add new pair to Pq
            ans[x++] = pq.peek().val; // add max val
        }
        return ans;
    }
}
