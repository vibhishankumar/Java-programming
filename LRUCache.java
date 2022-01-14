class LRUCache {
    class Node{
        Node prev,next;
        int key,value;
        Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    Node head=new Node(0,0),tail=new Node(0,0);
    int capacity;
    Map<Integer,Node> mp=new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(mp.containsKey(key))
        {
            Node temp=mp.get(key);
            remove(temp);
            insert(temp);
            return temp.value;
        }else{
            return -1;
        }
    
        
    }
    
    public void put(int key, int value) {
    
        if(mp.containsKey(key))
        {
            remove(mp.get(key));
        }
        if(mp.size()==capacity)
        {
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    private void insert(Node node)
    {
        mp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    private void remove(Node node)
    {
        mp.remove(node.key);
        
        node.prev.next=node.next;
        node.next.prev=node.prev;
            
    }
}
// ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
// [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
// Output
// [null, null, null, 1, null, -1, null, -1, 3, 4]
