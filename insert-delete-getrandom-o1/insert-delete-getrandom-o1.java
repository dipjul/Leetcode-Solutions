class RandomizedSet {

    private HashSet<Integer> st;
    private ArrayList<Integer> arr;
    public RandomizedSet() {
        st = new HashSet();
        arr = new ArrayList();
    }
    
    public boolean insert(int val) {
        if(st.contains(val)) {
            return false;
        }
        st.add(val);
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!st.contains(val)) {
            return false;
        }
        st.remove(val);
        arr.remove(new Integer(val));
        return true;
    }
    
    public int getRandom() {
        int index = (int)(Math.random() * st.size());
        return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */