class StreamChecker {
    private class TrieNode{
        private TrieNode[] children=null;
        private boolean isLeaf;
        public TrieNode()
        {
            children=new TrieNode[26];
        }
        
    }
    private TrieNode root=null;
    private StringBuilder queryStr=null;

    public StreamChecker(String[] words) {
        root=new TrieNode();
        queryStr=new StringBuilder();
        for(String word:words)
        {
            addWord(word);
        }
        
    }
    private void addWord(String word)
    {
        TrieNode it=root;
        for(int i=word.length()-1;i>=0;i--)
        {
            char c=word.charAt(i);
            int index=c-'a';
            if(it!=null && it.children[index]==null)
            {
                TrieNode newNode=new TrieNode();
                it.children[index]=newNode;
            }
            it=it.children[index];
        }
        it.isLeaf=true;
    }
    
    public boolean query(char letter) {
        queryStr.append(letter);
        return search(queryStr.toString());
        
    }
    private boolean search(String queryStr)
    {
        TrieNode it=root;
        for(int i=queryStr.length()-1;i>=0;i--)
        {
            char c =queryStr.charAt(i);
            int index=c-'a';
            if(it!=null && it.children[index]!=null)
            {
                it=it.children[index];
                if(it.isLeaf)
                {
                    return true;
                }
                
             }
            else{
                return false;
            }
            
        }
        return false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */

// Input
// ["StreamChecker", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query"]
// [[["cd", "f", "kl"]], ["a"], ["b"], ["c"], ["d"], ["e"], ["f"], ["g"], ["h"], ["i"], ["j"], ["k"], ["l"]]
// Output
// [null, false, false, false, true, false, true, false, false, false, false, false, true]

// Explanation
// StreamChecker streamChecker = new StreamChecker(["cd", "f", "kl"]);
// streamChecker.query("a"); // return False
// streamChecker.query("b"); // return False
// streamChecker.query("c"); // return False
// streamChecker.query("d"); // return True, because 'cd' is in the wordlist
// streamChecker.query("e"); // return False
// streamChecker.query("f"); // return True, because 'f' is in the wordlist
// streamChecker.query("g"); // return False
// streamChecker.query("h"); // return False
// streamChecker.query("i"); // return False
// streamChecker.query("j"); // return False
// streamChecker.query("k"); // return False
// streamChecker.query("l"); // return True, because 'kl' is in the wordlist
