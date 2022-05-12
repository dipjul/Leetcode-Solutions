class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';

            if (curr.node[ind] != null) {
                curr = curr.node[ind];
            } else {
                curr.node[ind] = new TrieNode();
                curr = curr.node[ind];
            }
        }
        curr.end = true;
    }

    public boolean search(String word) {
        return trivialSearch(word, root);
    }

    private boolean trivialSearch(String word, TrieNode root) {
        TrieNode curr = root;
        if (curr == null)
            return false;
        if (word.length() == 0)
            return curr.end;
        boolean ans = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (int j = 0; j < 26; j++) {
                    if (curr.node[j] != null) {
                        ans = trivialSearch(word.substring(i + 1), curr.node[j]);
                        if (ans)
                            return true;
                    }
                }
                return false;
            } else {
                int ind = ch - 'a';
                if (curr.node[ind] != null)
                    curr = curr.node[ind];
                else
                    return false;
            }
        }
        return curr.end;
    }

    class TrieNode {
        TrieNode[] node = new TrieNode[26];
        boolean end;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */