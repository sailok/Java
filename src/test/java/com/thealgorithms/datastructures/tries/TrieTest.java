package com.thealgorithms.datastructures.tries;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTest {
    private static final List<String> WORDS = List.of("apple", "app", "rest", "rent", "rental");

    @Test
    void searchInTrieSuccess() {
        Trie trie = new Trie();

        for (String word : WORDS) {
            trie.insert(word);
        }

        Assertions.assertTrue(trie.search("app"));
        Assertions.assertTrue(trie.search("apple"));
        Assertions.assertFalse(trie.search("apply"));
    }

    @Test
    void startsWithPrefixInTrieSuccess() {
        Trie trie = new Trie();

        for (String word : WORDS) {
            trie.insert(word);
        }

        Assertions.assertTrue(trie.startsWith("app"));
        Assertions.assertTrue(trie.startsWith("re"));
        Assertions.assertTrue(trie.startsWith("rent"));
        Assertions.assertFalse(trie.startsWith("bike"));
    }
}
