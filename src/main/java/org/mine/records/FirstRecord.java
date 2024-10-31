package org.mine.records;

record FirstRecord(TrieNode[] children) implements TrieNode{
    FirstRecord(){
        this(new TrieNode[26]);
    }
}
