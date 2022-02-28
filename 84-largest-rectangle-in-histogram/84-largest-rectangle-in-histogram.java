class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> st = new Stack<>();
        int area = 0, start = 0;
        for(int i = 0; i < heights.length; i++) {
            start = i;
            while(!st.empty() && st.peek().height > heights[i]) {
                Pair p = st.pop();
                int height = p.height, index = p.index;
                area = Math.max(area, height*(i-index));
                start = index;
            }
            st.push(new Pair(start, heights[i]));
        }
        
        while(!st.empty()) {
            Pair p = st.pop();
            int height = p.height, index = p.index;
            area = Math.max(area, height*(heights.length-index));
        }
        
        return area;
    }
}

class Pair {   
    int index;
    int height;
    Pair(int i, int h) {
        height = h;
        index = i;
    }
}