import java.util.*;

class Solution {
    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int count;
    }

    public ArrayList<String> findPrefixes(String[] arr) {
        TrieNode root = new TrieNode();

        for (String s : arr) {
            TrieNode node = root;
            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                if (node.child[idx] == null) {
                    node.child[idx] = new TrieNode();
                }
                node = node.child[idx];
                node.count++;
            }
        }

        ArrayList<String> ans = new ArrayList<>();

        for (String s : arr) {
            TrieNode node = root;
            StringBuilder prefix = new StringBuilder();
            for (char c : s.toCharArray()) {
                node = node.child[c - 'a'];
                prefix.append(c);
                if (node.count == 1) {
                    break;
                }
            }
            ans.add(prefix.toString());
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna