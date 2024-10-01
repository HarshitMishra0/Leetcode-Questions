public class L_2416 {
    class TrieNode {
        TrieNode[] children;
        int count;

        TrieNode() {
            children = new TrieNode[26];
            count = 0;
        }
    }

    class Trie {
        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
                node.count++;
            }
        }

        public int getPrefixScore(String word) {
            TrieNode node = root;
            int score = 0;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                node = node.children[index];
                score += node.count;
            }
            return score;
        }
    }

    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int n = words.length;
        int[] result = new int[n];

        for (String word : words) {
            trie.insert(word);
        }
        for (int i = 0; i < n; i++) {
            result[i] = trie.getPrefixScore(words[i]);
        }

        return result;
    }
}
