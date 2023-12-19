class StockPrice {
    
    Map<Integer, Integer> map;
    PriorityQueue<int[]> maxPq;
    PriorityQueue<int[]> minPq;
    int currentTimestamp = 0;

    public StockPrice() {
        map = new HashMap<>();
        maxPq = new PriorityQueue<>((a, b) -> (b[1] - a[1]));   
        minPq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
    }
    
    public void update(int timestamp, int price) {
        map.put(timestamp, price);
        maxPq.add(new int[]{timestamp, price});
        minPq.add(new int[]{timestamp, price});
        currentTimestamp = Math.max(timestamp, currentTimestamp);
    }
    
    public int current() {
        return map.get(currentTimestamp);
    }
    
    public int maximum() {
        while (!maxPq.isEmpty()) {
            int[] val = maxPq.poll();
            if (val[1] == map.get(val[0])) {
                maxPq.add(new int[] {val[0], val[1]});
                return val[1];
            } 
        }
        return 0;
    }
    
    public int minimum() {
        while (!minPq.isEmpty()) {
            int[] val = minPq.poll();
            if (val[1] == map.get(val[0])) {
                minPq.add(new int[] {val[0], val[1]});
                return val[1];
            } 
        }
        return 0;
    }
}
