package Medium;

import java.util.List;

class _748_
{
    private class TrieNode {
        TrieNode[] edges;
        boolean endOfWord;

        TrieNode() {
            edges = new TrieNode[26];
            endOfWord = false;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode(), node;

        for (String word : dictionary) {
            node = root;

            for (char c : word.toCharArray()) {
                TrieNode child = node.edges[c - 'a'];

                if (child == null) {
                    child = new TrieNode();
                    node.edges[c - 'a'] = child;
                }

                node = child;
            }

            node.endOfWord = true;
        }

        StringBuilder result = new StringBuilder();

        for (String word : sentence.split(" ")) {
            node = root;

            for (int i = 0; i < word.length(); i++) {
                node = node.edges[word.charAt(i) - 'a'];

                if (node == null) {
                    result.append(word + " ");
                    break;
                }

                else if (node.endOfWord) {
                    result.append(word.substring(0, i + 1) + " ");
                    break;
                }
            }

            if (node != null && !node.endOfWord)
                result.append(word + " ");
        }

        return result.toString().trim();
    }
}