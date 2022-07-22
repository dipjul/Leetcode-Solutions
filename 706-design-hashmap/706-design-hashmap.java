class MyHashMap {
    List<List<int[]>> store;
    int size = 1000;
    public MyHashMap() {
        store = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            store.add(new ArrayList<>());
        }
        for(int i = 0; i < size; i++) {
            store.get(i).add(new int[]{-1,-1});
        }
    }
    
    public void put(int key, int value) {
        List<int[]> bucket = store.get(getLocation(key));
        for(int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i)[0] == key) {
                bucket.get(i)[1] = value;
                return;
            }
        }
        bucket.add(new int[]{key, value});
    }
    
    public int get(int key) {
        List<int[]> bucket = store.get(getLocation(key));
        for(int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i)[0] == key) {
                return bucket.get(i)[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        List<int[]> bucket = store.get(getLocation(key));
        int ind = -1;
        for(int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i)[0] == key) {
                ind = i;
                break;
            }
        }
        if(ind != -1)
            bucket.remove(ind);
    }
    
    private int getLocation(int num) {
        return num%size;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */