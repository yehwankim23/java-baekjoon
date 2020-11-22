package l07.p10845;

class IntNode {
    private IntNode next;
    private IntNode prev;
    private Integer integer;
    
    public IntNode() {
        this(null);
    }
    
    public IntNode(Integer integer) {
        next = null;
        prev = null;
        this.integer = integer;
    }
    
    public IntNode getNext() {
        return next;
    }
    
    public void setNext(IntNode intNode) {
        next = intNode;
    }
    
    public IntNode getPrev() {
        return prev;
    }
    
    public void setPrev(IntNode intNode) {
        prev = intNode;
    }
    
    public Integer getInt() {
        return integer;
    }
    
    public String toString() {
        return integer.toString();
    }
}
