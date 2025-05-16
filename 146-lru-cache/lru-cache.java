class LRUCache {
int cap;
Map<Integer,Node> cache;
Node old;
Node latest;

    public LRUCache(int capacity) {
        cap=capacity;
        cache=new HashMap<>();
        old=new Node(0,0);
        latest=new Node(0,0);
        old.next=latest;
        latest.prev=old;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;

    }
    void insert(Node node){
        Node prev=latest.prev;
        Node next=latest;
        prev.next=next.prev=node;
        node.prev=prev;
        node.next=next;

    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node nn=new Node(key,value);
        cache.put(key,nn);
        insert(nn);
        if(cache.size()>cap){
            Node lru=old.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
class Node{
    int key,val;
    Node prev,next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */