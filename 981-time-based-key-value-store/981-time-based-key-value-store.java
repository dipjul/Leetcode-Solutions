class TimeMap {
    class Pair {
        int timestamp;
        String value;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<Pair>> mp;

    public TimeMap() {
        mp = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!mp.containsKey(key)) {
            mp.put(key, new ArrayList<>());
        }
        mp.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        String ans = "";
        if (!mp.containsKey(key)) {
            return ans;
        }
        List<Pair> list = mp.get(key);

        int index = binarSearch(list, timestamp);
        if (index == -1) {
            return ans;
        }

        ans = list.get(index).value;
        return ans;
    }

    private int binarSearch(List<TimeMap.Pair> list, int timestamp) {
        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).timestamp == timestamp) {
                return mid;
            } else if (list.get(mid).timestamp < timestamp) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

}


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */