class Trie {
    private Node root;
    class Node{
        public char c;
        public boolean isWord;
        public Node[] child;
        public Node(char c)
        {
            this.c=c;
            isWord=false;
            child=new Node[26];
        }
    }

    public Trie() {
        root=new Node('\0');
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(curr.child[c-'a']==null)
                curr.child[c-'a']=new Node(c);
            curr=curr.child[c-'a'];
        }
        curr.isWord=true;
        
    }
    
    public boolean search(String word) {
        Node node=getNode(word);
        return node!=null&&node.isWord;
        
    }
    
    public boolean startsWith(String prefix) {
        return getNode(prefix)!=null;
        
    }
    private Node getNode(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
          char c=word.charAt(i) ;
              if(curr.child[c-'a']==null) return null;
            curr=curr.child[c-'a'];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
